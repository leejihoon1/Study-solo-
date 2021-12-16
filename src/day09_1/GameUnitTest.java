package day09_1;

public class GameUnitTest {
	public static void main(String[] args) {
//		GameUnit gu = new GameUnit(); // 에러 바디 없는 추상메소드 
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Tank t = new Tank();
		DropShip d = new DropShip();
		
//		m1.move(1, 1);
//		m2.move(1, 1);
//		t.move(1, 1);
//		d.move(1, 1);
		
		GameUnit[] group = new GameUnit[4];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Marine();
		group[3] = new DropShip();
		
		for(int i = 0; i < group.length; i ++ ) {
			group[i].move(1, 1);
			
		}
		// 위처럼 GameUnit배열을 만들어서 Marine 20명 생산.
		
//		GameUnit[] marineGroup = new GameUnit[20];
//		Marine[] marineGroup1 = new Marine[20];
//															// 강사님 코드
//		for (int i = 0; i < marineGroup.length; i++) {
//			marineGroup1[i] = new Marine();
//		
		GameUnit[] group1 = new GameUnit[20];
		for (int i = 0; i < group1.length; i++) {
			group1[i] = new Marine();
			System.out.println(group1);
		}
		/*
		 * 위 코드는 공통조상인 GameUnit클래스 타입의 참조변수 배열을 통해서
		 * 서로 다른 종류의 인스턴스를 하나의 묶음으로 다룰 수 있다는 것을 보여주기 위한것이다.
		 * 다형성에서 배웠듯이 조상클래스의 참조변수로 자손클래스의 인스턴스를 참조하는 것이 가능하기 떄문에
		 * 이처럼 조상클래스 타입의 배열에 자손클래스의 객체(인스턴스)를 담을 수 있는 것이다.
		 * 여기서 호출되는 move(1,1)은 자손클래스에서 재정의된 메소드가 호출되는 것이다.
		 */
		
		Object[] groups = new Object[4];
		groups[0] = new Marine(); // Object obj = new Marine();
		groups[1] = new Tank();
		groups[2] = new Marine();
		groups[3] = new DropShip();
		
//		for (int i = 0; i < groups.length; i ++) {
//			groups[i].move(1, 1);				// Groups에는 move메소드가 없음
//		}
	}
}
