
import java.util.*;
public class second {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int N=Sc.nextInt();
		int W=Sc.nextInt();
		int H=Sc.nextInt();
		int L=Sc.nextInt();
		int D=W*H;
		if(W<L&&H<L)
		{
			System.out.print("UPLOAD ANOTHER");
		}
		else if(W==H)
		{
			System.out.print("ACCEPTED");
		}
		else
		{
			System.out.print("CROPIT");
		}
		
			}
		}
