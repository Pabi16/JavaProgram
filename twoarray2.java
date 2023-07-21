import java.util.*;
public class twoarray2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a[]=new int[num];
        int b[]=new int[num];
        int c[]=new int[num];
        int d=sc.nextInt();
        for(int i=0;i<num;i++)
           {
                   a[i]=sc.nextInt();			
           }
           for(int i=0;i<num;i++)
           {
               b[i]=sc.nextInt();
           }
           for(int i=0;i<d;i++)
           {
               if(i==0)
               {
                   c[0]=a[0]+b[1];
               }
               else if(i==1)
               {
                   c[1]=a[1]+b[2];
               }
               else if(i==2)
               {
                   c[2]=a[3]+b[3];
               }
               else if(i==3) {
                   c[3]=a[5]+b[4];
               }
               else if(i==4){
                   
                   c[4]=a[6]+b[5];
               }
             
               System.out.print(c[i]+" ");
           }
               
           }
       }

    
