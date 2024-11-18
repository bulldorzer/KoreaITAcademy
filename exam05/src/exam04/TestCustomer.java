package exam04;

public class TestCustomer {

	public static void main(String[] args) {
		Customer cus = new Customer();
		cus.buy();
		cus.sell();
		cus.order();
		
		Buy buyer = cus;
		buyer.buy();
		
		Sell seller =cus;
		seller.sell();
		
		// 재정의된 메서드가 실행된다.
		buyer.order();
		seller.order();
	}

}
