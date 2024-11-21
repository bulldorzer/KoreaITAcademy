package exam02;

import java.util.Arrays;
import java.util.List;

public class TestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(1,8,3,9,5);
		int max = numbers.stream()
					.max(Integer::compareTo)
					.get();
		
		System.out.println(max);
		
		// 각 Integer 요소를 double로 변환
		// 평균을 구하고 결과값을 double데이터로 가져온다.
		List<Integer> numbers2 = Arrays.asList(1,2,3,4,5);
		double average = numbers2.stream()
							.mapToDouble(Integer::doubleValue)
							.average().getAsDouble();
		
		System.out.println(average);
		
	}

}
