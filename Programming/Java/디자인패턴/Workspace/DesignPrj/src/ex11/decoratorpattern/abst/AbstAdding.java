package ex11.decoratorpattern.abst;

abstract public class AbstAdding implements IBeverage {
	
	private IBeverage base;

	
	public AbstAdding(IBeverage base) {

		super();
		this.base = base;
	}
	
	
	@Override
	public int getTotalPrice() {
		return base.getTotalPrice();
	}
	
	
	protected IBeverage getBase() {
		return base;
	}

}
