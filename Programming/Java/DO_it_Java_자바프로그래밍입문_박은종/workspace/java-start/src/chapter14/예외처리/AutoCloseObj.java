package chapter14.예외처리;

public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {

		System.out.println("close()");
	}

}
