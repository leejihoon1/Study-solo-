package day12;

import java.util.ArrayList;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		// boolean add(Object e) : ArrayList의 마지막에 객체를 추가, 성공하면 true
		list1.add(1); // Object e =1;   Object e = new Integer(1);
		list1.add(new Integer(5));
		list1.add(2);
		list1.add(0);
		list1.add(3);
		list1.add(new Integer(4));
		System.out.println("list1 : " + list1);
		
		// Object get(index) : 지정된 위치에 저장된 객체를 반환한다.
//		int result1 = list1.get(3); // 에러 
		int result = (Integer)list1.get(3);
		System.out.println("result : " + result);
		
		// int size() : ArrayList에 저장된 객체의 수를 반환한다.
		for(int i = 0; i <list1.size(); i ++) {
			System.out.print(list1.get(i) + " ");
		}
		System.out.println();
		
		/* LIst subList(int fromIndex, int toIndex) 
			fromIndex로부터 toIndex사이에 저장된 객체를 반환한다.
			toIndex의 값은 제외된다 ( 마지막 값은 제외 )
		*/
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println("list2 : " + list2);  
		
		/*boolean containsAll(Collection c)
		 *boolean contains(Object o )
		 *    지정된 객체 또는 Collection의 객체들이 Collection에 포함되어 있는지 확인한다.
		 */
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		System.out.println();
		list2.add("B");
		list2.add("C");
		// Object set(int index, Object element): 주어진 객체를 지정된 위치에 저장한다.
		list2.add(3, "A");
		list2.set(3, "AA");
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		
		/*
		 * boolean retainAll( Collection c)
		 * 		지정된 Collection에 포함된 객체만을 남기고 다른 객체들은 Collection에서 삭제한다.
		 * 		이 작업으로 ㅇ니해 Collection에 변화가 있으면 true, 그렇지 않으면 false를 변환
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
		
		// boolean remove(Object o) : 지정된 객체를 삭제한다.
		// Object remove(int index) : 해당 인덱스의 객체를 삭제 
		
	}
}












