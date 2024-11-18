package exam03;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		Person [] list = {p1,p2,p3};
		
		for(Person p : list) {
			System.out.println(p);
		}
		
		System.out.println("학생의 이름을입력해주세요");
		System.out.println("학생의 학년을입력해주세요");
		System.out.println("학생의 성별을입력해주세요");
	}

}
