package java_basic_l1;

public class T6_LogicalOperator {
	public static void main(String[] args) {
		
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		
//		AND Operator ( && ) – if( a && b ) [if true execute else don’t]
		System.out.println("AND");
		System.out.println((a<b)+"\t"+(c<d)+"\t->\t"+(a<b&&c<d));	//		t	t	->	t
		System.out.println((a<b)+"\t"+(c>d)+"\t->\t"+(a<b&&c>d));	//		t	f	->	f
		System.out.println((a>b)+"\t"+(c<d)+"\t->\t"+(a>b&&c<d));	//		f	t	->	f
		System.out.println((a>b)+"\t"+(c>d)+"\t->\t"+(a>b&&c>d));	//		f	f	->	f
		System.out.println("\n");
		
		
		
//		OR Operator ( || ) – if( a || b) [if one of them is true to execute else don’t]
		System.out.println("OR");
		System.out.println((a<b)+"\t"+(c<d)+"\t->\t"+(a<b||c<d));	//		t	t	->	t
		System.out.println((a<b)+"\t"+(c>d)+"\t->\t"+(a<b||c>d));	//		t	f	->	t
		System.out.println((a>b)+"\t"+(c<d)+"\t->\t"+(a>b||c<d));	//		f	t	->	t
		System.out.println((a>b)+"\t"+(c>d)+"\t->\t"+(a>b||c>d));	//		f	f	->	f
		System.out.println("\n");
		
		
		
//		NOT Operator ( ! ) – !(a<b) [returns false if a is smaller than b]
		System.out.println("NOT");
		System.out.println((a<b)+"\t->\t"+(!(a<b)));	//		t	->	f
		System.out.println((a>b)+"\t->\t"+(!(a>b)));	//		f	->	t
		
		
		
		System.out.println(a<b);
		boolean b1=a<b;
		System.out.println(a>b);
		boolean b2=a>b;
		System.out.println(b1&&b2);
		System.out.println((a<b)+" "+(c<d)+" "+(a<b&&c<d));
		
		
	}

}
