package exam01;

public class TestCar {

	public static void main(String[] args) {
		
//		자식 클래스에 추가된 기능X
//		모두 공통된 메서드를 가지고 있음.
//		업캐스팅ㅎ애서 관리해도 문제X
		
		Car car1 = new AiCar(); // 자식 -> 부모 업캐스팅
		Car car2 = new ManualCar();
		
		Car [] list = {car1,car2};
		
		for(Car car : list) {
			car.start();
			System.out.println("--------------------------");
		}
	}

}
