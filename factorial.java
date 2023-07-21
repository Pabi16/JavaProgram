import java.util.*;
class factorial
{
    public static void main(String []args)
     {
        Scanner sc =new Scanner(System.in);
        int num=5;
        int i=1,fact=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of the number: " + fact);
     }
     
}