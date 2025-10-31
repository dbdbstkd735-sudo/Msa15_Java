package lombok.basic;

public class Builder {

	public static void main(String[] args) {
		Pikachu pikachu = new Pikachu.PikachuBuilder()
	                                 .energy(100)
	                                 .level(20)
	                                 .type("da")
	                                 .build();
		System.out.println(pikachu);
	}
}
