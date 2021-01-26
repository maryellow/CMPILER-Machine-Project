package controller;

import items.ClypsValue;

public class ClypsValueLevel extends ClypsValue {
    private int level = 0;

    public ClypsValueLevel(int level, ClypsValue value){

        super(value.getValue(),value.getPrimitiveType().toString());
        System.out.println("LEVE: " +value.getPrimitiveType().toString());
        this.level=level;
    }

    int getLevel(){
        return this.level;
    }

    void setLevel(int level){
        this.level=level;
    }
}
