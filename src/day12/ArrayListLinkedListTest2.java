package day12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(100000);
		LinkedList ll = new LinkedList();
		add(al);
		add(ll);
		
		System.out.println("=���ٽð� �׽�Ʈ=");
		System.out.println("ArrayList : " + access(al));
		System.out.println("LinkedList : " + access(ll));
		System.out.println();
		
	}
	
	// step 1 : �������� ������ �߰�
	public static void add(List list) {
		for(int i = 0; i < 100000; i ++) {
			list.add(i +"");
		}
	}
	
	// step 2 : ������ ���ٽð� �׽�Ʈ
	public static long access(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			list.get(i);
		}
		long  end = System.currentTimeMillis();
		return end - start;
	}
}
