
set(CMAKE_JAVA_INCLUDE_PATH /usr/local/lib/antlr-3.3-complete.jar /usr/local/lib/OpenFortranParser-0.8.4.jar )

add_jar(ofp-extension
  ast/AstTypeDeclaration.java
  ast/AstUseOnlyInfo.java
  ofp/FortranParserActionClaw.java
  OUTPUT_DIR ${PROJECT_BINARY_DIR}/build
)
