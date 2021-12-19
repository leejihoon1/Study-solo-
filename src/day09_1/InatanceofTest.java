package day09_1;

public class InatanceofTest {
	public static void main(String[] args) {
		Fightable f = new Fighter();
		Fighter f1 = new Fighter();
		
		if (f1 instanceof Fighter) { // True
			System.out.println("f1은 Fighter클래스의 인스턴스입니다.");
		}
		
		if(f1 instanceof Unit) {	// True
			System.out.println("f1은 Unit클래스의 자손입니다.");
		}
		
		if(f1 instanceof Fightable) { //True
			System.out.println("f1은 Fightable 인터페이스를 구현했습니다.");
		}
		
		if(f1 instanceof Movable) { // True
			System.out.println("f1은 Movable인터페이스를 구현했습니다.");
		}
		
		if(f1 instanceof Attackable) { // True
			System.out.println("f1은 Attackable인터페이스를 구현햇습니다.");
		}
		
		if(f1 instanceof Object) {	// True
			System.out.println("f1은 Object클래스의 자손입니다.");
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

interface Fightable extends Movable, Attackable {} // 인터페이스끼리 다중상속 가능. 

class Fighter extends Unit implements Fightable{
	@Override
	public void attack(Unit u) {}
	
	@Override
	public void move(int x, int y) {}	
}
