package Test01;

public class Test01 {

	public static void main(String[] args) {
		
		Student [] stu = new Student[3];
		stu[0] = new Student("Aile", 11, "ABC-123", Define.GENDER_TYPE_MALE);
		stu[1] = new Student("Zegel", 7, "BCF-123", Define.GENDER_TYPE_FEMALE);
		stu[2] = new Student("Helmet", 9, "MBC-123", Define.GENDER_TYPE_MALE);
		Define define = new Define();
		
		
		for(Student student : stu) {
			
			System.out.println(student);
		}
//		System.out.println(stu.stu_info());

	}

}
