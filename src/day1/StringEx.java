package day1;

	public class StringEx {
		public static void main(String[] args) {
			String name = "Ja" + "va"; //"java" 문자열 + 문자열 => 연결
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
