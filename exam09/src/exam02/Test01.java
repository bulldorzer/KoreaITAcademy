package exam02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import exam01.Person;

public class Test01 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("banana","apple","orange");
		
		// 객체명.stream().결과메서드(); => 기본형식
		// 객체명.stream().중간메서드().결과메서드();
		
		List<String> sortedNames = names.stream()
										.sorted()
										.collect(Collectors.toList());
		// 오름차순 배치
		System.out.println(sortedNames);
		
		sortedNames = names.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		// 내림차순 배치
		System.out.println(sortedNames);
		
		// 객체의 특정 필드를 기준으로 정렬
//		List<Person> people = Arrays.asList(new Person("홍길동",30)
//											,new Person("이순신",24)
//											,new Person("김유신",26));
//		
//		List<Person> sortedPeople =people.stream()
//				.sorted(Comparator.comparing(Person::getAge))
//				.collect(Collectors.toList());
//		
//		sortedPeople.stream().forEach(System.out::println);
		
		List<Person> people = Arrays.asList(new Person("홍길동",30)
											,new Person("이순신",27)
											,new Person("이순신",24)
											,new Person("이순신",26)
											,new Person("김유신",26));
		
		// 이름과 나이를 비교하여 오름차순으로 정렬되었다.
		List<Person> sortedPeople =people.stream()
		.sorted(Comparator.comparing(Person::getName)
							.thenComparing(Person::getAge) )
		.collect(Collectors.toList());
		
		sortedPeople.stream().forEach(System.out::println);
		
	}
}
