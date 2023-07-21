mport java.util.*;
class intro
{
	public static void main(String args[])
	{
            Scanner obj=new Scanner(System.in);
            int row=obj.nextInt();
            int col=obj.nextInt();
            int i,j,sum=0;
            int arr[][]=new int[row][col];
		for(i=0;i<row;i++)
		{
                  for(j=0;j<col;j++)
		  {
                     arr[i][j]=obj.nextInt();
                  }
                }
                for(i=0;i<row;i++)
		{
                  sum=0;
                  for(j=0;j<col;j++)
		  {
                     sum+=arr[i][j];
                  }
                  System.out.println("Sum of all the elements is \n" +sum); 
                }
        }
}