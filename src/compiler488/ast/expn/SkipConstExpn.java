package compiler488.ast.expn;

import compiler488.ast.Printable;

/**
 * Represents the special literal constant associated with writing a new-line
 * character on the output device.
 */
public class SkipConstExpn extends ConstExpn implements Printable {
	public SkipConstExpn(int line, int column) {
		super(line, column);
	}

	@Override
	public String toString() {
		return "newline";
	}
}
