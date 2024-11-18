package exam01;

public class Test02 {

	public static void main(String[] args) {
		// 반복문
		// 복합대입 연산자
		
		int n = 10;
		int m = 3;
		
		n += m; // -> n = n + 10 -- 값 누적 증가
		System.out.println(n);
		n -= m; //-> 누적 감소
		System.out.println(n);
		n *= m;
		System.out.println(n);
		n /= m;
		System.out.println(n);
		n %= m;
		System.out.println(n);
		
		System.out.println();
		
		// 증감연산자
		// 후위연산자 : 모든 연산을 먼저 수행하고 마지막 증가
		// 1) 출력  2) 증가
		System.out.println( n++ );
		System.out.println( n );
		
		n = 1;
		// 전위연산자 : 모든 연산중 가장 먼저 수행하고 나머지 실행
		// 1) 증가 2) 나머지 작업 수행
		System.out.println( ++n ); // 연산자 우선순위가 높다
		System.out.println( n );
		
		n--;
		--n;
		
		

	}

}
