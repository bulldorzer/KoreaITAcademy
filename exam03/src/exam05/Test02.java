package exam05;

public class Test02 {

	public static void main(String[] args) {
		
		CarFactory carFactory = CarFactory.getInstance();
		
//		자동차를 생산할 때 CarFactory를 통해 생산
		Car car01 = carFactory.createCar("모닝", 2020, "소형");
		Car car02 = carFactory.createCar("쿠페미니", 2021, "소형");
		
		System.out.println(car01);
		System.out.println(car02);
	}

}
