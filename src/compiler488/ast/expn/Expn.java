package compiler488.ast.expn;

import compiler488.ast.BaseAST;
import compiler488.ast.Printable;

/**
 * A placeholder for all expressions.
 */
public abstract class Expn extends BaseAST implements Printable {
	public Expn(int line, int column) {
		super(line, column);
	}
}
