package java_basic_l1;

public class T3_DataType {

	public static void main(String[] args) {
		
		
//						1.Primitive 		-> byte , short , int , long , float , double , boolean , char
//		Data types 
//						2.Non-Primitive		-> strings , arrays , classes
		
		
		
		
		
		
		
		
//		byte	1 byte	Stores whole numbers from -128 to 127
//		short	2 bytes	Stores whole numbers from -32,768 to 32,767
//		int		4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//		long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//		float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//		double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
//		boolean	1 bit	Stores true or false values
//		char	2 bytes	Stores a single character/letter or ASCII values
//		00000001
		
		double d = 5.6;
		float f = 5.9999999996f;		//	6 to 7 decimal digits
		
		
		
		boolean b= true;
		
		int i = 5;
		long l= 5555l;
		
		
		
		int num = 0b101; // 101  -> 5
		System.out.println(num);
		
		num = 0x7E;
		System.out.println(num);
		
		
		num = 10_00_00_000;
		System.out.println(num);
	
		
		char c= 'a';
		c = (char) (c+1);
		System.out.println(c);
		
		
		char ch = 'A';
		String s = "Deepak";
		
		
		
	}

}
