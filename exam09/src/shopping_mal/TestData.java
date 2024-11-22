package shopping_mal;

public class TestData {
	
	ShoppingMal shoppingMal = ShoppingMal.getInstance();
	
	Product desk;
	Product tv;
	Product mirror;
	
	Member member1;
	Member member2;
	Member member3;
	public void createProduct() {
		desk = new Product(1001, "피노테이블", 130000, 5);
		tv = new Product(1002, "LG룸앤티비", 300000, 3);
		mirror = new Product(1003, "전신거울", 13000, 8);
		
		shoppingMal.addProduct(desk);
		shoppingMal.addProduct(tv);
		shoppingMal.addProduct(mirror);
	}
	
	public void createMember() {
		member1 = new Member("princess", "12", "상암동");
		member2 = new Member("diakdrak", "123", "응암동");
		member3 = new Member("saleplz", "1234", "대정동");
		
		shoppingMal.addMemberList(member1);
		shoppingMal.addMemberList(member2);
		shoppingMal.addMemberList(member3);
		
		desk.addOrder(member1);
		desk.addOrder(member3);
		
		tv.addOrder(member2);
		
		mirror.addOrder(member1);
		mirror.addOrder(member2);
		mirror.addOrder(member3);
	}
	
	public void createOrderData() {
		OrderData orderData1 = new OrderData(desk, member1, "2024-02-01", "배송완료", "결제완료");
		OrderData orderData2 = new OrderData(desk, member3, "2024-11-22", "상품준비", "결제완료");
		OrderData orderData3 = new OrderData(tv, member2, "2024-04-21", "배송중", "결제완료");
		OrderData orderData4 = new OrderData(mirror, member1, "2024-08-11", "배송중", "결제완료");
		OrderData orderData5 = new OrderData(mirror, member2, "2024-08-21", "배송중", "결제완료");
		OrderData orderData6 = new OrderData(mirror, member3, "2024-08-29", "배송중", "결제완료");
		
		member1.addOrderData(orderData1);
		member1.addOrderData(orderData5);
		
		member2.addOrderData(orderData3);
		member2.addOrderData(orderData5);
		
		member3.addOrderData(orderData1);
		member3.addOrderData(orderData5);
	}
}
