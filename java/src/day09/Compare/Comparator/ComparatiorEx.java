package day09.Compare.Comparator;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Product implements Comparator<Product> {

	String code; // 상품 코드
	String name; // 상품명
	int pirce; // 가격
	@Override
	public int compare(Product o1, Product o2) {
		// 1. 가격 순으로 내림차순
		// 2. 이름 순으로 오름차순
		int price1 = o1.getPirce();
		int price2 = o2.getPirce();
		String name1 = o1.getName();
		String name2 = o2.getName();
//		//가격순 내림차순
//		if(price1 > price2 ) return -1; 
//		if(price1 < price2 ) return 1;
//		if(price1 == price2 ) {return 0;
//		//이름순 오름차순
//		int gap = name1.compareTo(name2);
//		// name 1이 더 크면 (사전순으로 뒤에 나오면 (+)
//		// name 1이 더 작으면 (사전순으로 뒤에 나오면 (-)
//		// name 1이랑 name 이 같으면(같은 문자열이면)(0)
//		return gap;
//		
		int result1 = price2 - price1; // 가격순 내림차순
		int result2 = name1.compareTo(name2); // 이름순 오름차순
		return result1 == 0 ? result2 : result1;
	}

	public class ComparatiorEx {

		public static void main(String[] args) {
			List<Product> productList = Arrays.asList(new Product("PRD001", "과자", 4000),
					new Product("PRD002", "바지", 40000), new Product("PRD003", "패딩", 100000),
					new Product("PRD004", "셔츠", 15000), new Product("PRD005", "우유", 4000),
					new Product("PRD006", "젤리", 4000));
		}
		//정렬 전
		
		
	}

}