package Test01;

public class Toy {
	protected static int SERIAL_NUM = 1000;
	protected int id;
	protected String name;
	protected int price;
	protected String type;
	
//	getter,setter
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getPrice() {
		return price;
	}
	protected void setPrice(int price) {
		this.price = price;
	}
	protected String getType() {
		return type;
	}
	protected void setType(String type) {
		this.type = type;
	}
	
	// 생성자
		protected Toy() {
			this.id = ++SERIAL_NUM;
		}
		
		protected Toy(String type) {
			this.name = type;
		}
		protected Toy(String name, int price,String type) {
//			super();
			this();
			this.name = name;
			this.price = price;
			this.type = type;
		}
		
	@Override
	public String toString() {
		return "ToyFactory [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type ;
	}
}
