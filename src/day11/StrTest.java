package day11;

public class StrTest {
	public static void main(String[] args) {
		String animals = "dog,cat,pig";
		// "문자열1".split("문자열2") : "문자열1"을 "문자열2" 기준으로 나누기 (문자열 배열)
		String[] arr = animals.split(",");
		System.out.println(arr[1]);
		
		// [.] 을 기준으로 배열을 나눈다 index[2]번의 값을 출력
		String ip = "192.168.0.1";
		System.out.println(ip.split("[.]")[2]);
		
		//String.join("문자열",문자열배열): 배열에 있는 문자열들을 "문자열"로 연결해서
		//							   하나의 문자열로 만들어주기(문자열)
		String result = String.join("-", arr);
		System.out.println(result);
		
		//"문자열1".indexOf("문자열2") : "문자열1"에서 "문자열2"를 ㅊ자아서 인덱스를 반환(int)
		String msg = "Hello Java!";
		int idx = msg.indexOf("J");
		System.out.println(idx); // 6
		idx = msg.indexOf("l");
		System.out.println(idx); // 2
		idx = msg.indexOf("P");
		System.out.println(idx); // -1
		idx = msg.indexOf("Java");
		System.out.println(idx); // 6
		
		//"문자열".charAt(n) : "문자열"의 n번째 글자를 리턴(char)
		char ch = msg.charAt(6);
		System.out.println(ch);
		
		
		//"문자열".toUpperCase(): "문자열"의 소문자를 전부 대문자로 바꾸어서 리턴(String)
		//"문자열".toLowerCase(): "문자열"의 대문자를 전부 소문자로 바꾸어서 리턴(String)
		System.out.println(msg.toUpperCase());
		System.out.println(msg.toLowerCase());
		System.out.println(msg);
		
		//"문자열".subString(n): n번째 글자부터 끝까지 잘라서 리턴(String)
		System.out.println(msg.substring(6));
		//"문자열".subString(n,m): n번쨰부터 m번째 전까지 잘라서 리턴(String)
		System.out.println(msg.substring(0, 5));
		
		//String.valueOf(값): 해당 값을 문자열 타입으로 전환
		int data = 10;
		String str = String.valueOf(data); // 문자열 "10"
		str = data+""; // 문자열 "10"
		System.out.println(str);
		
		//Integer.parseInt("정수로된 문자열") : 통째로 정수형태로 형변환(int)
		//Double.parseDouble(), Boolean.parseBoolean(), ....
		System.out.println(Integer.parseInt(str)+5);
	}
}








