package compiler488.ast;
import compiler488.ast.expn.Expn;

public class ReadableExpn implements Readable {

	private Expn varExpn;
	
	public ReadableExpn(Expn variable){
		setVarExpn(variable);
	}
	@Override
	public void prettyPrint(PrettyPrinter p) {
		// TODO Auto-generated method stub

	}
	public Expn getVarExpn() {
		return varExpn;
	}
	public void setVarExpn(Expn varExpn) {
		this.varExpn = varExpn;
	}

}
