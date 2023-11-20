package ex08.abstractfactory1;

import ex08.abstractfactory1.Sam.SamFactory;
import ex08.abstractfactory1.abst.BikeFactory;
import ex08.abstractfactory1.abst.Body;
import ex08.abstractfactory1.abst.Wheel;
import ex08.abstractfactory1.gt.GtBikeFactory;

public class Main {

	public static void main(String[] args) {
		
		
//		BikeFactory factory = new SamFactory();
		BikeFactory factory = new GtBikeFactory();

		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();
		
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());

	}

}
