package java_basic_l1;

public class T2_variables {

	public static void main(String[] args) {
		
		System.out.println(1+2);
		
		int num1=1;
		int num2=2;
		System.out.println(num1+num2);
		
		int result = num1+num2;
		System.out.println(result);
		
		
//		The value stored in a variable can be changed during program execution.
//		Variables in Java are only a name given to a memory location. All the operations done on the variable affect that memory location.
//		In Java, all variables must be declared before use.
		
		String name = "Deepak";
		System.err.println(name);
		name = "karan";
		System.err.println(name);
	}

}
