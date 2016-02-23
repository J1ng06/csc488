package compiler488.ast.stmt;

/**
 * Placeholder for the scope that is the entire program
 */
public class Program extends Scope {
	protected Scope scope;
	public Program (Scope entireProg) {
		scope = entireProg;
	}
}
