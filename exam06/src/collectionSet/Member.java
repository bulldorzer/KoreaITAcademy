package collectionSet;

public class Member implements Comparable<Member> {
	private int memberId;
	private String name;

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Member() {
	}

	public Member(int memberId, String name) {
		this.memberId = memberId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		// 원래 내 책체의 주소값을 16진수로 리턴
		// 중복 여부를 검삭할 기준값 --> 리턴
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member member) {

			if (this.memberId == member.memberId) {
				System.out.println("중복저장불가");
				return true;
			} else {
				return false;
			}
		}

		return false;
	}

	@Override
	public int compareTo(Member member) {
//		return (this.memberId - member.memberId); // 오름차순
		return (this.memberId - member.memberId) * (-1); // 내림차순
	}

}
