package compiler488.ast.stmt;

import compiler488.ast.BaseAST;

/**
 * A placeholder for statements.
 */
public abstract class Stmt extends BaseAST {
	public Stmt(int line, int column) {
		super(line, column);
	}
}
