package ast;


public class AstUseOnlyInfo {

  private String fromValue = null;
  private String toValue = null;

  public AstUseOnlyInfo(String from, String to){
    fromValue = from;
    toValue = to;
  }

  public boolean hasRename(){
    if(toValue == null){
      return false;
    }
    return true;
  }

  public String toString(){
    if(hasRename()){
      return fromValue + "=>" + toValue;
    }
    return fromValue;
  }
}
