package day07.EX11_사용자정의예외;

//사용자 정의 예외 클래스
// - public class B
public class BalanceException extends Exception {

	public BalanceException() {
		super();

	}

	public BalanceException(String message) {
		super(message);

	}
	
	

}
