package ex11.decoratorpattern.concreate;

import ex11.decoratorpattern.abst.AbstAdding;
import ex11.decoratorpattern.abst.IBeverage;

public class Milk extends AbstAdding {

	public Milk(IBeverage meterial) {

		super(meterial);
	}

	@Override
	public int getTotalPrice() {

		return super.getTotalPrice() + 50;
	}
	
	

}
