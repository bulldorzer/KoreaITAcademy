package exam01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		String name1 = "홍길동";
		String name2 = "이몽룡";
		String name3 = "변사또";
		
		int r1 = name2.compareTo(name1);
		int r2 = name1.compareTo(name2);
		
		// 0: 두문자열이 같을때
		// 양수 : 첫번째 문자열이 두 번째 문자열보다 사전순으로 뒤에 올 때
		// 음수 : 첫번째 문자열이 두 번째 문자열보다 사전순으로 앞에 올 때
		System.out.println(r1);
		System.out.println(r2);
		
		List<String> names = Arrays.asList("홍길동","이몽룡","변사또");
		
		// Collections.sort(객체명, 정렬기준) - 람다식 or 메서드 참조
		// 람다식
		Collections.sort(names, (s1,s2)->s1.compareTo(s2));

		// 클래스의 일반 인스턴스 메소드 참조
		Collections.sort(names, String::compareTo);
		
		System.out.println(names);
		
	}

}
