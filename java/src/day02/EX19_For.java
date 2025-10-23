package day02;

public class EX19_For {
	
	public static void main(String[] args) {
		// for( 1초기식 ; 2조건식 ; 4증감식 { 3실행문 }
		// -실행 순서 : 1 -> 반복(2 -> 3 -> 4)
		// - 초기식에서 반복 변수 선언
		
		// 1. 1~10 까지 정수를 출력하시오.
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		
		}
		System.out.println();
		
		for (int a = 50; a <= 100;  a++) {
			System.out.print(a + " ");
			
		}
		System.out.println();
		
       //3. 1~20 까지 정수 중 짝수만 출력하시오.		
		
		for (int i  = 1; i <= 20;  i++) {
		//for (int i  = 2; i <= 20;  i+=2) 
			if ( i % 2 == 0)
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		
	   //3. 1~20 까지 정수 중 홀수만 출력하시오.		
		for (int i  = 1; i <= 20;  i++) {
		//for (int i  = 1; i <= 20;  i+=2) 
			if ( i % 2 == 1)
				System.out.print(i + " ");
			
		}
		System.out.println();
	}

}
