import java.util.*;
import java.util.*;
public class patterns {

	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
        int i,j, count=1;
		for(i=1;i<row;i++)
		{
			for(j=1;j<=i;j++)
			{
			
				System.out.print(count +" ");
				count++;
			}
			System.out.println();
		}
	}

}