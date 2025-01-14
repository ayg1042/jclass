package j0114;

import java.util.Scanner;

public class Ja0114_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// 숫자를 입력받아 가장 큰 수를 출력하세요.
		System.out.println("숫자를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("숫자를 입력하세요.");
		int num2 = sc.nextInt();
		System.out.println("숫자를 입력하세요.");
		int num3 = sc.nextInt();
		System.out.println(num1>num2 ? num1>num3 ? num1:num3 : num2>num3 ? num2:num3 );
		
		// 양수 0까지 포함, 음수
//		System.out.println("숫자를 입력하세요.");
//		int num = sc.nextInt();
//		System.out.println(num >= 0? "양수":"음수");
		
//		System.out.println("숫자를 입력하세요.");
//		int score = sc.nextInt();
//		String result = score >= 60 ? "합격":"불합격";
//		System.out.println("결과 : " + result);
		
//		System.out.println("숫자를 입력하세요.");
//		int x = sc.nextInt();
//		int absX = x>10?x:-x;
//		System.out.println(absX);
		
//		System.out.println("소문자 1개");
//		char input = sc.next().charAt(0);
//		if((input >= 'a' && input <= 'z') || (input >= 'A' && input  <= 'Z')) {
//			System.out.println("영어");
//		}else {
//			System.out.println("영어 아님");
//		}
		
		
		// 올림 ceil, 버림 floor, 반올림 round
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("소수점 3자리 실수를 입력하세요.");
//		double input = sc.nextDouble();
		
		// 3자리에서 반올림해서 값을 출력하세요.
//		System.out.println(Math.round(input*100)/100.0);
		
		// 올림
//		System.out.println(Math.round(13.12345));
		
		// 반올림
//		double pi = 3.141592;
//		double pi2 = Math.round(pi*1000)/1000.0;
		
		// 버림
		// float pi = 3.141592f;
		// float pi2 = (int)(pi * 10) / 10f;
		
		

	}

}
