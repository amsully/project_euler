package problems_1_9;

public class Problem5 {

	public static void main(String[] args)
	{
		long sumOfSquares = 0;
		
		for(int i = 0; i <= 100; i++)
		{
			sumOfSquares = sumOfSquares + i*i;
		}
		
		System.out.println(sumOfSquares);
	
		long squareOfSum = 0;
		
		for(int i = 0; i<= 100; i++)
		{
			squareOfSum = squareOfSum + i;
		}
		System.out.println(squareOfSum + " pre - square");
		squareOfSum = squareOfSum*squareOfSum;
		
		System.out.println(squareOfSum);
		
		System.out.println(squareOfSum - sumOfSquares);
		
	}
	
	
	
}
