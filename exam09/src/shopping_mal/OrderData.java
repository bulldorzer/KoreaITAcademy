package shopping_mal;

public class OrderData {
	// 주문정보 : 주문물건아이디, 주문날짜 배송상태 결제정보 저장
	private Product product;
	private Member member;
	private String orderDate;
	private	String deliveryStatus;
	private String paymentInfo;
	
	public OrderData() {}

	public OrderData(Product product, Member member, String orderDate, String deliveryStatus, String paymentInfo) {
		super();
		this.product = product;
		this.member = member;
		this.orderDate = orderDate;
		this.deliveryStatus = deliveryStatus;
		this.paymentInfo = paymentInfo;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product productId) {
		this.product = productId;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member memberId) {
		this.member = memberId;
	}

	
	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(String paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	@Override
	public String toString() {
		return "product=" + product + 
				", orderDate=" + orderDate + 
				", deliveryStatus=" + deliveryStatus+ 
				", paymentInfo=" + paymentInfo;
	}
	
	
	
}
