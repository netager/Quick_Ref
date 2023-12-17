package session01.stretage_pattern.c04_복습;

public class GameCharacter {
	
	// 접근점
	private Weapon weapon;
	
	
	// 교환
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		if(weapon == null) {
			System.out.println("맨손 공격");
		} else {
			// 위임
			weapon.attack();
		}
	}

}
