package java_basic_l1;

public class T11_while {
	public static void main(String[] args) {

		int i=0;
		
		while (i<5) {
			System.out.println("hi "+i);
			
			int j=0;
			
			while (j<4) {
				System.out.println("hello "+j);
				j+=1;
			}
			
//			i=i+1;
			i++;
		}
	}
}
