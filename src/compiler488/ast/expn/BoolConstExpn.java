package compiler488.ast.expn;

/**
 * Boolean literal constants.
 */
public class BoolConstExpn extends ConstExpn {
	/** The value of the constant */
	private boolean value;

	public BoolConstExpn(boolean value, int line, int column) {
		super(line, column);

		this.value = value;
	}

	public boolean getValue() {
		return value;
	}

	@Override
	public String toString() {
		return value ? "true" : "false";
	}
}
