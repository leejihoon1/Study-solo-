package day14_1;

import java.util.ArrayList;

public class GenericsEx {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
//		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
//		list.add("abc"); // ���� Ÿ���� Integer�� �����Ǿ�����
		
		for (int i=0; i <list.size(); i ++) {
			int num = list.get(i);
			System.out.println("num : " + num);
		}
		ArrayList list1 = new ArrayList();
		ArrayList<Object>list2 = new ArrayList<Object>();
	}
}
