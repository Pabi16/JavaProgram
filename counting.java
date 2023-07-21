import java.util.*;
public class counting{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0,rem=0;
		int a=sc.nextInt();
		int b=sc.nextInt();
		while(a>0) {
			rem=a%10;
			if(rem==b) {
				count++;
			}
			a/=10;
			
		}
		System.out.println(count +" ");
    }
}