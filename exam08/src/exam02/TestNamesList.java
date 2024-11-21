package exam02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestNamesList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("홍길동", "이순신", "김유신");

		// 배열이면 Arrays.stream(배열이름)
		// List 리스트이름.Stream()

		// "님" 붙여서 출력
		names.stream()
			.forEach((name) -> System.out.println(name + "님"));

		// map() -> 변경된 데이터 목록 생성
		names.stream()
			.map((name) -> name + "님")
			.forEach(name -> System.out.println(name));
		;
		
		// 메서드 참조
		names.stream()
			.map(name->name+"님") // 변환
			.forEach(System.out::println); // 메서드로 참조 출력
		
		// 변환된 데이터를 그대로 다시 목록으로 반환
		List<String> newList =names.stream()
			.map(name -> name+"님")
			.collect(Collectors.toList());
		System.out.println("");
		
		newList.stream().forEach(System.out::println);

		// filter - 조건에 맞는 데이터만 걸러낸다.
		// map - 내가 적용하고 하는 데이터로 변환한다 -> 새로운 목록 생성
		// sum, count, forEach 연산을 추가적으로 수행해줘야한다.
	}

}
