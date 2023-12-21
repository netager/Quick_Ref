package session02.adapter_pattern.ch01_����;

public class AdapterImpl implements Adapter {

	@Override
	public Float twiceOf(Float f) {
//		return (float) Math.twoTime(f.doubleValue());
		
		// ��ȭ�� ������ �ݿ�
		// ------------
		// AdapterImpl class�� �����Ͽ� ��ȭ�� ���� �ݿ�
		return Math.doubled(f.doubleValue()).floatValue();
		
	}

	@Override
	public Float halfOf(Float f) {
		System.out.println("[AdapterImpl halfOf() ȣ�� ����] Input Data: "+ f);
		return (float) Math.half(f.doubleValue());
	}

}
