package controller;

import items.ClypsValue;

import java.util.ArrayList;
import java.util.HashMap;

public class SymbolTableManager {
    private int currentLevel;
    private HashMap<String, Function> functionMap;
    private HashMap<String, ClypsValueLevel> symbolTable;
    private static SymbolTableManager sharedInstance = null;

    public static SymbolTableManager getInstance() {
        return sharedInstance;
    }

    static void initialize() {
        sharedInstance = new SymbolTableManager();
    }

    static void destroy() {
        sharedInstance = null;
    }

    private SymbolTableManager() {
        this.functionMap = new HashMap<>();
        this.symbolTable = new HashMap<>();
        this.currentLevel = 0;
    }

    void addLevel() {
        this.currentLevel++;
    }

    void decreaseLevel() {
        this.currentLevel--;
    }

    int getCurrentLevel() {
        return this.currentLevel;
    }

    public void registerVar(String expr, ClypsValueLevel value) {
        this.symbolTable.put(expr, value);
    }

    public void assign(String var, ClypsValueLevel data) {
        if (resolve(var) != null) {
            // There is already such a variable, re-assign it
            this.reAssign(var, data);
        } else {
            // A newly declared variable
            this.symbolTable.put(var, data);
        }
    }

    private void reAssign(String identifier, ClypsValueLevel value) {
        if (this.symbolTable.containsKey(identifier)) {
            this.symbolTable.put(identifier, value);
        } else if (this.currentLevel != 0) {
            value.setLevel(value.getLevel() - 1);
            reAssign(identifier, value);
        }
    }

    public ClypsValueLevel resolve(String var) {
        ClypsValueLevel data = this.symbolTable.get(var);
        if (data != null) {
            return data;
        } else if (this.currentLevel != 0) {
            return resolve(var);
        } else {
            return null;
        }
    }

    public ClypsValueLevel lookup(String varName, int level) {
        if (this.currentLevel >= level) {
            return this.symbolTable.get(varName);
        } else {
            editor.addCustomError("Variable does not exist in scope.", 0);
            return null;
        }

    }

    public void printAllVars() {
        this.symbolTable.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue().getValue() + " " + entry.getValue().getPrimitiveType()+ " " + entry.getValue().getLevel());
        });
    }

    public static void reset() {
        sharedInstance.symbolTable.clear();
        sharedInstance.functionMap.clear();
    }

    public void addFunction(String name, Function function) {
        this.functionMap.put(name, function);
    }

    public HashMap<String, Function> getFunctions() {
        return functionMap;
    }

    public void printAllFunctions() {
        functionMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue().toString());
        });
    }

}
