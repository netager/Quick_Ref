package scheduler;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill이 가장 높은 상담원의 대기열 앞에 우선 배분합니다.");
	}
	
}
