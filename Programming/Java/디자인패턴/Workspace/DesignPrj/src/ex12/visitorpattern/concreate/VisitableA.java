package ex12.visitorpattern.concreate;

import ex12.visitorpattern.contract.Visitable;
import ex12.visitorpattern.contract.Visitor;

public class VisitableA implements Visitable {
	
	int numberOfMember;
	
	public VisitableA(int numberOfMember) {
		this.numberOfMember = numberOfMember;
		
	}
	

	@Override
	public void accept(Visitor visitor) {
		
		visitor.visit(this);
		
	}
}
