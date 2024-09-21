package java_basic_l1;

public class T4_TypeCasting {
	
	public static void main(String[] args) {
		
//		Widening Casting (automatically) - converting a smaller type to a larger type size
//		byte -> short -> char -> int -> long -> float -> double
//
//		Narrowing Casting (manually) - converting a larger type to a smaller size type
//		double -> float -> long -> int -> char -> short -> byte

		
		int i=12;
		
		byte b=(byte) (i);
		
		System.out.println(b);
		
		
		float f=2.2f;
		
		int a=(int)f;
		
		System.out.println(a);
		
		
		byte num1=10;
		byte num2=20;
		int result=num1*num2;
		System.out.println(result);
		
	}

}
