package day10_1;

public class ExceptionEx13 {
	public static void main(String[] args){
		try {
			startInstall();
			copyFiles();
			deleteTempFiles();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			deleteTempFiles();
		}			
	}			
	
	static void startInstall() {
		// ���α׸� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ带 ���´�.
	}
	
	static void copyFiles() {
		// ���ϵ��� �����ϴ� �ڵ带 ���´�.
	}
	
	static void deleteTempFiles() {
		// �ӽ����ϵ��� �����ϴ� �ڵ带 ���´�.
	}
}
