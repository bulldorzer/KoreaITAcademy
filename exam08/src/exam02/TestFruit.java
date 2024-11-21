package exam02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestFruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 리스트 자료형에 과일이름 5개 정도 영어로 저장해서 초기화
		// 글자길이가 5글자 이상인 것만 새로운 리스트로 추출하고 -filter
		// 출력 (stream+람다식)
		
		List<String> fruits = Arrays.asList("apple","banana","cherry","pear","bam");
		
		fruits.stream()
			.filter(fruit->fruit.length()>5)
			.forEach((f)->System.out.println(f+"\t"));
		
		
		System.out.println("");
		List<String> newFruits =fruits.stream()
			.filter(fruit->fruit.length()>5)
			.collect(Collectors.toList());
		newFruits.stream().forEach(System.out::println);
		
		System.out.println("");
		
		List<String> startAFruits = fruits.stream()
				.filter(fruit->fruit.charAt(0)=='a')
				.collect(Collectors.toList());
	
		startAFruits.stream().forEach(System.out::println);
	System.out.println("");
		
		long fruitsCount =fruits.stream()
		.filter(fruit->fruit.length()>5)
		.count();
		System.out.println(fruitsCount);

	}

}
