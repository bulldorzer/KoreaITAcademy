package Pratice01;

public class MainClass {
	public static void main(String[] args) {
		DataClass02 test = DataClass02.getInstance("eb-119", "1L모터사이크", 1000, 2, 2000);
		System.out.println(test.toString());
	}
}
