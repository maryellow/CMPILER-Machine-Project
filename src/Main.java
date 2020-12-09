import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args){
        try {
            CharStream input = (CharStream) new ANTLRFileStream("test.simpler");
            ClypsLexer lexer = new ClypsLexer(input);
            ClypsParser parser = new ClypsParser(new CommonTokenStream(lexer));
            parser.addParseListener(new ClypsCustomListener());
            parser.classDeclaration();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}