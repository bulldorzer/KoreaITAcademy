package exam04;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an = new Animal();
		Cat cat = new Cat("만복이",5);
		Dog dog = new Dog("크림", 1);
		
		System.out.println(an);
		System.out.println(cat);
		System.out.println(dog);
		cat.eat();
		cat.sound();
		
		dog.eat();
		dog.sound();
	}

}
