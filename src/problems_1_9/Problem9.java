package problems_1_9;
import java.util.*;
import java.math.*;

public class Problem9 {
	
	
	public static void main(String[] args)
	{
		
		int a = 0;
		int b = 0;
		double c = 0;
	
		
		for( int i = 0; i <= 1000; i++)
		{
			for( int j = 0; j <= 1000; j++)
			{
				a = i;
				b = j;
				c = Math.sqrt(a*a+b*b);
				
//				System.out.println(a + " " + b + " "+  c);

				if(a+b+c == 1000)
				{
					System.out.println(a + " " + b + " "+  c);
					System.out.println((a*b*c));
				}
			}
		}
		
	}
	
	
}
