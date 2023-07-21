import java.util.*;
public class inversematrix{
    public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int arr[][] = new int[n][n];
           
            float det;
            
    
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            det=((arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]));
            int temp=arr[0][0];
            arr[0][0]=arr[1][1];
            arr[1][1]=temp;
            arr[0][1]=-arr[0][1];
            arr[1][0]=-arr[1][0];
           
    
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    
                    System.out.print((arr[i][j]/det) + " ");
                   
                }
                System.out.print("\n");
            }
    
    
         
        }
    }
