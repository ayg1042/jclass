package j0114;

import java.util.Scanner;

public class Ja0114_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 조건문 - if, switch
		// 1 - 입력창, 2 - 검색창, 3 - 수정창, 4 - 삭제창, 5 - 종료
		System.out.printf("원하는 번호를 입력하세요. ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("입력창 입니다.");
			break;
		case 2:
			System.out.println("검색창 입니다.");
			break;
		case 3:
			System.out.println("수정창 입니다.");
			break;
		case 4:
			System.out.println("삭제창 입니다.");
			break;
		default:
			System.out.println("종료창 입니다.");
			break;
		}
		
		// if 점수를 입력받아, A-90, B-80, C-70, D-60, F-60미만 학점을 출력하세요.
//		int score = sc.nextInt();
//		
//		if(score >= 90) {
//			System.out.println("A");
//		}else if(score >= 80) {
//			System.out.println("B");
//		}else if(score >= 70) {
//			System.out.println("C");
//		}else if(score >= 60) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
		
		
//		System.out.println("숫자를 입력하세요.");
//		
//		int num = sc.nextInt();
//		if(num > 0) {
//			System.out.println("양수 입니다.");
//		}else if(num < 0){
//			System.out.println("음수 입니다.");
//		}else {
//			System.out.println("0 입니다.");
//		}
	}

}
