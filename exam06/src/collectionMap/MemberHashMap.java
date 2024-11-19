package collectionMap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap; // Key,Value 형식으로 제네릭을 받음

	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}

	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) {

		if (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}

		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		// key 자료형에 대한 제네릭
		// keySet() - 목록의 키값만 추출하는 메서드
		Iterator<Integer> ir = hashMap.keySet().iterator();

		while (ir.hasNext()) {
			int key = ir.next();
			// list = get(인덱스번호) / map = get(키)
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
