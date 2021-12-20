package day10_1;

public class ExceptionEx8 {
	public static void main(String[] args) {
		try {
//			Exception e= new Exception("고의로 발생시켰음");
//			throw e;
//			ArithmeticException e = new ArithmeticException();
//			throw e;
			
			throw new Exception("고의로 발생시켰음");
		} catch (ArithmeticException e) {
			//ArithmeticsException e = new Exception();  ( X )
			System.out.println("ArithmeticException");
		} catch ( Exception e) {
			// Exception e = new Exception();
			System.out.println("Exception");
			System.out.println("예외메시지 : " + e.getMessage());
			e.printStackTrace();
		}
	}
}
