package exam04;

//	부모클래스, 슈퍼클래스

public class Animal {
	
	protected static int serialNum;
	
	protected String name;
	protected int age,id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Animal [id=" + id+", name=" + name + ", age=" + age + "]";
	}
	
	public Animal() {
		this.serialNum=1000;
		this.id = ++serialNum;
	}
	public Animal(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}


	public void eat() {
		System.out.print(name+"가 밥을 먹습니다.");
	}
}
