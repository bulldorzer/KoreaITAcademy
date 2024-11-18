package Test01;

public class TrainToy extends Toy{


	// 변수생성
	
	//기차장난감 추가변수
	private int wheel;
	
//	getter setter
	public int getWheel() {
		return wheel;
	}
	
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	// 생성자
	public TrainToy() {}
	public TrainToy(String type) {
		super(type);
	}
	public TrainToy(String name, int price,String type,int wheel) {
		super();
		this.wheel = wheel;
	}

	@Override
	public String toString() {
		return "TrainToy [toString()=" + super.toString() +", wheel="+wheel+"]\n";
	}

}
