package day10_1;

public class RepiarableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		DropShip dropShip = new DropShip();
		Marine marine = new Marine();
		RepairMan repairMan = new RepairMan();
		
		repairMan.repair(tank);
		repairMan.repair(dropShip);
		repairMan.repair(repairMan);
//		repairMan.repair(marine);
		// if(u instanceof Unit)
	}
}

interface Repairable {}

class Unit{
	int hitPoint;
	final int MAX_HP;
	public Unit(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit{ // 지상유닛
	public GroundUnit(int hp) {
		super(hp); // 자식클래스에서 부모생성자를 호출해야함.
	}
}

class AirUnit extends Unit{
	public AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable { // 탱크 (지상유닛)
	public Tank() {
		super(150);
		hitPoint = MAX_HP;
	}
}

class Marine extends GroundUnit{ // 마린 (지상유닛)
	public Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class RepairMan extends GroundUnit implements Repairable{ // 수리공 (지상유닛)
	public RepairMan() {
		super(60);
		hitPoint = MAX_HP;
	}
	
//	void repair(Object u){
	void repair(Repairable u) { 
		if (u instanceof Unit) {
			Unit u1 = (Unit) u;
			while(u1.hitPoint != u1.MAX_HP) {
				u1.hitPoint++;
			}
			System.out.println("수리완료");
		}
	}
}

class DropShip extends AirUnit implements Repairable{ // 수송선 (공중유닛)
	public DropShip() {
		super(125);
		hitPoint = MAX_HP;
	}
}













