package compiler488.ast.expn;

/**
 * Represents a literal integer constant.
 */
public class IntConstExpn extends ConstExpn {
	/**
	 * The value of this literal.
	 */
	private Integer value;

	public IntConstExpn(Integer value, int line, int column) {
		super(line, column);

		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	@Override
	public String toString() {
		return value.toString();
	}
}
