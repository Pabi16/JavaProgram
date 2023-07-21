import java.util.*;
class Main
{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int num , col , row;
        num = obj.nextInt();
        for(row=1;row<=num;row++,System.out.print("\n"))
        {
            for(col = 1;col<=num;col++)
            System.out.print(row%2);
        }
            
        
    }
}
