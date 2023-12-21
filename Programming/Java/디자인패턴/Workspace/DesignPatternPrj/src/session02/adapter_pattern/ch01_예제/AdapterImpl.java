package session02.adapter_pattern.ch01_예제;

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
		
		// 강화된 내용을 반영
		// ------------
		// AdapterImpl class만 수정하여 강화된 내용 반영
		return Math.doubled(f.doubleValue()).floatValue();
		
>>>>>>> a1858997f4936429a57f9158dd71c832bab0a43a
	}

	@Override
	public Float halfOf(Float f) {
<<<<<<< HEAD
		System.out.println("절반 함수 호출");
		return (float) Math.half(f.doubleValue());
	}
	
	
=======
		System.out.println("[AdapterImpl halfOf() 호출 시작] Input Data: "+ f);
		return (float) Math.half(f.doubleValue());
	}
>>>>>>> a1858997f4936429a57f9158dd71c832bab0a43a

}
