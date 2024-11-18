package exam05;

public class Test01 {

	public static void main(String[] args) {
		Car car = new Car("제네시스",2002,"대형");
//		ManualCar mcar = new ManualCar("산타페",2000,"싼타페 5세대 모델",150);
//		AiCar aicar = new AiCar("테슬라",2019,"Y 모델",0);
		Car mcar_2 = new ManualCar("산타페",2000,"싼타페 5세대 모델",150);
		Car aicar_2 = new AiCar("테슬라",2019,"Y 모델",20);
		
		Car [] carList = {car,mcar_2,aicar_2};
		
//		1) 자동형변환
//			일반자료형 : 정수->실수, 작은자료형->큰자료형
//			객체 : 자식 -> 부모
//		2) 강제형변환
//			일반자료형 : 정수<-실수, 작은<-큰자료형
//			객체 : 자식 <- 부모
		for(Car myCar : carList) {
			System.out.println("-------------------------");
			System.out.println(myCar);
			
			if (myCar instanceof AiCar ) {
				AiCar temp = (AiCar)myCar; // 강제형변환
				System.out.println("배터리잔여량"+temp.getBattery());
			}else if (myCar instanceof ManualCar) {
				int oil = ((ManualCar)myCar).getOil();
				System.out.println("오일잔여량"+oil);
			}else {
				System.out.println("오일/배터리 용량 알수 없음");
			}
			
			myCar.powerOn();
			myCar.powerOff();
		};
		
		System.out.println(car.toString());
		System.out.println("-------------------------");
//		mcar.setName("싼타페");
//		mcar.setYear(2000);
//		mcar.setModel("싼타페 5세대 모델");
//		mcar.powerOn();
//		mcar.powerOff();
//		System.out.println(mcar.toString());
		System.out.println("-------------------------");
		
//		aicar.setName("테슬라");
//		aicar.setYear(2019);
//		aicar.setModel("Y 모델");
//		aicar.powerOn();
//		aicar.powerOff();
//		System.out.println(aicar.toString());
		System.out.println("-------------------------");
		
	}

}
