package shopping_mal;

import java.util.ArrayList;

public class MemberBilji {
	// 양식 문자열
	public static final String TITLE = " 회원님 주문내역 멤버등급";
	public static final String HEADER = "물건이름|가격|주문날짜|배송상태";
	public static final String LINE = "----------------------------\n";
	
	private StringBuffer buffer = new StringBuffer();
	
	public void makeHeader(Member member) {
		buffer.append(LINE);
		buffer.append(member.getMemberId()+TITLE+"\n"+LINE);
	}
	
	public void makeBody(ShoppingMal shoppingMal) {
		 ArrayList<Product> productList = shoppingMal.getProductList();
		 ArrayList<Member> memberList = shoppingMal.getMemberList();
		 ArrayList<OrderData> orderDataList = shoppingMal.getOrderDataList();
		 
		 for (Member member : memberList) {
			
		}
	}
}
