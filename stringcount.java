import java.util.*;
public class stringcount {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch=sc.next().charAt(0);
        char arr[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(arr[i]==ch){
                count++;
            }

        }
       System.out.println(count);
        

    }
}
