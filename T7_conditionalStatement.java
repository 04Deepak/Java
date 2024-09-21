package java_basic_l1;

public class T7_conditionalStatement {
	public static void main(String[] args) {
		
		
//		Use if to specify a block of code to be executed, if a specified condition is true
//		Use else to specify a block of code to be executed, if the same condition is false
//		Use else if to specify a new condition to test, if the first condition is false
//		Use switch to specify many alternative blocks of code to be executed
		
//		int a = 3;
//		
//		if(a==2) {
//			System.out.println("its 2");
//		}
//		else if(a==3) {
//			System.out.println("its 3");
//		}
//		else {
//			System.out.println("its not ");
//		}
		
		int x = 2;
		int y = 4;
		
		if(x>y) {
			System.out.println("x is greater");
		}else if(x<y) {
			System.out.println("y is greater");
		}else {
			System.out.println("equalll");
		}
		
	}

}
