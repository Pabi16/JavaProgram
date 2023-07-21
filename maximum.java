import java.util.*;

import javax.swing.event.SwingPropertyChangeSupport;
public class maximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=1;
        int obj=sc.nextInt();
        int arr[]=new int[obj];
        for(int i=0;i<obj;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<obj;i++){
            if(max<arr[i])
            max=arr[i];
        
       }
       System.out.println(max);
    }
    
}
