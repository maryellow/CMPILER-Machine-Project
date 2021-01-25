package controller;

import items.ClypsValue;

import java.util.ArrayList;
import java.util.HashMap;

public class Scope {
    private static HashMap<String, ClypsValue> varTable;
    private Scope parent;

    public Scope(){
        this(null);
    }
    public Scope(Scope p){
        varTable = new HashMap<>();
        this.parent=p;
    }

    public static void registerVar(String expr, ClypsValue value){
        varTable.put(expr,value);
    }

    public void assign(String var, ClypsValue data) {
        if (resolve(var) != null) {
            // There is already such a variable, re-assign it
            this.reAssign(var, data);
        } else {
            // A newly declared variable
            varTable.put(var, data);
        }
    }

    private void reAssign(String identifier, ClypsValue value) {
        if (varTable.containsKey(identifier)) {
            varTable.put(identifier, value);
        } else if (parent != null) {
            parent.reAssign(identifier, value);
        }
    }

    public ClypsValue resolve(String var) {
        ClypsValue data = varTable.get(var);
        if (data != null) {
            return data;
        } else if (!isClassScope()) {
            return parent.resolve(var);
        } else {
            return null;
        }
    }

    public static ClypsValue lookup(String varName){
        return varTable.get(varName);
    }

    private boolean isClassScope(){
        return parent == null;
    }

    public Scope getParent(){
        return parent;
    }


    public static ClypsValue depthFirstSearch(String varName, Scope scope){


        return null;
    }

    public static void printAllVars(){
        varTable.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue().getValue()+" "+entry.getValue().getPrimitiveType());
        });
    }

}
