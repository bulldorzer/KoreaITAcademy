package exam02;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 참조변수 : 주소값 가지고 있다.
		// == : 주소값의 비교를 한다.
		
		String str1 = "hello";
		String str2 = "hello";
		// 새로운 공간에 메모리 할당
		// 내용을 같지만, 다른 주소값에 hello가 저장
		String str3 = new String("hello");
		String temp = str3;		
		
		// 주소값이 같냐?
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		// Q. 해당 값이 같은지 알고 싶으면?
		// equals() - 값의 비교를 수행함
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
				
	}

}




