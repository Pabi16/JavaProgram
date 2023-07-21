import java.util.*;
public class palindrome
{
	public static void main(String[] args) 
	{
	   Scanner obj = new Scanner(System.in);
	   int num = obj.nextInt();
	   int rem,rev=0;
	   int temp = num;
	   while(num!=0)
	   {
	       rem = num%10;
	       rev = rev*10+rem;
	       num = num/10;
	       
	   }
	   if(temp == rev)
	   {
	        System.out.println("Palindrome");
	   }
	   else
	   {
	       System.out.println("not palindrome");
	   }
	}
}