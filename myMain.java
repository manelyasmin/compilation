package gen;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.Exception;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class myMain   {
    public static void main(String[] args)   {
    try {
      

        SmallLanguageLexer lexer = new SmallLanguageLexer(new ANTLRFileStream("test.SmallLanguage"));
        SmallLanguageParser parser = new SmallLanguageParser(new CommonTokenStream(lexer));
        parser.addParseListener(new SemantiqueError());
        parser.prog();
    }catch(IOException e){
        e.printStackTrace();
    }

       
    }
}
