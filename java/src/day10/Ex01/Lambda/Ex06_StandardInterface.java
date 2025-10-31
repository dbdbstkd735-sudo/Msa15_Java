package day10.Ex01.Lambda;

import java.util.function.Supplier;

import lombok.basic.Person;

public class Ex06_StandardInterface {

	public class Main {

		public static void main(String[] args) {
			
			// 기본 람다식
			// Supplier<Person> lambda = () -> { return new Person(); };
			Supplier<Person> lambda = () -> new Person();
			Person p1 = lambda.get();          // 람다식을 통한 객체 생성	
			p1.setName("김조은");
			System.out.println( p1.getName() );
			
			// 생성자 참조
			Supplier<Person> constructorRef = Person::new;
			Person p2 = constructorRef.get();   // 생성자 참조를 통한 객체 생성
			System.out.println( p2.getName() );		
		}
		
 }
}