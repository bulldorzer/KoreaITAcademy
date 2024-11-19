package collectionSet;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<String>();

		treeSet.add("홍길동");
		treeSet.add("이성계");
		treeSet.add("김유신");
		treeSet.add("홍길동"); // 중복X 오름차순정렬

		for (String str : treeSet) {
			System.out.println(str);
		}
	}

}
