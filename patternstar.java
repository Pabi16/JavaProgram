import java.util.*;

public class patternstar {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }   
        }
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
               if(i==1&&j==1)
               {
                System.out.print(5);
               }
               else{
                System.out.print("*");

               }
            }  
            System.out.println(); 
        }
    }
    
}