package genericExtends;

//T extends 부모클래스
//타입 제한 : 해당 부모클래스를 상속받은 타입만 사용 가능

public class GenericPrinter<T extends Material >{

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}

	
	public void printing() {
		material.doPrinting();
	}
}
