package compiler488.ast.stmt;

import compiler488.ast.PrettyPrinter;
import compiler488.ast.expn.Expn;

/**
 * Represents an if-then or an if-then-else construct.
 */
public class IfStmt extends Stmt {
	/** The condition that determines which branch to execute. */
	private Expn condition;

	/** Represents the statement to execute when the condition is true. */
	private Stmt whenTrue;

	/** Represents the statement to execute when the condition is false. */
	private Stmt whenFalse = null;

	public IfStmt(Expn condition, Stmt whenTrue, Stmt whenFalse, int line, int column) {
		super(line, column);

		this.condition = condition;
		this.whenTrue = whenTrue;
		this.whenFalse = whenFalse;
	}

	public IfStmt(Expn condition, Stmt whenTrue, int line, int column) {
		this(condition, whenTrue, null, line, column);
	}

	public Expn getCondition() {
		return condition;
	}

	public Stmt getWhenTrue() {
		return whenTrue;
	}

	public Stmt getWhenFalse() {
		return whenFalse;
	}

	/**
	 * Print a description of the <strong>if-then-else</strong> construct. If
	 * the <strong>else</strong> part is empty, just print an
	 * <strong>if-then</strong> construct.
	 */
	@Override
	public void prettyPrint(PrettyPrinter p) {
		p.print("if ");
		condition.prettyPrint(p);
		p.println(" then");
		whenTrue.prettyPrint(p);

		if (whenFalse != null) {
			p.println(" else");
			whenFalse.prettyPrint(p);
		}

		p.println(" end");
	}
}
