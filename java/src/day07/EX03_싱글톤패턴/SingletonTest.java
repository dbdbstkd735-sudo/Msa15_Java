package day07.EX03_싱글톤패턴;

public class SingletonTest {

	public static void main(String[] args) {
		//Singleton singleton = new Singleton();
		
		Singleton s01 = Singleton.getInstance();
		Singleton s02 = Singleton.getInstance();
	
		//인스턴스가 메모리 공간에 하나로할당되어 있는지 확인
		
		System.out.print("s01. s02가 같은지 여부 : ");
		System.out.println( s01 == s02 );
	}
	
}
