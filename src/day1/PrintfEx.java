package day1;

public class PrintfEx {
	public static void main(String[] args) {
		boolean flag = true;
		float number = 1.2f;
		char ch = 'A';
		String name = "Lee";
		
		System.out.printf("flag : %b\n", flag);
		System.out.printf("number : %f\n", number);
		System.out.printf("number : %.1f\n", number);
		System.out.printf("ch : %c\n", ch);
		System.out.printf("name : %s\n", name);
	}
}
