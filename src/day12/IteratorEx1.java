package day12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEx1 {
	public static void main(String[] args) {
//		List list = new ArrayList();
		Set list = new HashSet();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
//		for(int i =0; i < list.size(); i ++) {
//			System.out.println(list.get(i) + " ");
//		}
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		// iterator는 일회성이다.
//		while(it.hasNext()) {
//			System.out.print(it.next() + " ");
//		}
		System.out.println();
		it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
