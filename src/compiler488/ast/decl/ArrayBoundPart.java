package compiler488.ast.decl;

import compiler488.ast.BaseAST;

public class ArrayBoundPart extends BaseAST{
	private Integer lb;
	private Integer ub;
	
	public ArrayBoundPart(int lb, int ub) {
		this.setLb(lb);
		this.setUb(ub);
	}

	public int getLb() {
		return lb;
	}

	public void setLb(int lb) {
		this.lb = lb;
	}

	public int getUb() {
		return ub;
	}

	public void setUb(int ub) {
		this.ub = ub;
	}
	
}
