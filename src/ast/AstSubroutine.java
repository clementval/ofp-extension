package ast;

public class AstSubroutine {
  private String name;
  private ArrayList<String> arguments = null;
  private int startLine;


  public AstSubroutine(String id, ArrayList<String> args, int line){
    name = id;
    arguments = args;
    startLine = line;
  }

  public String getDeclaration(){
    String value = "! SUBROUTINE " + subroutine + " (";
    for (int i = 0; i < arguments.size(); i++) {
      if(i == arguments.size() - 1){
        value += arguments.get(i);
      } else {
        value += arguments.get(i) + ", ";
      }
    }
    value += " )";
  }
}
