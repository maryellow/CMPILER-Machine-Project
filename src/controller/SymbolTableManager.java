package controller;

import java.util.ArrayList;
import java.util.HashMap;

public class SymbolTableManager {
    private Scope parentScope = new Scope();
    private ArrayList<Scope> scopeTable;
    private HashMap<String,Function> functionMap;
    private static SymbolTableManager sharedInstance = null;

    public static SymbolTableManager getInstance(){
        return sharedInstance;
    }

    static void initialize(){
        sharedInstance = new SymbolTableManager();
    }

    static void destroy(){
        sharedInstance=null;
    }

    private SymbolTableManager(){
        this.scopeTable = new ArrayList<>();
        this.functionMap = new HashMap<>();
    }

    public void addScope(){
        Scope scope = new Scope();
        //this.setParent(parentScope);
        scopeTable.add(scope);
    }

    public Scope getScopeAt(int index){
        return scopeTable.get(index);
    }


    public Scope getParentScope(){
        return parentScope;
    }

    public static void reset() {
        sharedInstance.scopeTable.clear();
    }

    public void addFunction(String name, Function function){
        this.functionMap.put(name,function);
    }

    public HashMap<String,Function> getFunctions(){
        return functionMap;
    }

    public void printAllFunctions(){
        functionMap.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue().toString());
        });
    }

}
