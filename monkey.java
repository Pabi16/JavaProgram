import java.util.*;
public class monkey {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
          int k=sc.nextInt();
           int j=sc.nextInt();
            int m=sc.nextInt();
             int p=sc.nextInt();
             int total;
             if(n>0){
             total=(m/k)+(p/j);
             System.out.println(n-total);

             }
             else{
                System.out.println("INVALID INPUT");
             }
    }
    
}
