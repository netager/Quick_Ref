package chapter09.추상클래스.gamelevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {

		System.out.println("천천히 달립니다.");

	}

	@Override
	public void jump() {
		System.out.println("jump를 할지 모릅니다.");

	}

	@Override
	public void turn() {
		System.out.println("turn을 할지 모릅니다.");

	}

	@Override
	public void showLevelMessage() {

		System.out.println("****** 초보자 레벨입니다. ******");

	}

}
