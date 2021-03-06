package compiler488.ast.stmt;

import compiler488.ast.ASTList;
import compiler488.ast.decl.*;

/**
 * Placeholder for the scope that is the entire program
 */
public class Program extends Scope {
	public Program (Scope scope, int left, int right){
		super(scope.getDeclarations(), scope.getStatements(),
				left, right);
	}
}
