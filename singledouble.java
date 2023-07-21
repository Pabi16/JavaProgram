import java.util.*;
public class singledouble {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int arr[]=new int[a];
    int b[]=newl int[a];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    char ch1='S';
    char ch2='D';
    for(int i=0;i<arr.length;i++){
        if(arr[i]<=9){
           System.out.println(arr[i]+"; "+"s");
        }
        if(arr[i]>9){
           System.out.println(arr[i]+"; "+"d");
        }
    }
}
}
