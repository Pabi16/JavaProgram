import java.util.*;

public class vowelscount{

        public static void main(String args[])
        {
            int i,count=0;
             Scanner sc=new Scanner(System.in);
             String str =sc.nextLine();
             char ch[]=str.toCharArray();
             for(i=0;i<=str.length();i++)
             {
                 if(ch[i]=='a' || ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' ||ch[i]=='I' ||ch[i]=='O' || ch[i]=='U')
                 count++;
                 
             }   
             System.out.println(count);
        }
    }