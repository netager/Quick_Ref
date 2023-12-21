package session08.abstract_factory_pattern.ch01_����;

import session08.abstract_factory_pattern.ch01_����.abst.BikeFactory;
import session08.abstract_factory_pattern.ch01_����.abst.Body;
import session08.abstract_factory_pattern.ch01_����.abst.Wheel;
import session08.abstract_factory_pattern.ch01_����.gt.GtFactory;

public class Main {
	public static void main(String[] args) {
	
//		BikeFactory factory = new SamFactory();
		BikeFactory factory = new GtFactory();
		
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();
		
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
	}
}
