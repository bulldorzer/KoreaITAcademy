package exam03;

public class TestCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc();
		
		calc.description();
		
		int [] arr = {1,2,3,4,5};
		
		int total = Calculator.total(arr);
		System.out.println(total);
		
		Calculator.mystaticMethod();
	}

}
