package exam01;
// 기본적인 VO,DTO클래스 틀
public class Book {
//	제목 작가 가격 정보를 저장하는 멤버변수
	private static String company; //애
	private String title;
	private String author;
	private int price;
	
//	기본 생성자
	public Book() {
		
	}
	
//	생성자 오버로딩 - 초기화
	public Book(String title,String author,int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
//	getter -접근 가능한 public 메서드
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	
	public static String getCompany() {
		return company;
	}


	public static void setCompany(String company) {
		Book.company = company;
	}

	//	setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	// 금액이 0원 미만이면 - 음수는 입력할 수 없음 메세지출력 저장 X
	public void setPrice(int price) {
		if (price<0) {
			System.out.println("잘못된 입력방식입니다.");
			return;
		}else {
			this.price = price;
		}
	}

//	toString 재정의 - 멤버변수의 내용확인
	@Override
	public String toString() {
		return title+"/"+author+"/"+price;
	}


}
