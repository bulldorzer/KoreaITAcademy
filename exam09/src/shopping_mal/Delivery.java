package shopping_mal;

public class Delivery implements Deliver{

	String deliverMthd;
	@Override
	public String getDelivery(String memGrade) {
		if (memGrade == "VIP") {
			deliverMthd = "무료배송";
		}else if (memGrade == "GOLD") {
			deliverMthd = "무료배송";
		}else {
			deliverMthd = "유로배송";
		}
		return deliverMthd;
	}

}
