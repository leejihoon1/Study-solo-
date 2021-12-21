package day12;

import java.util.ArrayList;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		// boolean add(Object e) : ArrayList�� �������� ��ü�� �߰�, �����ϸ� true
		list1.add(1); // Object e =1;   Object e = new Integer(1);
		list1.add(new Integer(5));
		list1.add(2);
		list1.add(0);
		list1.add(3);
		list1.add(new Integer(4));
		System.out.println("list1 : " + list1);
		
		// Object get(index) : ������ ��ġ�� ����� ��ü�� ��ȯ�Ѵ�.
//		int result1 = list1.get(3); // ���� 
		int result = (Integer)list1.get(3);
		System.out.println("result : " + result);
		
		// int size() : ArrayList�� ����� ��ü�� ���� ��ȯ�Ѵ�.
		for(int i = 0; i <list1.size(); i ++) {
			System.out.print(list1.get(i) + " ");
		}
		System.out.println();
		
		/* LIst subList(int fromIndex, int toIndex) 
			fromIndex�κ��� toIndex���̿� ����� ��ü�� ��ȯ�Ѵ�.
			toIndex�� ���� ���ܵȴ� ( ������ ���� ���� )
		*/
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println("list2 : " + list2);  
		
		/*boolean containsAll(Collection c)
		 *boolean contains(Object o )
		 *    ������ ��ü �Ǵ� Collection�� ��ü���� Collection�� ���ԵǾ� �ִ��� Ȯ���Ѵ�.
		 */
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		System.out.println();
		list2.add("B");
		list2.add("C");
		// Object set(int index, Object element): �־��� ��ü�� ������ ��ġ�� �����Ѵ�.
		list2.add(3, "A");
		list2.set(3, "AA");
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		
		/*
		 * boolean retainAll( Collection c)
		 * 		������ Collection�� ���Ե� ��ü���� ����� �ٸ� ��ü���� Collection���� �����Ѵ�.
		 * 		�� �۾����� ������ Collection�� ��ȭ�� ������ true, �׷��� ������ false�� ��ȯ
		 */
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		
		// list1 : [5, 2, 0]
		list1.remove(2);
		System.out.println("list1 : " + list1);
		list1.remove(Integer.valueOf(2));
//		list1.remove(new Integer(2));
		System.out.println("list1 : " + list1);
		
		// boolean remove(Object o) : ������ ��ü�� �����Ѵ�.
		// Object remove(int index) : �ش� �ε����� ��ü�� ���� 
		
	}
}












