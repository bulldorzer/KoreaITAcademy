package collectionArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

	private ArrayList<Member> list;

	

	public MemberArrayList() {
		list = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		list.add(member);
	}
	
	// 삭제 - 삭제할 멤버아이디
	public boolean removeMember(int memberId) {
//		list를 반복문 돌려서, 삭제할 멤버아아디와 일치하는 것을 찾는다
//		일치하는 것의 인덱스 번호 체크
//		해당 인덱스 번호로 삭제해달라고함 --> list.remove(i);
//		삭제 성공의 의미로 true 리턴(종료)
		
		Iterator<Member> ir = list.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next(); // 요소값 저장
			int currentId = member.getMemberId();
			if (currentId == memberId) {
				list.remove(memberId);
				return true;
			}
		}
		
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
		
	}
	
	// 삭제 - 삭제할 멤버아이디
		public boolean removeMember(String memberName) {
//			list를 반복문 돌려서, 삭제할 멤버이름과 일치하는 것을 찾는다
//			일치하는 것의 인덱스 번호 체크
//			해당 인덱스 번호로 삭제해달라고함 --> list.remove(i);
//			삭제 성공의 의미로 true 리턴(종료)
			
			Iterator<Member> ir = list.iterator();
			
			while(ir.hasNext()) {
				Member member = ir.next(); // 요소값 저장
				String currentId = member.getName();
				if (currentId.equals(memberName)) {
					list.remove(member);
					return true;
				}
			}
			
//			for (int i = 0; i < list.size(); i++) {
//				if (memberName.equals(list.get(i).getName()) ) {
//					list.remove(i);
//					System.out.println(memberName+"회원님  삭제되었습니다.");
//					return true;
//				}
//			}
			System.out.println(memberName+"회원님이 존재하지 않습니다.");
			return false;
			
		}
	
	// 삭제 - 삭제할 멤버아이디 강사님 설정
//		public boolean removeMember(int memberId) {
////			list를 반복문 돌려서, 삭제할 멤버아아디와 일치하는 것을 찾는다
////			일치하는 것의 인덱스 번호 체크
////			해당 인덱스 번호로 삭제해달라고함 --> list.remove(i);
////			삭제 성공의 의미로 true 리턴(종료)
//			for (int i = 0; i < list.size(); i++) {
//				Member member = list.get(i);
//				int currentId = member.getMemberId();
//				if (memberId == currentId) {
//					list.remove(i);
//					System.out.println(memberId+"회원 아이디는 삭제되었습니다.");
//					return true;
//				}
//			}
//			System.out.println(memberId+"가 존재하지 않습니다.");
//			return false;
//			
//		}
		
		public void showAllMember() {
			for (Member member : list) {
				System.out.println(member);
			}
			System.out.println();
		}

}
