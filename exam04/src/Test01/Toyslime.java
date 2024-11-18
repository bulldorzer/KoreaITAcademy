package Test01;

public class Toyslime extends Toy{


	// 변수생성
	
	//기차장난감 추가변수
	private int texture;
	private int weight;
	
//	getter setter
	public int getTexture() {
		return texture;
	}
	public void setTexture(int texture) {
		this.texture = texture;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	// 생성자
	public Toyslime() {}
	
	public Toyslime(String type) {
		super(type);
	}
	public Toyslime(String name, int price,String type,int texture,int weight) {
		super();
		this.texture = texture;
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Toyslime [toString()=" + super.toString() +", texture="+texture +", weight="+weight +"]\n";
	}

}
