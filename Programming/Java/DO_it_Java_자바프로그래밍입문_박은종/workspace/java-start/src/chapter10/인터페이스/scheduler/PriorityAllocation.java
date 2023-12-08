package chapter10.인터페이스.scheduler;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {

		System.out.println("고객의 등급이 높은 고객의 전화를 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {

		System.out.println("업무 skill이 가장 높은 상담원의 대기열 앞에 우선 배정합니다.");
		
	}

}
