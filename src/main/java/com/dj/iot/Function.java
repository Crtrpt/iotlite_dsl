package com.dj.iot;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Map;

public class Function {

    private Scope parentScope;
    private List<TerminalNode> params;
    private ParseTree block;

    Function(Scope parentScope, List<TerminalNode> params, ParseTree block) {
        this.parentScope = parentScope;
        this.params = params;
        this.block = block;
    }

    public IOTValue invoke(List<IOTValue> args, Map<String, Function> functions) {
        if (args.size() != this.params.size()) {
            throw new RuntimeException("Illegal Function call");
        }
        Scope scopeNext = new Scope(parentScope, true); // create function scope

        for (int i = 0; i < this.params.size(); i++) {
            IOTValue value = args.get(i);
            scopeNext.assignParam(this.params.get(i).getText(), value);
        }
        var ctx = new IotlangVisitorImpl (scopeNext,functions);

        var ret = IOTValue.VOID;
        try {
            ctx.visit(this.block);
        } catch (ReturnValue returnValue) {
            ret = returnValue.value;
        }
        return ret;
    }
}
