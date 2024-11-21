package exam02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(3,2,13,24,7,99,1);
		
		// 오름차순 정렬
		numbers.stream()
			.sorted()
			.forEach(System.out::print);
		System.out.println("");
		// 내림차순 정렬
		numbers.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::print);
		System.out.println("");
		// 객체 정렬
		List<Person> people = Arrays.asList(
				new Person("Alice",30),
				new Person("Brown",25),
				new Person("Charlie",35)
				);
		people.stream()
			.sorted(Comparator.comparing(Person::getAge))
			.forEach(p->System.out.println(p.name+":"+p.age));
	}

}

class Person{
	
	String name;
	int age;
	
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
	
	
}