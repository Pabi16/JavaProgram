import java.util.*;
public class squarearray{
    public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        int temp=0;
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	    
	        for (int i = 0; i < n; i++) {
	            int a = (int) Math.sqrt(arr[i]);
	            if (a * a == arr[i]) {
	                temp++;
	            }
	        }
	        int ans = temp-1;
	        	
	        System.out.println(ans);
	    }

}

    