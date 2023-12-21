package session08.abstract_factory_pattern.ch01_抗力.sam;

import session08.abstract_factory_pattern.ch01_抗力.abst.BikeFactory;
import session08.abstract_factory_pattern.ch01_抗力.abst.Body;
import session08.abstract_factory_pattern.ch01_抗力.abst.Wheel;

public class SamFactory implements BikeFactory {

	@Override
	public Body createBody() {
		// TODO Auto-generated method stub
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		// TODO Auto-generated method stub
		return new SamWheel();
	}

}
