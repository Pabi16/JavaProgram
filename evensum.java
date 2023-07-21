import java.util.*;
public class evensum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int obj=sc.nextInt();
        for (int i=1;i<=obj;i++){
              if(i%2==0){
                sum=sum+i;
              }

        }
        System.out.print(sum); 
      
    }
         
    
}

