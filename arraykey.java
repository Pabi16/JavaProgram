import java.util.*;
public class arraykey {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int obj=sc.nextInt();
        int arr[]=new int[obj];
        for(int i=0;i<obj;i++){
            arr[i]=sc.nextInt();
        }
        int p=sc.nextInt();
        for(int i=0;i<obj;i++){
            if(p==arr[i]){
                count=1;
                break;
            }
        }  
            if(count==1){
                System.out.println("Element is found");
            }
            else{
                System.out.print("Element is not found");
            }
        }

    }
    

