package day09_1;

public class InatanceofTest {
	public static void main(String[] args) {
		Fightable f = new Fighter();
		Fighter f1 = new Fighter();
		
		if (f1 instanceof Fighter) { // True
			System.out.println("f1�� FighterŬ������ �ν��Ͻ��Դϴ�.");
		}
		
		if(f1 instanceof Unit) {	// True
			System.out.println("f1�� UnitŬ������ �ڼ��Դϴ�.");
		}
		
		if(f1 instanceof Fightable) { //True
			System.out.println("f1�� Fightable �������̽��� �����߽��ϴ�.");
		}
		
		if(f1 instanceof Movable) { // True
			System.out.println("f1�� Movable�������̽��� �����߽��ϴ�.");
		}
		
		if(f1 instanceof Attackable) { // True
			System.out.println("f1�� Attackable�������̽��� �����޽��ϴ�.");
		}
		
		if(f1 instanceof Object) {	// True
			System.out.println("f1�� ObjectŬ������ �ڼ��Դϴ�.");
		}
	}
}

class Unit{
	int currentHP;
	int x;
	int y;
}

interface Movable{
	void move(int x, int y);
}

interface Attackable{
	void attack(Unit u);
}

interface Fightable extends Movable, Attackable {} // �������̽����� ���߻�� ����. 

class Fighter extends Unit implements Fightable{
	@Override
	public void attack(Unit u) {}
	
	@Override
	public void move(int x, int y) {}	
}
