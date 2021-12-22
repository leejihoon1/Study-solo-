package day13;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId","1234");
		map.put("asdf","1111");
		map.put("asdf","1234");
		System.out.println(map);
		// put(Object key, Object value) : map�� key, value entry�� �߰�.
		
		Scanner s= new Scanner(System.in);
		
		while(true) {
			System.out.println("id�� password�� �Է����ּ���");
			System.out.println("id : ");
			String id = s.nextLine().trim(); // trim() �¿���� ����
			
			System.out.println("password : ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) { // �Է��� id�� map�� key�� �����ϴ� ���� ���ٸ�
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���");
				continue;
			}else {
				if(!map.get(id).equals(password)) {
					//get (Object key) : key�� �����ϴ� value���� ��ȯ�Ѵ�
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}else {
					System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");
					break;
				}
			}
		}
	}
}
