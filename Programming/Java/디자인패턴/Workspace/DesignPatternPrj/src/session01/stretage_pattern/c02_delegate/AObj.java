package session01.stretage_pattern.c02_delegate;

import session01.stretage_pattern.c01_interface_.Ainterface;
import session01.stretage_pattern.c01_interface_.AinterfaceImpl;

public class AObj {

	Ainterface ainterface;
	
	public AObj() {
		ainterface = new AinterfaceImpl();
	}
	
	public void funcAA() {
		
		// �����Ѵ�
		ainterface.funcA();
		ainterface.funcA();
	}
}
