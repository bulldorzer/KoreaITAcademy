package genericExtends;

public class Powder extends Material{
	
	@Override
	public String toString() {
		return "재료는 Powder 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다.");
		
	}
}
