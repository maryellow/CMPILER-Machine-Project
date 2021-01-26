package items;

import ErrorCheckers.TypeChecking;
import com.sun.org.apache.xalan.internal.xsltc.compiler.XPathParser;
import com.udojava.evalex.*;
import controller.editor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;

public class ClypsValue {
    public enum PrimitiveType{
        NOT_YET_IDENTIFIED,
        BOOLEAN,
        INT,
        CHAR,
        FLOAT,
        DOUBLE,
        STRING,
        ARRAY
    }

    private Object value;
    private PrimitiveType type;
    private boolean finalFlag = false;

    public ClypsValue(Object value, String primitiveType){
        this.value = value;
        PrimitiveType ty;
        System.out.println("Type: "+primitiveType.toLowerCase(Locale.ROOT));
        switch (primitiveType.toLowerCase(Locale.ROOT)){
            case "int":
                ty = PrimitiveType.INT;
                break;
            case "char":
                ty = PrimitiveType.CHAR;
                break;
            case "string":
                ty = PrimitiveType.STRING;
                break;
            case "float":
                ty = PrimitiveType.FLOAT;
                break;
            case "boolean":
                ty = PrimitiveType.BOOLEAN;
                break;
            case "double":
                ty = PrimitiveType.DOUBLE;
                break;
            default:
                ty = PrimitiveType.NOT_YET_IDENTIFIED;
        }
        //|| TypeChecking.checkValueType(value,ty)
        if (value != null ){
            System.out.println("IN");

            this.type = ty;
            System.out.println(ty);
            System.out.println(this.type);
            tryEvaluate(value.toString());
        }else{
            System.out.println("ERROR");
            editor.addError("Type Mismatch");
        }

    }

    public void setValue(String value){
        tryEvaluate(value);
    }

    public void setType(PrimitiveType primitiveType){
        this.type=primitiveType;
    }

    public Object getValue(){
        return this.value;
    }

    public PrimitiveType getPrimitiveType() {
        return this.type;
    }

    public void markFinal() {
        this.finalFlag = true;
    }

    public boolean isFinal() {
        return this.finalFlag;
    }

    private void tryEvaluate(String value){
        System.out.println(value);

        this.value = new Expression(value).eval().toPlainString();

        System.out.println("EVAL: "+this.value);
    }

    public static boolean checkValueType(Object value, ClypsValue.PrimitiveType primitiveType) {
        switch (primitiveType){
            case BOOLEAN:
                return value instanceof Boolean;
            case CHAR:
                return value instanceof Character;
            case INT:
                return value instanceof Integer;
            case FLOAT:
                return value instanceof Float;
            case DOUBLE:
                return value instanceof Double;
            case STRING:
                return value instanceof String;
            case ARRAY:
                return value instanceof Object;
            default:
                return false;
        }
    }

    public static Object attemptTypeCast(String value, ClypsValue.PrimitiveType primitiveType) {
        switch (primitiveType) {
            case BOOLEAN:
                return Boolean.valueOf(value);
            case CHAR:
                return Character.valueOf(value.charAt(0));
            case INT:
                return Integer.valueOf(value);
            case FLOAT:
                return Float.valueOf(value);
            case DOUBLE:
                return Double.valueOf(value);
            case STRING:
                return value;
            default:
                return null;
        }
    }
}
