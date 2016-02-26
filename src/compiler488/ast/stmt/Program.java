package compiler488.ast.stmt;

import compiler488.ast.ASTList;
import compiler488.ast.decl.*;

/**
 * Placeholder for the scope that is the entire program
 */
public class Program extends Scope {

	protected Scope scope;
	public Program (Scope entireProg) {
		scope = entireProg;
	}

}
