package ast;

import java.util.ArrayList;

public class AstTypeDeclaration {

  private String typeId;
  private boolean isAllocatable;

  private ArrayList<String> declList;

  public AstTypeDeclaration(){
    declList = new ArrayList<String>();

  }



}
