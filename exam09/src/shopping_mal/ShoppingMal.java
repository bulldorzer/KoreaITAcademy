package shopping_mal;

import java.util.ArrayList;

public class ShoppingMal {

	private ArrayList<Product> productList; // 물건목록
	private ArrayList<Member> memberList; // 회원목록
	private ArrayList<OrderData> orderDataList; // 주문목록
	private static ShoppingMal instance = null;
	
	private ShoppingMal() {
		super();
		productList = new ArrayList<Product>();
		memberList = new ArrayList<Member>();
		orderDataList = new ArrayList<OrderData>();
	}
	
	public static ShoppingMal getInstance() {
		if (instance == null) {
			instance = new ShoppingMal();
		}
		return instance;
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}

	public ArrayList<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(ArrayList<Member> memberList) {
		this.memberList = memberList;
	}

	public ArrayList<OrderData> getOrderDataList() {
		return orderDataList;
	}

	public void setOrderDataList(ArrayList<OrderData> orderDataList) {
		this.orderDataList = orderDataList;
	}

	@Override
	public String toString() {
		return "productList=" + productList 
				+ ", memberList=" + memberList 
				+ ", orderDataList="+ orderDataList;
	}
	
	public void addProduct(Product product) {
		productList.add(product);
	}
	public void addMemberList(Member member) {
		memberList.add(member);
	}
	public void addOrderDataList(OrderData orderData) {
		orderDataList.add(orderData);
	}
	
	
}
