package collectionMap;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashMap hashMap = new MemberHashMap();

		Member kim = new Member(1001, "김시민"); // 중복X 오름차순정렬
		Member you = new Member(1002, "유성계");
		Member kang = new Member(1003, "강감찬");

		hashMap.addMember(kim);
		hashMap.addMember(you);
		hashMap.addMember(kang);

		hashMap.showAllMember();

		hashMap.removeMember(1002);
		hashMap.showAllMember();

	}

}
