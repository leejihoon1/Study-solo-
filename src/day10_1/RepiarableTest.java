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

class GroundUnit extends Unit{ // ��������
	public GroundUnit(int hp) {
		super(hp); // �ڽ�Ŭ�������� �θ�����ڸ� ȣ���ؾ���.
	}
}

class AirUnit extends Unit{
	public AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable { // ��ũ (��������)
	public Tank() {
		super(150);
		hitPoint = MAX_HP;
	}
}

class Marine extends GroundUnit{ // ���� (��������)
	public Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class RepairMan extends GroundUnit implements Repairable{ // ������ (��������)
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
			System.out.println("�����Ϸ�");
		}
	}
}

class DropShip extends AirUnit implements Repairable{ // ���ۼ� (��������)
	public DropShip() {
		super(125);
		hitPoint = MAX_HP;
	}
}













