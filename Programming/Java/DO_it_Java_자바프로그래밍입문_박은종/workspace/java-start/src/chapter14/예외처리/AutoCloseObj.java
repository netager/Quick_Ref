package chapter14.����ó��;

public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {

		System.out.println("close()");
	}

}
