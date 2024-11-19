package collectionSet;


public class TestHashSet {

	public static void main(String[] args) {
		MemberHashSet set = new MemberHashSet();
		
		Member Lee = new Member(1001,"이성계");
		Member Kim = new Member(1002,"김유신");
		Member Kang = new Member(1003,"강감찬");
		
		set.addMember(Lee);
		set.addMember(Kim);	
		set.addMember(Kang);
		set.showAllMember();
		
		Member Hong = new Member(1003,"홍길동");
		Member Hong2 = new Member(1002,"홍길동");
		
		set.addMember(Hong);
		set.addMember(Hong2);
		set.showAllMember();
		
	}

}
