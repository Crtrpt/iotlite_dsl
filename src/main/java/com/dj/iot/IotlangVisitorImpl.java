package com.dj.iot;

import com.dj.iot.dsl.IotlangBaseVisitor;
import com.dj.iot.dsl.IotlangParser;

import java.util.HashMap;

public class IotlangVisitorImpl<T> extends IotlangBaseVisitor<Integer> {

    HashMap<String, Object> Vars = new HashMap<>();

    @Override
    public Integer visitAssign(IotlangParser.AssignContext ctx) {
        var name = ctx.varname.getText();
        var val = visit(ctx.val);
        System.out.printf("%s 赋值 %s \r\n", name, val);
        Vars.put(name, val);
        return 0;
    }

    @Override
    public Integer visitVal(IotlangParser.ValContext ctx) {
        return Integer.valueOf(ctx.getChild(0).getText());
    }

    @Override
    public Integer visitCondition_expr(IotlangParser.Condition_exprContext ctx) {
        System.out.print("条件表达式"+ctx.op.getText());
        switch (ctx.op.getText()) {
            case ">":
                return visit(ctx.left) > (int) visit(ctx.right) ? 0 : 1;
            case ">=":
                return visit(ctx.left) >= (int) visit(ctx.right) ? 0 : 1;
            case "<":
                return visit(ctx.left) < (int) visit(ctx.right) ? 0 : 1;
            case "<=":
                return visit(ctx.left) <= (int) visit(ctx.right) ? 0 : 1;
            case "==":
                return visit(ctx.left).equals((int) visit(ctx.right)) ? 0 : 1;
            case "<>":
                return visit(ctx.left).equals((int) visit(ctx.right)) ? 1 : 0;
            case "&&":
                return (visit(ctx.left) > 0 ? true : false && visit(ctx.right) > 0 ? true : false) ? 1 : 0;
            case "||":
                return (visit(ctx.left) > 0 ? true : false || visit(ctx.right) > 0 ? true : false) ? 1 : 0;
            case "!":
                return (visit(ctx.right)) == 0 ? 1 : 0;
        }
        throw ctx.exception;
    }

    @Override
    public Integer visitArith(IotlangParser.ArithContext ctx) {
        switch (ctx.op.getText()) {
            case "+":
                return visit(ctx.left) + (int) visit(ctx.right);
            case "-":
                return visit(ctx.left) - (int) visit(ctx.right);
            case "*":
                return visit(ctx.left) * (int) visit(ctx.right);
            case "/":
                return visit(ctx.left) + (int) visit(ctx.right);
        }
        throw ctx.exception;
    }
}
