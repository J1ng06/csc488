package compiler488.ast.stmt;

import compiler488.ast.ASTList;
import compiler488.ast.decl.*;

/**
 * Placeholder for the scope that is the entire program
 */
public class Program extends Scope {
    private ASTList<Declaration> declarationList;
    private ASTList<Stmt> statementList;
    
    public Program(Scope programScope) {
        this.declarationList = programScope.getDeclarations();
        this.statementList = programScope.getStatements();
    }
}
