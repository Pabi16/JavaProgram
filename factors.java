import java.util.*;
class factors{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a+1;i++){
            if(a%i==0){
                System.out.println(i+" ");
            }
        }

    }
    
}