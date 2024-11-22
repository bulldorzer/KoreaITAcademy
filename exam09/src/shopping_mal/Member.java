package shopping_mal;

import java.util.ArrayList;

public class Member {

	// 회원 : 회원아이디 비밀번호 주소 주문내역 저장
	private String memberId;
	private String pwd;
	private String address;
	private ArrayList<OrderData> orderDataList;
	
	public Member() {}
	public Member(String memberId, String pwd, String address) {
		super();
		this.memberId = memberId;
		this.pwd = pwd;
		this.address = address;
		orderDataList = new ArrayList<OrderData>();
	}
	
	// getter setter
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ArrayList<OrderData> getOrderDataList() {
		return orderDataList;
	}
	public void setOrderDataList(ArrayList<OrderData> orderDataList) {
		this.orderDataList = orderDataList;
	}
	@Override
	public String toString() {
		return "memberId=" + memberId + 
				", pwd=" + pwd + 
				", address=" + address + 
				", orderDataList=" + orderDataList;
	}
	
	public void addOrderData(OrderData orderData) {
		orderDataList.add(orderData);
	}
	
	
}
