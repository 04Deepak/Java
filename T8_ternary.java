package java_basic_l1;

public class T8_ternary {

	public static void main(String[] args) {

		
		int num=2;
		
		boolean result = num % 2 == 0 ? true : false;
		
//		variable = Expression1 ? Expression2: Expression3
		
		System.out.println(result);
		
		String op = result == true ? "even" : "odd";
		
		System.out.println(op);
		
		
	}

}
