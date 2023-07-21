import java.util.*;
public class finger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==num){
                    //System.out.println(arr[i]+"+"+arr[j]+"="+num);
                    count=1;
                }
                //else{
                  // System.out.println("No match is found");
                 //}
            }
        }
        if(count==1){
            System.out.println("true");
        }
        else{
            System.out.println(false);
        }
       

        }
        
    }
