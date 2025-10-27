package day06.Ex04_중첩인터페이스;

public class Main {
	
	public static void main(String[] args) {
		//중첩 인터페이스의 아우터 클래스 객체 생성
		K i = new K();
		i.setInterface(K);
		i.method();
		System.out.println();
		
		I.J j = new K();
		j.methodA();
		j.methodB();
	}

}
