package ex08.abstractfactory1.gt;

import ex08.abstractfactory1.abst.BikeFactory;
import ex08.abstractfactory1.abst.Body;
import ex08.abstractfactory1.abst.Wheel;

public class GtBikeFactory implements BikeFactory {

	@Override
	public Body createBody() {

		return new GtBody();
	}

	@Override
	public Wheel createWheel() {
		return new GtWheel();
	}

}
