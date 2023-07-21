import java.util.*;
public class righttoleft
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int a=sc.nextInt();
        while(a>0){
            int rem = a%10;
        System.out.print(rem+" ");
        a=a/10;
        }

    }
}