package j0114;

import java.util.Scanner;

public class Ja0114_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학생성적프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("학생이름을 입력하세요. : ");
		String name = sc.nextLine();
		System.out.println("국어점수를 입력하세요. : ");
		int kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요. : ");
		int eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요. : ");
		int mat = sc.nextInt();
		
		
		System.out.printf("이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 합계 : %d, 평균 : %.2f \n", name, kor, eng, mat,
				kor + eng + mat, (kor + eng + mat)/3.0);
		sc.close();
	}

}
