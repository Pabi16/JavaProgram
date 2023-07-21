import java.util.*;
public class divided {
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        for(int i=1;i<n;i++){
            if(i%x==0 && i%y!=0){
                System.out.println(i);
            }
        }
}
}
