import java.util.*;
class day{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  
        String arr[]={"sunday","monday","tuesday","wendesday","thursday","friday","saturday"};
        if(n<=7)
        {
            System.out.println(arr[n]);
        }
        else
        {
            System.out.println("invalid");
        }
    }
}