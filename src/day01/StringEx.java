package day01;

	public class StringEx {
		public static void main(String[] args) {
			String name = "Ja" + "va"; //"java" ���ڿ� + ���ڿ� => ����
			System.out.println(name);
			
			String str = name + 1.8; // "Java" + 1.8
			System.out.println(str);
			
			/*
			 * Stinrg str = name + 1.8
			 * 		  str = "Java" + 1.8
			 * 		  str = "Java" + "1.8"
			 * 		  str = "Java1.8"
			 */
			System.out.println(7 + "");  
			System.out.println("" + 7);
			System.out.println(7 + 7 + "");
			/*
			 * 	7 + 7 +  ""
			 *  14 + ""
			 *  "14" + ""
			 *  "14"
			 */
			System.out.println("" +  7 + 7);
			/*
			 * "" 7 + 7
			 * " + " 7 + 7"
			 * "" + 77
			 * "77"
			 */
		}
}