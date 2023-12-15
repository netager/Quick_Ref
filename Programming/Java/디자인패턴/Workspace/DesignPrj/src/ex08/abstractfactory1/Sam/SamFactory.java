package ex08.abstractfactory1.Sam;

import ex08.abstractfactory1.abst.BikeFactory;
import ex08.abstractfactory1.abst.Body;
import ex08.abstractfactory1.abst.Wheel;

public class SamFactory implements BikeFactory {

	@Override
	public Body createBody() {

		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		
		return new SamWheel();
	}

}
