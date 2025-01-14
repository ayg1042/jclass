package j0114;

import java.util.Scanner;

public class Ja0114_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str = "홍길동";
		String input = sc.next();
		if(str == input) {
			System.out.println("홍길동 입니다.");
		}else {			
			System.out.println("아닙니다.");
		}

		// 비교 ex) str.equals(); 로함
		
		// 1 ~ 100 랜덤숫자를 입력받아, 10번을 입력해서 숫자맞추기
//		int num = (int)(Math.random() * 100) + 1;
//		int che = 0;
//		boolean t = false;
//		while(che < 10) {
//			int user = sc.nextInt();
//			if(user == num) {
//				t = true;
//				break;
//			}else if(user < num) {
//				System.out.println("Up");
//			}else {
//				System.out.println("Du");
//			}
//			che++;
//		}
//		if(t) {
//			System.out.println("정답입니다. " + num);
//		}else {
//			System.out.println("들렸어요 " + num);
//		}
		
		// (int)(Math.random() * 10) +1 == 1~10까지
//		int num = (int)Math.random();
		
		// 반복문으로 000 ~ 999까지 출력하세요.
//		int i = 0;
//		while(i <= 999) {
//			System.out.printf("%03d\n",i);
//			i++;
//		}
		
		// while 구구단
//		int i = 2;
//		while(i <= 9) {
//			System.out.println(i + "단");
//			int j = 2;
//			while(j <= 9) {
//				System.out.println(i + " * " + j + " = " + (i * j));
//				j++;
//			}
//			i++;
//		}
		
		// 두 숫자를 입력받아 i ~ j단 까지
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int end = Math.max(num1, num2);
//		int start = Math.min(num1, num2);
//		for(int i = start; i <= end; i++) {
//			System.out.println(i + "단");
//			for(int j = 2; j <= 9; j++) {
//				System.out.println(i + " * " + j + " = " + (i * j));
//			}
//		}
//		
		// 입력받은 숫자부터 9단까지 출력 프로그앰
//		int num = sc.nextInt();
//		for(int i = num; i <= 9; i++) {
//			System.out.println(i + "단");
//			for(int j = 2; j <= 9; j++) {
//				System.out.println(i + " * " + j + " = " + (i * j));
//			}
//		}
		
		// 모두 영문자일 때만 출력
//		System.out.println("글자를 입력하세요. (영문자만 입력하세요)");
//		String str = sc.next();
//		boolean t = false;
//		for(int i = 0; i < str.length(); i++) {			
//			char ch = str.charAt(i);
//			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
//				t = true;
//			}else {
//				t = false;
//			}
//		}
//		if(t) {
//			System.out.println(str);
//		}else {
//			System.out.println("다시 입력하세요.");
//		}
//		System.out.println("글자를 입력하세요. (영문자만 입력하세요)");
//		String str = sc.next();
//		for(int i = 0; i < str.length(); i++) {			
//			char ch = str.charAt(i);
//			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
//				System.out.println("출력 : " + ch);
//			}else {
//				System.out.println("다시 입력하세요.");
//			}
//		}
		
//		int sum = 0;
//		for(int i = 0; i <= 5; i++) {
//			sum += i;
//			System.out.println(sum);
//		}

	}

}
