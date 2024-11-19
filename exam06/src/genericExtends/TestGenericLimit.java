package genericExtends;

public class TestGenericLimit {
	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial(); // 형변환 안함
		System.out.println(powderPrinter);
		
		
		// 만약 제너릭을 사용하지 않고 생성하면
		// 기본 Object로 지정됨
		// 값을 꺼내 왔을때, 형변환 필요
		GenericPrinter powderPrinter2 = new GenericPrinter();
		powderPrinter.setMaterial(new Powder());
		Powder powder2 = (Powder) powderPrinter2.getMaterial(); // 형변환 해야함
		
		
		GenericPrinter<Plastic> PlasticPrinter = new GenericPrinter<Plastic>();
		PlasticPrinter.setMaterial(new Plastic());
		Plastic plastic= PlasticPrinter.getMaterial(); // 형변환 안한
		System.out.println(PlasticPrinter.toString());
		
//		water는 Material의 자식클래스가 아니므로, 오류가 발생
//		GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
	}
}
