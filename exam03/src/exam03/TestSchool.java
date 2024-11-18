package exam03;

public class TestSchool {

	public static void main(String[] args) {
		
//		School.setName("KOREA");
//		System.out.println(School.getName());
//		School school01 = new School(1);
//		School school02 = new School(2);
//		School school03 = new School(3);
//		
//		School.setName("abc");
//		
//		School [] list = {school01,school02,school03};
//		for(School school : list) {
//			school.setNo(10+school.getNo());
//			System.out.println(school);
//		}
		School s1 = School.getInstance();
		School s2 = School.getInstance();
		School s3 = School.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
