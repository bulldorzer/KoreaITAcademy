package shopping_mal;

import java.util.ArrayList;

public class Product {
	// 상품 : 상품코드 이름 가격 재고 수량 카테고리 저장
	private int productId;
	private String productName;
	private int price;
	private int count;
	// 상품 주문한 회원 리스트
	private ArrayList<Member> memberList;
	
	public Product(int productId, String productName, int price, int count) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.count = count;
		memberList = new ArrayList<Member>();
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public ArrayList<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(ArrayList<Member> memberList) {
		this.memberList = memberList;
	}

	@Override
	public String toString() {
		return "productId=" + productId + 
				", productName=" + productName + 
				", price=" + price + 
				", count="+ count + 
				", memberList=" + memberList;
	}
	
	public void addOrder(Member member) {
		memberList.add(member);
	}
	
	
	
	
}
