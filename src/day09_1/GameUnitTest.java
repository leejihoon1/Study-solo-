package day09_1;

public class GameUnitTest {
	public static void main(String[] args) {
//		GameUnit gu = new GameUnit(); // ���� �ٵ� ���� �߻�޼ҵ� 
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
		// ��ó�� GameUnit�迭�� ���� Marine 20�� ����.
		
//		GameUnit[] marineGroup = new GameUnit[20];
//		Marine[] marineGroup1 = new Marine[20];
//															// ����� �ڵ�
//		for (int i = 0; i < marineGroup.length; i++) {
//			marineGroup1[i] = new Marine();
//		
		GameUnit[] group1 = new GameUnit[20];
		for (int i = 0; i < group1.length; i++) {
			group1[i] = new Marine();
			System.out.println(group1);
		}
		/*
		 * �� �ڵ�� ���������� GameUnitŬ���� Ÿ���� �������� �迭�� ���ؼ�
		 * ���� �ٸ� ������ �ν��Ͻ��� �ϳ��� �������� �ٷ� �� �ִٴ� ���� �����ֱ� ���Ѱ��̴�.
		 * ���������� ������� ����Ŭ������ ���������� �ڼ�Ŭ������ �ν��Ͻ��� �����ϴ� ���� �����ϱ� ������
		 * ��ó�� ����Ŭ���� Ÿ���� �迭�� �ڼ�Ŭ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ� ���̴�.
		 * ���⼭ ȣ��Ǵ� move(1,1)�� �ڼ�Ŭ�������� �����ǵ� �޼ҵ尡 ȣ��Ǵ� ���̴�.
		 */
		
		Object[] groups = new Object[4];
		groups[0] = new Marine(); // Object obj = new Marine();
		groups[1] = new Tank();
		groups[2] = new Marine();
		groups[3] = new DropShip();
		
//		for (int i = 0; i < groups.length; i ++) {
//			groups[i].move(1, 1);				// Groups���� move�޼ҵ尡 ����
//		}
	}
}
