package exam02;

import java.util.Arrays;

public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 91, 82, 53, 64, 75 };

		// stream 데이터형식으로 반환 Arrays.stream(자료)
		// 중간 연산을 수행하는 메서드 - filter(), map(), sorted()
		// 결과 연산을 수행하는 메서드 - sum(), count(), forEach()
		// 중간/결과 연산메서드 매개변수에 = 람다식이 들어간다
		// filter((매개변수)->조건문)
		// map ((매개변수) -> 처리할 구문 )
		// sorted ((매개변수)-> 정렬조건)
		// forEach(매개변수) -> 처리할 구문)
		int sum = Arrays.stream(arr).sum();
		long count = Arrays.stream(arr).count();

		System.out.println(sum);
		System.out.println(count);
		System.out.println((double) sum / count);

		// 1. stream 형태 변환
		// 2. 중간연산 - filter 조건에 맞는 데이터만 걸러줌
		// ex)
		// (num)->num>=80
		// public boolean 함수이름 (num){
		// return (num>=80)?true:false
		// }
		// stream filter 예시
		// => true에 맞는 값만 stream 형태 다음 단계로 넘겨준다
		int result = Arrays.stream(arr).filter((num) -> num >= 80).sum();// 람다식으로 처리해야함
		System.out.println(result);

		// 1. stream 형태 변환
		// 2. 중간연산 - filter 조건에 맞는 데이터만 걸러줌
		// 3. 결과연산 - sum() - 합계 구해줌
		Arrays.stream(arr).filter((num) -> num >= 80).forEach((n) -> System.out.print(n + "\t"));

		// filter - 조건에 맞는 데이터만 걸러낸다.
		// map - 내가 적용하고 하는 데이터로 변환한다 -> 새로운 목록 생성
		// sum, count, forEach 연산을 추가적으로 수행해줘야한다.
	}

}
