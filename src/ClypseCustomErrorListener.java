import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.Collections;
import java.util.List;

public class ClypseCustomErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        String temp = msg.split("'")[0];
        String newMsg="";
        String endMsg="";
        String error="";

        if(temp.contains("missing")) {
            newMsg = "There is a missing symbol: ";
            error =  "'"+msg.split("missing ")[1]+"'";
        }
        else if(temp.contains("extraneous input")){
            newMsg="extra character/s ";
            error="'"+msg.split("expecting ")[1]+"'";
        }
        else if(temp.contains("mismatched input")) {
            newMsg = "unexpected symbol ";
            error = "'" +msg.split("'")[1]+"'";
            endMsg = " expecting these symbols: '" + msg.split("expecting")[1]+"'";
        }
        else if(temp.contains("no viable alternative")){
            newMsg="missing/invalid characters detected in: ";
            error="'"+msg.split("'")[1]/*.substring(msg.split("'")[1].length()-1)*/+"'";
            endMsg=" on/around the '"+msg.split("'")[1].substring(msg.split("'")[1].length()-1)+"' character";
        }
        else if(temp.contains("cannot find symbol")) {
            newMsg = "symbol not found ";
            error = "'" + msg.split("'")[1] + "'";
        }
        else{
            newMsg=msg;
            error="";
        }

        System.err.println("Syntax Error on Line "+line+" [Char: "+charPositionInLine+"]: "+ newMsg +error + endMsg);
    }
}
