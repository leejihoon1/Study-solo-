package day11;

public class StrTest {
	public static void main(String[] args) {
		String animals = "dog,cat,pig";
		// "���ڿ�1".split("���ڿ�2") : "���ڿ�1"�� "���ڿ�2" �������� ������ (���ڿ� �迭)
		String[] arr = animals.split(",");
		System.out.println(arr[1]);
		
		// [.] �� �������� �迭�� ������ index[2]���� ���� ���
		String ip = "192.168.0.1";
		System.out.println(ip.split("[.]")[2]);
		
		//String.join("���ڿ�",���ڿ��迭): �迭�� �ִ� ���ڿ����� "���ڿ�"�� �����ؼ�
		//							   �ϳ��� ���ڿ��� ������ֱ�(���ڿ�)
		String result = String.join("-", arr);
		System.out.println(result);
		
		//"���ڿ�1".indexOf("���ڿ�2") : "���ڿ�1"���� "���ڿ�2"�� ���ھƼ� �ε����� ��ȯ(int)
		String msg = "Hello Java!";
		int idx = msg.indexOf("J");
		System.out.println(idx); // 6
		idx = msg.indexOf("l");
		System.out.println(idx); // 2
		idx = msg.indexOf("P");
		System.out.println(idx); // -1
		idx = msg.indexOf("Java");
		System.out.println(idx); // 6
		
		//"���ڿ�".charAt(n) : "���ڿ�"�� n��° ���ڸ� ����(char)
		char ch = msg.charAt(6);
		System.out.println(ch);
		
		
		//"���ڿ�".toUpperCase(): "���ڿ�"�� �ҹ��ڸ� ���� �빮�ڷ� �ٲپ ����(String)
		//"���ڿ�".toLowerCase(): "���ڿ�"�� �빮�ڸ� ���� �ҹ��ڷ� �ٲپ ����(String)
		System.out.println(msg.toUpperCase());
		System.out.println(msg.toLowerCase());
		System.out.println(msg);
		
		//"���ڿ�".subString(n): n��° ���ں��� ������ �߶� ����(String)
		System.out.println(msg.substring(6));
		//"���ڿ�".subString(n,m): n�������� m��° ������ �߶� ����(String)
		System.out.println(msg.substring(0, 5));
		
		//String.valueOf(��): �ش� ���� ���ڿ� Ÿ������ ��ȯ
		int data = 10;
		String str = String.valueOf(data); // ���ڿ� "10"
		str = data+""; // ���ڿ� "10"
		System.out.println(str);
		
		//Integer.parseInt("�����ε� ���ڿ�") : ��°�� �������·� ����ȯ(int)
		//Double.parseDouble(), Boolean.parseBoolean(), ....
		System.out.println(Integer.parseInt(str)+5);
	}
}








