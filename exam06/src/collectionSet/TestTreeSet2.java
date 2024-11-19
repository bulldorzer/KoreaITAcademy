package collectionSet;

public class TestTreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeSet treeSet = new MemberTreeSet();

		Member kim = new Member(1001, "김시민"); // 중복X 오름차순정렬
		Member you = new Member(1002, "유성계");
		Member kang = new Member(1003, "강감찬");

		treeSet.addMember(kim);
		treeSet.addMember(you);
		treeSet.addMember(kang);

		treeSet.showAllMember();
	}

}
