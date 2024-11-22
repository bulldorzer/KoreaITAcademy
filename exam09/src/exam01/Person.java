package exam01;

interface PersonFactory{
	Person create(String name, int age);
}

public class Person {
	
	// 생성자 참조
	String name;
	int age;
	
	
	public Person() {
		
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

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
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	
	
}
