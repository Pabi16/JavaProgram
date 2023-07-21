import java.util.*;
class pabi
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.int)
    int row=sc.nextInt();
    int col=sc.nextINT();
    int arr[][]=new int [row][col];
    int num=0;
    
    for (int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++){
        arr[i][j] = sc.nextInt();
        num = num + arr[i][j];
      }
    System.out.println(sum);
    }

  }
}