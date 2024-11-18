package Pratice01;

public class DataClass01 {
//	오토바이 틀 만들기
	
	// 변수 오토바이이름, 오토바이종류, 오토바이배기량
	protected String bikeName;
	protected String bikeKind;
	protected int bikeCc;
	protected static final int SERIAL_NUM=1000;
	protected int bikeId;
	
	//  getter,setter
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public String getBikeKind() {
		return bikeKind;
	}
	public void setBikeKind(String bikeKind) {
		this.bikeKind = bikeKind;
	}
	public int getBikeCc() {
		return bikeCc;
	}
	public void setBikeCc(int bikeCc) {
		this.bikeCc = bikeCc;
	}
	
	public DataClass01() {
		bikeId = SERIAL_NUM+1;
	}
	public DataClass01(String bikeName, String bikeKind, int bikeCc) {
		this();
		this.bikeName = bikeName;
		this.bikeKind = bikeKind;
		this.bikeCc = bikeCc;
	}
	@Override
	public String toString() {
		return "bikeId=" + bikeId +"bikeName=" + bikeName + ", bikeKind=" + bikeKind + ", bikeCc=" + bikeCc;
	}
	
	
	
	
}
