package collectionArrayList;

public class TestMemberList {

	public static void main(String[] args) {
		Member Lee = new Member(1001,"이순신");
		Member Kim = new Member(1002,"김유신");
		Member Kang = new Member(1003,"감강찬");
		Member Hong = new Member(1004,"홍길동");
		
		MemberArrayList list = new MemberArrayList();
		
		list.addMember(Lee);
		list.addMember(Kim);
		list.addMember(Kang);
		list.addMember(Hong);
		
		list.showAllMember();
		
		
		list.removeMember(Lee.getMemberId());
		list.removeMember(Kim.getName());
		list.showAllMember();
	}

}
