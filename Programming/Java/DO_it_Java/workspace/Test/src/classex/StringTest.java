package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Class strClass = Class.forName("java.lang.String");
		
		Constructor[] cons = strClass.getConstructors();
		
		for (Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println("--------------------------------");
		Field[] fields = strClass.getFields();
		
		for (Field f : fields) {
			
			System.out.println(f);
		}
		
		System.out.println("--------------------------------");
		Method[] methods = strClass.getMethods();
		
		for (Method m : methods) {
			
			System.out.println(m);
		}
		
		System.out.println("--------------------------------");
		Class pClass3 = Class.forName("java.lang.String");
		System.out.println(pClass3.getName());
		
		System.out.println("--------------------------------");
		Person p = new Person();
		
		Class pClass = Class.forName("classex.Person");
		
		Person p2 = (Person)pClass.newInstance();
		
		System.out.println("p: " + p);
		System.out.println("p2: " + p2);
		
		

	}

}
