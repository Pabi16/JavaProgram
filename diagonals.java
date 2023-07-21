import java.util.*;
public class diagonals{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int row=obj.nextInt();
        int col=obj.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=obj.nextInt();
            }

        }
        int sum1=0,sum2=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==j)
                {
                    sum1+=arr[i][j];
                }
                if(i+j==row-1)
                {
                    sum2+=arr[i][j];
                }

            }

        }
        System.out.println("Sum of the rigth diagonal:"+sum1);
        System.out.println("Sum of the left diagonal:"+sum2);

	}

}
       