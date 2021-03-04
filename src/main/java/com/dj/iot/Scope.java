package com.dj.iot;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Scope {

    private Scope parent;

    private Map<String, Object> variables;

    private Map<String, Function> functions;

    private boolean isFunction;

    Scope() {
        // only for the global scope, the parent is null
        this(null, false);
    }

    Scope(Scope p, boolean function) {
        parent = p;
        variables = new HashMap<>();
        isFunction = function;
    }

    public void assignParam(String var, Object value) {
        variables.put(var, value);
    }

    public void assign(String var, IOTValue value) {
        if (resolve(var, !isFunction) != null) {
            // There is already such a variable, re-assign it
            this.reAssign(var, value);
        } else {
            // A newly declared variable
            variables.put(var, value);
        }
    }

    private boolean isGlobalScope() {
        return parent == null;
    }

    public Scope parent() {
        return parent;
    }

    private void reAssign(String identifier, IOTValue value) {
        if (variables.containsKey(identifier)) {
            // The variable is declared in this scope
            variables.put(identifier, value);
        } else if (parent != null) {
            // The variable was not declared in this scope, so let
            // the parent scope re-assign it
            parent.reAssign(identifier, value);
        }
    }

    public Object resolve(String var) {
        return resolve(var, true);
    }

    private Object resolve(String var, boolean checkParent) {
        return  variables.get(var);
    }
}
