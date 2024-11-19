package array;

import java.util.Iterator;

// 자료구조
// 배열, 링크드리스트, 스택, 큐
/*
 * Array 자료구조
 * 	동일한 데이터 타입을 순서에 따라 관리하는 자료 구조
 *  정해진 크기가 있음
 *  요소의 추가와 제거시 다른 요소들의 이동이 필요함 -> 추가, 제거 연산 상대적 느림
 *  배열의 i 번째 요소를 찾는 인덱스 연산이 빠름.
 */
public class IntArray {
	
	Book [] arr ; // 저장할 배열변수 선언
	int count; // 저장된 갯수 저장
	
	public static final Book ERROR_NUM = null;
	public static final int ARR_SIZE = 7;
	
	public IntArray() {
		arr = new Book[ARR_SIZE];
		count = 0;
	}
	
	public IntArray(int arr_size) {
//		인수로 받은 크기만큼 배열 설정해라
		arr = new Book[arr_size]; 
		count = 0;
	}
	
	public Book get(int index) {
		if (index <0 || index > count) {
			System.out.println("인덱스 오류");
			return null;
		}
		return arr[index];
	}
	
//	add - 마지막에 데이터 추가
	public Book add(Book n) {
//		System.out.println(n);
//		arr[count]=n;
//		count++;
//		위 두줄 코드가 아래와 같음
		arr[count++]=n;
		
		return n; // 방금 추가한 값 리턴
	}
	
//	insert index 번호에 숫자들 삽입하고 한칸뒤로 숫자를 미룬다.
//	0~현재 저장된 갯수 사이의 인덱스번호가 들어와야 함.

	public void insert(int index, Book n) {
		// 배열 인덱스 끝자리에서 내가 삽입 할 자리까지 반복한다
		for (int i = count-1; i >= index; i--) { 
			// 원래 있던값이 한칸씩 뒤로 밀린다.
			arr[i+1] = arr[i];
		}
		// 원하는 자리에 삽입 할 값을 넣어준다.
		arr[index] = n;
		// 배열의 길이를 늘려준다.
		count++;
	}
	
//	remove 지정한 index 번호에 뒤에 있던 값들을 앞으로 당겨 삭제할 데이터를 덮어서 없애는 값 지금같은경우는 삭제할 값을 value에 저장해 return으로 뱉어낸다
	public Book remove(int index) {
	
//		범위에 벗어나는 인덱스 번호가 들어오면 "인덱스 번호 오류" 메서드 종료
//		꽉찬 경우 더이상 저장할수가 없습니다 출력 메서드 종료
		// 인덱스번호가 0보다 작거나 배열 데이터 길이보다 큰경우 메소드 종료
		Book book = null;  // 호출한 영역에서 null값을 받았을때 처리하는 구문추가
		if (index>count-1&&index<0) {
			System.out.println("인덱스 번호 오류");
			return book;
		}
		if (count>=arr.length) {
			System.out.println("더 이상 저장할수가 없습니다.");
			return book;
		}
		
		
		// 삭제할 자리를 지정
//		int value = arr[index];
		book = arr[index];
		
		// 삭제할 자리에서 끝자리까지 반복
		for (int i = index; i < count; i++) { 
			// 뒤에 있던 값을 앞으로 당김(덮어쓰기)	
			arr[i] = arr[i+1]; 
		}
		// 배열 길이를 줄여준다?-->데이터저장할 값을 줄인것일 뿐 배열의크기에 영향이 있진 않다
		count--;
		
		return book;
	}
	
	public int size() { // 데이터 저장 갯수 반환 - 배열 갯수X
		return count;
	}
	
	public boolean isEmpty() {
		return (count==0)?true:false;
	}
	
	public void printAll() {
		if (count==0) {
			System.out.println("출력할 내용이 없습니다");
			return;
		}
		for (int i = 0; i < count; i++) {
			System.out.println(arr[i]);
		}
	}
	
	// 전체 값을 0으로 초기화
	public void removeAll() {
		for (int i = 0; i < count; i++) {
			arr[i]=null;
		}
		// 갯수도 0으로 초기화
		count = 0; 
	}
}
