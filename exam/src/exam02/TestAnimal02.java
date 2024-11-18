package exam02;

//	데이터를 담아 처리하는 클래스
//	설계도 - 새로운 자료형을 내가 만드는것 - 데이터클래스 menu1
public class TestAnimal02 {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal(1,"팡이",2,true);
		Animal [] animals = new Animal[2];
		String gender;
		
		animals[0] = new Animal(1,"뭉이", 5, true);
		animals[1] = new Animal(2,"크림", 3, false);
		
		
		
		for(int i=0; i<animals.length;i++) {
//			삼항연산자 - if ~ else (실행문장이 한줄짜리 코드일 때)
//			조건?참:거짓;
			gender = animals[i].getGender()?"남":"여";
//			System.out.printf("아이디 %d>> 이름 >> %s 나이 >> %d 성별 >> %s\n",animals[i].id,animals[i].name,animals[i].age,animals[i].gender?"남":"여");
			System.out.printf("아이디 %d>> 이름 >> %s 나이 >> %d 성별 >> %s\n",animals[i].getId(),animals[i].getName(),animals[i].getAge(),gender);
		}
		
		
		
	}
}
