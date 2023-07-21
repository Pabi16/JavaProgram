import java.util.*;
public class prime {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=2;i<=a;i++){
            if(a%i !=0){
                count=1;
            }
        else{
            count=0;

        }
            }
            if (count==1){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }
            }
        }

    

