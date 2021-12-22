package day13;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", 90);
		map.put("김자바", 100);
		map.put("이자바", 100);
		map.put("강자바", 80);
		map.put("박자바", 90);
		
		// 1. entry를 통째로 set으로 변경
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}
		System.out.println();
		
		// 2. key값을 set으로 변경
		set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		System.out.println();
		
		// 3. value값을 Collection으로 변경
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			int i = (Integer)it.next();
			total += i;
		}
		System.out.println("총점 : " + total);
		System.out.println("평준 : " + (double)total / set.size());
		System.out.println("최저점수 : " + Collections.max(values));
		System.out.println("최고점수 : " + Collections.min(values));
		//COllections 클래스는 컬렉션을 다루기 위해 유용한 메소드들이 모여있는 클래스.
		
	}
}


