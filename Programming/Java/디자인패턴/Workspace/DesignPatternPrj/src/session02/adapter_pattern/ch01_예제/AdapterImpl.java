package session02.adapter_pattern.ch01_����;

public class AdapterImpl implements Adapter {

<<<<<<< HEAD
//	Math math = new Math();
	
	@Override
	public Float twiceOf(Float f) {
		
//		return (float) Math.twoTime(f.doubleValue());
		return Math.doubled(f.doubleValue()).floatValue();

=======
	@Override
	public Float twiceOf(Float f) {
//		return (float) Math.twoTime(f.doubleValue());
		
		// ��ȭ�� ������ �ݿ�
		// ------------
		// AdapterImpl class�� �����Ͽ� ��ȭ�� ���� �ݿ�
		return Math.doubled(f.doubleValue()).floatValue();
		
>>>>>>> a1858997f4936429a57f9158dd71c832bab0a43a
	}

	@Override
	public Float halfOf(Float f) {
<<<<<<< HEAD
		System.out.println("���� �Լ� ȣ��");
		return (float) Math.half(f.doubleValue());
	}
	
	
=======
		System.out.println("[AdapterImpl halfOf() ȣ�� ����] Input Data: "+ f);
		return (float) Math.half(f.doubleValue());
	}
>>>>>>> a1858997f4936429a57f9158dd71c832bab0a43a

}
