package controller;

import items.ClypsValue;

import java.util.ArrayList;
import java.util.HashMap;

public class Scope {
    private Scope parentScope;
    private HashMap<String, ClypsValue> localVariables=null;
    private ArrayList<Scope> scopeList=null;

    public Scope(){
        this.parentScope=null;
        this.localVariables = new HashMap<String, ClypsValue>();
        this.scopeList = new ArrayList<Scope>();
    }

    public Scope(Scope scope){
        this.parentScope=scope;
        this.localVariables = new HashMap<String, ClypsValue>();
        this.scopeList = new ArrayList<Scope>();
    }

    public void setParent(Scope parentScope) {
        this.parentScope = parentScope;
    }

    public void addChild(Scope scope) {
        this.scopeList.add(scope);
    }

    public boolean isParent() {
        return (this.parentScope == null);
    }

    public Scope getParent() {
        return this.parentScope;
    }

    public int getChildCount() {
        if(this.scopeList != null)
            return this.scopeList.size();
        else
            return 0;
    }

    public Scope getChildAt(int index) {
        if(this.scopeList != null)
            return this.scopeList.get(index);
        else
            return null;
    }
    
    public ClypsValue searchVariableIncludingLocal(String identifier) {
        if(this.containsVariable(identifier)) {
            return this.localVariables.get(identifier);
        }
        else {
            return null;
        }
    }

    public boolean containsVariable(String identifier) {
        if(this.localVariables!= null && this.localVariables.containsKey(identifier)) {
            return true;
        }
        else {
            return false;
        }
    }

    public void setDeclaredVariable(String identifierString, String valueString){
        if (containsVariable(identifierString)) {
            this.localVariables.get(identifierString).setValue(valueString);
        }
    }
    
    public void addEmptyVariableFromKeywords(String primitiveTypeString, String identifierString) {
        ClypsValue.PrimitiveType type=ClypsValue.translateType(primitiveTypeString);
        ClypsValue clypsValue = ClypsValue.createEmptyVariableFromKeywords(primitiveTypeString);
        clypsValue.setType(type);
        this.localVariables.put(identifierString, clypsValue);
    }
    
    public void addInitializedVariableFromKeywords(String primitiveTypeString, String identifierString, String valueString) {
        ClypsValue.PrimitiveType type=ClypsValue.translateType(primitiveTypeString);
        this.addEmptyVariableFromKeywords(primitiveTypeString, identifierString);
        ClypsValue clypsValue = this.localVariables.get(identifierString);
        clypsValue.setValue(valueString);
        clypsValue.setType(type);
    }

    public void addFinalEmptyVariableFromKeywords(String primitiveTypeString, String identifierString) {
        ClypsValue clypsValue = ClypsValue.createEmptyVariableFromKeywords(primitiveTypeString);
        clypsValue.markFinal();
        this.localVariables.put(identifierString, clypsValue);
    }

    public void addFinalInitVariableFromKeyWords(String primitiveTypeString, String identifierString, String valueString) {
        this.addEmptyVariableFromKeywords(primitiveTypeString, identifierString);
        ClypsValue clypsValue = this.localVariables.get(identifierString);
        clypsValue.setValue(valueString);
        clypsValue.markFinal();
    }

    public void addClypsValue(String identifier, ClypsValue clypsValue) {
        this.localVariables.put(identifier, clypsValue);
    }

    public void printAllVars() {
        if (parentScope!=null){
            parentScope.localVariables.entrySet().forEach(entry -> {
                if (entry.getValue().isFinal())
                    System.out.println(entry.getKey() + " " + entry.getValue().getValue() + " " + entry.getValue().getPrimitiveType()+" FINAL");
                else
                    System.out.println(entry.getKey() + " " + entry.getValue().getValue() + " " + entry.getValue().getPrimitiveType());
            });
        }

        this.localVariables.entrySet().forEach(entry -> {
            if (entry.getValue().isFinal())
                System.out.println(entry.getKey() + " " + entry.getValue().getValue() + " " + entry.getValue().getPrimitiveType()+" FINAL");
            else
                System.out.println(entry.getKey() + " " + entry.getValue().getValue() + " " + entry.getValue().getPrimitiveType());
        });
    }

}
