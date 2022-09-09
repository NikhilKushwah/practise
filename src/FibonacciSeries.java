
public class FibonacciSeries {

	public static void main(String[] args)
	{
		// In fibonacci series it add the previous 2 numbers
		int n1=0;
		int n2=1;
		int n3;
		int count=20;
		
	//	System.out.println(n1+" "+n2); // this will 0 and 1
		
		for(int i=2; i<count; i++)
		{
			n3=n1+n2;
			
			System.out.print(" "+n3);
			
			n1=n2;
			n2=n3;
		}

	}

}
