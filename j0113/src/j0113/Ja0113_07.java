package j0113;

public class Ja0113_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 48;
		// 형변환 int -> char
		char ch1 = (char)n1;
		
		char ch2 = 'a';
		// 변환하려는 타입 생략가능
		int n2 = ch2;
		
		float f1 = 3.14f;
		int n3 = (int)f1;
		
		int n4 = 10;
		float f2 = n4;
		// 자동으로 10.0 이 붙음
	}

}
