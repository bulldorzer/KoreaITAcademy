package Pratice01;

public class DataClass02 extends DataClass01{
//	모터 사이클 클래스
	private int wheel;	// 바퀴갯수
	private int fuelCy; // 연료통양
	
	
	

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public int getFuelCy() {
		return fuelCy;
	}

	public void setFuelCy(int fuelCy) {
		this.fuelCy = fuelCy;
	}

	private DataClass02() {	}

//	public DataClass02(int wheel, int fuelCy) {
//		super();
//		this.wheel = wheel;
//		this.fuelCy = fuelCy;
//	}  <= 처음시도했던 방법
	
	public DataClass02(String bikeName, String bikeKind, int bikeCc, int wheel, int fuelCy) {
		super(bikeName, bikeKind, bikeCc);
		this.wheel = wheel;
		this.fuelCy = fuelCy;
	}

	@Override
	public String toString() {
		return "bikeId=" + bikeId +"bikeName=" + bikeName + ", bikeKind=" + bikeKind + ", bikeCc=" + bikeCc+", wheel=" + wheel + ", fuelCy=" + fuelCy ;
	}
	
	public static DataClass02 getInstance(String bikeName, String bikeKind, int bikeCc, int wheel, int fuelCy) {
		
		DataClass02 instance = new DataClass02(bikeName,bikeKind, bikeCc, wheel, fuelCy);
		
		return instance;
	}
	
	
	
	
}
