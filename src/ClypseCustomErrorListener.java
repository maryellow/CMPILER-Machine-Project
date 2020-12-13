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
        String error="'"+msg.split("'")[1]+"'";

        if(temp.contains("missing"))
            newMsg="missing ";
        else if(temp.contains("extraneous input"))
            newMsg="extra character/s ";
        else if(temp.contains("mismatched input"))
            newMsg="unexpected symbol ";
        else if(temp.contains("no viable alternative"))
            newMsg="change symbol ";
        else if(temp.contains("cannot find symbol"))
            newMsg="missing symbol ";
        else{
            newMsg=msg;
            error="";
        }

        System.err.println("Syntax Error on Line "+line+" [Char: "+charPositionInLine+"]: "+ newMsg +error);
    }
}
