package day06.Ex03_중첩클래스;


/**
 * 중첩클래스
 */

public class X {

	int xValue = 1;
	static int xValue2 = 2;
	class Y {
		int value;
		static int value2 = 100;
		
		Y() { 
			System.out.println("X의 Y객체 생성");
			System.out.println("values2 : " + value2);
		}
		void method1() {
			System.out.println("Y의 메소드");
			System.out.println("Y에서 X클래스의 static 변수 접근" + xValue2);
		}
		static void method2() {
			System.out.println("Y의 static 메소드");
		}
	}
	// static 이너 클래스
	//* static 이너 클래스에서는 static 멤버 사용 가능
	static class Z {
		int value1;
		static int value2;
		Z() { 
			System.out.println("X의 Z객체 생성");
		}
		void method11() {
			System.out.println("Z의 메소드");
		}
		static void method2() {
			System.out.println("Z의 static 메소드");
		}
		//로컬 클래스
		//메소드 안에 정의한 클래스
		// - 메소드가 실행 될 때만 사용되는 이너 클래스
		void method () {
			class L{
				int value;
				static int value2;
				
				L(){
					System.out.println("L 객체 생성");
				}
				void method1() {
					System.out.println("L의 메소드");
				}
				static void method2() {
					System.out.println("L의 static 메소드");
				}
			}
			
		}
		int L 1 = new L();
		1.value = 10;
		System.out.println("로컬 클래스의 변수 - " + 1.value);
		1.method1();

	}
	
}
