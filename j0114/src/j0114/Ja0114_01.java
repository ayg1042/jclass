package j0114;

public class Ja0114_01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean temp = true; // 논리형
		char ch = 'a'; // 문자형
		byte n1 = 1; // 정수형
		short n2 = 2; // 정수형
		int num1 = 100; // 정수형
		long num2 = 1000l; // 정수형
		float f = 3.14f; // 실수형
		double d = 10.345;  // 실수형
		String str = "abc"; // 문자열
		String str2 = new String("abc"); // 문자열
		
		System.out.println(temp);
		
		System.out.printf("논리형 : %b \n", temp);
		System.out.printf("문자형 : %c \n", ch);
		System.out.printf("정수형 : %05d, %010d \n", num1, num2);
		System.out.printf("실수형 : %.2f, %.2f \n", f, d);
		System.out.printf("문자열 : %s \n", str);
	}

}
