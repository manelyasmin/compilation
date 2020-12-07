package gen;

import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;
//SmallLanguageBaseListener

public class SemantiqueError extends SmallLanguageBaseListener{
    private static final int DECLARED = 1;
    private static final int UNDECLARED = 2;
    private static final int FLOAT = 2;
    private static final int INT = 1;
    private static final int STRING =3;
    private TableS table = new TableS();
    private LinkedList<String> errors = new LinkedList<>();
    private HashMap<String,Integer> types = new HashMap<>();
private static  int langDeclared=0;
private static  int ioDeclared=0;



    @Override public void exitParse(SmallLanguageParser.ParseContext ctx) {System.out.println("exit parse");}


  @Override public void exitBlock(SmallLanguageParser.BlockContext ctx) { }
 
    @Override public void exitProg(SmallLanguageParser.ProgContext ctx) {
                if(errors.size()==0){
            System.out.println("programme correcte ");

            for(int i=0;i<table.getSize();i++){
                System.out.println(table.getElement(i).toString());
            }
        }else{
            for(int i=0;i<errors.size();i++){
                System.out.println(errors.get(i).toString());
            }
        }

     }



    @Override public void exitBib(SmallLanguageParser.BibContext ctx) {
String str=ctx.getText();System.out.println("exitbib");
System.out.println(str);
if(str.equals("importSmall_Java.lang;")) langDeclared++;
if(str.equals("importSmall_Java.io;")) ioDeclared++;
 
     }


    @Override public void exitModificateur(SmallLanguageParser.ModificateurContext ctx) {
      String str=ctx.getText();
      
      if(str.equals("public") || str.equals("protected")){ System.out.println(str);}
      else{
        System.out.println("ERREUR SYNTAXIQUE: manque de mot cle public or protected" );}
      

     }
    

/*variable:typevar id1 variable
        |
        
        */
    @Override public void exitVariable(SmallLanguageParser.VariableContext ctx) { 
 System.out.println("exitVariable");
if(ctx.typevar()==null) {System.out.println("ERREUR SYNTAXIQUE :le type de variable manque");errors.add("manque type");}

 
    }
//|ID VR id1 | id ;
    @Override public void exitId1(SmallLanguageParser.Id1Context ctx) {
if(table.containsElement(ctx.ID().getText())) {

    System.out.println("idf double declare");
} else{
    System.out.println("ajoute idf a table sy"+table.getSize());table.addElement(new TableS.Element(ctx.ID().getText(),UNDECLARED,INT|FLOAT,3));
}

for(int i=0;i<table.getSize();i++){System.out.println(table.getElement(i).toString());}
     }

    @Override public void exitTypevar(SmallLanguageParser.TypevarContext ctx) {
        String str=ctx.getText();
        if(str.equals("In_SJ")==false && str.equals("float_SJ")==false && str.equals("string_SJ")==false){
            System.out.println("ERREEUR SYNTAXIQUE :le compilateur ne reconnu pas ce type ");
        }

    }

    @Override public void exitInstruction(SmallLanguageParser.InstructionContext ctx) { }

    @Override public void exitRead(SmallLanguageParser.ReadContext ctx) {
System.out.println("exitread");
String str=ctx.getText();System.out.println(ioDeclared);
if(ioDeclared==0) System.out.println("Absence d’une bibliothèque nécessaire "); 

     }

    @Override public void exitWrite(SmallLanguageParser.WriteContext ctx) { }

    @Override public void exitCondition(SmallLanguageParser.ConditionContext ctx) { }

    @Override public void exitAssignmet(SmallLanguageParser.AssignmetContext ctx) {
    //l affectation
    //assignmet:ID EQ exp PVR ; }
String str=ctx.getText();


 if(!table.containsElement(ctx.ID().getText()))
        {
            if(str.length()>10)  errors.add("variable " + ctx.ID().getText() + " depassement de taille autorisee " + ctx.ID().getSymbol().getLine());
            //ajouter la variable qui n est pas declare dans la table des errors
            errors.add("variable " + ctx.ID().getText() + " n est pas declare " + ctx.ID().getSymbol().getLine());
            //ajoute la variable a table des symboles
   if(str.length()<10)     table.addElement(new TableS.Element(ctx.ID().getText(),UNDECLARED,INT|FLOAT,3));
           
            for(int i=0;i<table.getSize();i++){
                System.out.println(table.getElement(i).toString());
            }
            // adding non declared variable in order to not generate same error again
        }
    }
  
@Override public void exitNegationExpr(SmallLanguageParser.NegationExprContext ctx) { }
@Override public void exitAdditionExpr(SmallLanguageParser.AdditionExprContext ctx) { }
@Override public void exitMultiplicationExpr(SmallLanguageParser.MultiplicationExprContext ctx) {
System.out.println("exitMultiplicationExpr");
String str=ctx.getText();
System.out.println(str);
 
 }
@Override public void exitAtomExpr(SmallLanguageParser.AtomExprContext ctx) { }
 /*atom: PARO <assoc =left> exp  PARF  #parExpr
      | (INTEGER | FLOAT)    #numberAtom
     
      |STRING      #stringAtom
 ;*/
@Override public void exitOrExpr(SmallLanguageParser.OrExprContext ctx) { }
@Override public void exitRelationExpr(SmallLanguageParser.RelationExprContext ctx) { }
@Override public void exitAndExpr(SmallLanguageParser.AndExprContext ctx) { }
@Override public void exitParExpr(SmallLanguageParser.ParExprContext ctx) {
System.out.println("exitParExpr");
 
 }
@Override public void exitNumberAtom(SmallLanguageParser.NumberAtomContext ctx) {
System.out.println("exit Number Atom");
String i=ctx.getText();
 System.out.println(i);
 }
@Override public void exitIdAtom(SmallLanguageParser.IdAtomContext ctx) {
    System.out.println("exitIdAtom");
    if(!table.containsElement(ctx.ID().getText()))
        {
            //ajouter la variable qui n est pas declare dans la table des errors
            errors.add("variable " + ctx.ID().getText() + "n est pas declare " + ctx.ID().getSymbol().getLine());
            //ajoute la variable a table des symboles
            table.addElement(new TableS.Element(ctx.ID().getText(),UNDECLARED,INT|FLOAT,1));
            for(int i=0;i<table.getSize();i++){
                System.out.println(table.getElement(i).toString());
            }
            // adding non declared variable in order to not generate same error again
        }
         System.out.println("exitIdAtom");

}
@Override public void exitStringAtom(SmallLanguageParser.StringAtomContext ctx) { }
@Override public void exitSentier(SmallLanguageParser.SentierContext ctx) { }
@Override public void exitSfloat(SmallLanguageParser.SfloatContext ctx) { }
@Override public void exitSstring(SmallLanguageParser.SstringContext ctx) { }
 
@Override public void exitSigne(SmallLanguageParser.SigneContext ctx) { }
@Override public void exitCond_block(SmallLanguageParser.Cond_blockContext ctx) { }

   



  





}