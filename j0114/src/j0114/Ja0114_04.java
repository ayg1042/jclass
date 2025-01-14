package j0114;

import java.util.Scanner;

public class Ja0114_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("소문자를 입력하세요.");
		char str = sc.next().charAt(0);
		str = (char)(str - 32);
		System.out.println(str);
		sc.close();
		
		// byte, short, char 사칙연산을 하면 int로 타입이 변경된다.
		
//		int a = 1000000;
//		int b = 1000000;
//		long c = (long)a * b; // 두개중 한개만 바꿔도 됨
		
//		int n = '9' - '0';
//		System.out.println(n);
//		
//		System.out.println(c);
		
//		byte a = 1;
//		byte b = 2;
//		byte c = (byte)(a+b); // 형변환
		
//		int a = 10;
//		int b = a++;
//		System.out.println("a : " + a);
//		System.out.println("b : " + b);
	}

}
