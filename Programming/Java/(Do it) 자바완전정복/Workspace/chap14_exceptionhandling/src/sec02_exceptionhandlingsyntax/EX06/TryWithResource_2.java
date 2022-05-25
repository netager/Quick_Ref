package sec02_exceptionhandlingsyntax.EX06;

class A implements AutoCloseable {
	String resource;
	A(String resource) {
		this.resource = resource;
	}
	
	void abc() throws Exception {
		
	}
	
	@Override
	public void close() throws Exception {
		if(resource != null) {
			if(resource != null) {
				resource = null;
				System.out.println("리소스가 해제되었습니다.");
			}
		}
	}
}


public class TryWithResource_2 {
	public static void main(String[] args) {
		
		//#1. 리소스를 사용하고 finally에서 리소스 해결하기
		A a1 = null;
		
		try {
			a1 = new A("특정파일");
			a1.abc();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//리소스 수동 해제
			if(a1.resource != null)
				try {
					a1.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		//#2. 자동 리소스 해제
		try (A a2 = new A("특정파일");) {
			a2.abc();
		} catch (Exception e) {
			System.out.println("예외처리");
		}
	}
}