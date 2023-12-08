package ex12.visitorpattern;

import java.util.ArrayList;

import ex12.visitorpattern.concreate.VisitableA;
import ex12.visitorpattern.concreate.VisitorA;
import ex12.visitorpattern.contract.Visitable;
import ex12.visitorpattern.contract.Visitor;

public class Application {
	public static void main(String[] args) {
		
		ArrayList<Visitable> visitables = new ArrayList<Visitable>();
		
		visitables.add(new VisitableA(1));
		visitables.add(new VisitableA(2));
		visitables.add(new VisitableA(3));
		visitables.add(new VisitableA(4));
		visitables.add(new VisitableA(5));
		
		VisitorA visitor = new VisitorA();
		
		for (Visitable visitable : visitables) {
			visitable.accept(visitor);
			
		}
		
		System.out.println(visitor.getNumber());
		
		
	}

}
