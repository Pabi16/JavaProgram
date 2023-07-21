import java.util.*;
public class  triperfact
{
	public static void main(String args[]) 
	{
	    Scanner obj = new Scanner(System.in);
	    int sum=0;
		int num = obj.nextInt();
		for(int i=1;i<=num;i++)
		{
		    if(num%i==0)
		    {
		        sum = sum + i;
		    }
		    
		}
		if(sum==num*3)
		{
		    System.out.println("Triperfect number");
		}
		else
		{
		    System.out.println("Not a Triperfect number");
		    
		}
		
	}
}