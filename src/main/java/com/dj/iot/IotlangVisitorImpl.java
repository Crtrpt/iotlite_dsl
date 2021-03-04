package com.dj.iot;

import com.dj.iot.dsl.IotlangBaseVisitor;
import com.dj.iot.dsl.IotlangParser;


import java.util.*;


public class IotlangVisitorImpl extends IotlangBaseVisitor<IOTValue> {

    private static ReturnValue returnValue = new ReturnValue();

    private Scope scope;

    private Map<String, Function> functions;

    @Override
    public IOTValue visitSelect_statement(IotlangParser.Select_statementContext ctx) {

        var ctx1 = scope.resolve(ctx.from_body.getText());

        List afterWhere = new ArrayList();

        ((List) ctx1).stream().forEach(c -> {
            //每一行执行
            var s = new Scope();
            s.assignParam("ctx", c);
            var whereTree = new IotlangVisitorImpl(s, new HashMap<>());
            var whereRes = whereTree.visit(ctx.where_body);
            if (whereRes.asBoolean()) {
                afterWhere.add(c);
            }
        });
        System.out.println("剩余的设备数量" + afterWhere.size());
        throw new RuntimeException("执行到这里了");
    }

    @Override
    public IOTValue visitADD(IotlangParser.ADDContext ctx) {
        var left = visit(ctx.left);
        var right = visit(ctx.right);
        switch (ctx.op.getText()) {
            case "==":
//                System.out.printf("比较 %s，左 %s，比较 %s, 右 %s \r\n",ctx.getText(),left,ctx.op.getText(),right);
                return new IOTValue(left.equals(right));
            case "&&":
//                System.out.printf("比较 %s，左 %s，比较 %s, 右 %s，结果 %s\r\n",ctx.getText(),left,ctx.op.getText(),right,res1);
                return new IOTValue(left.asBoolean().equals(true) && right.asBoolean().equals(true));
            default:
                throw new RuntimeException("错误");
        }
    }

    @Override
    public IOTValue visitObj_member(IotlangParser.Obj_memberContext ctx) {
        var instance = scope.resolve("ctx");
        var clazz = instance.getClass();
        try {
            return new IOTValue(clazz.getField(ctx.member.getText()).get(instance));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public IOTValue visitGET_REF_NUMBER(IotlangParser.GET_REF_NUMBERContext ctx) {
        return new IOTValue(Integer.valueOf(ctx.getText()));
    }

    @Override
    public IOTValue visitPAREN(IotlangParser.PARENContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public IOTValue visitGET_REF_STRING(IotlangParser.GET_REF_STRINGContext ctx) {
        return new IOTValue(ctx.STRING().getText().substring(1, ctx.STRING().getText().length() - 1));
    }

    public IotlangVisitorImpl(Scope scope, Map<String, Function> functions) {
        this.scope = scope;
        this.functions = new HashMap<>(functions);
    }
}
