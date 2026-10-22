package oper02;

public class Arithmatic01 {

	public static void main(String[] args) {
		
		int n1 = 3 + 4 * 2;
		System.out.println(n1);
		
		try {
			int n3 = 3/0;
			System.out.println(n3);
		} catch (ArithmeticException e) {
			System.out.println("계산 예외발생:" + e);
		} catch (Exception e) {
			System.out.println("예외발생:" + e);
			//java.lang.ArithmeticException
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}finally {
			System.out.println("예외상관없이 무조건 출력된다.");
		}

	}

}
