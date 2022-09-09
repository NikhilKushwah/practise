
public class SwappingNumbers {
	
	
	public static void swapNumbers(int a, int b)
	{
		b=b +a;
		a= b-a;
		b= b-a;
	}

	public static void main(String[] args)
	{
		int a =10;
		int b= 20;
		
		swapNumbers(a, b);

		
		System.out.printf("After Swapping:" +a+ " " +b);
	}

}
