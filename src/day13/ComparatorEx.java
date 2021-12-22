package day13;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
	public static void main(String[] args) {
		String[] strArr = {"cat","Dog","lion","tiger"};
		System.out.println("정렬 전 : " + Arrays.toString(strArr));
		Arrays.sort(strArr);
		System.out.println("기본 정렬 후 : " + Arrays.toString(strArr));
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소분자 구분하지 않고 비교
		System.out.println("대소문자 구분하지 않은 정렬 후 : " + Arrays.toString(strArr) );
		
		// 역순정렬 
		Arrays.sort(strArr, new Desending());
		System.out.println("역순 정렬 후 : " + Arrays.toString(strArr));
	}
}

class Desending implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1;
		
		}
		return -1;
	}
}