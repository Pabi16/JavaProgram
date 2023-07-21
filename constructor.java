import java.util.Scanner.*;
class constructor
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int a[]=s.toCharArray();
    int n[]=new int[a.length];
    int c=0;
    for(int i=0;i<s.length()-1;i++){
       for(int j=i+1;j<s.length();j++){
          if(s.charAt(i)==a[j])
             n[j]++;
       }
    }
    for(int i=0;i<s.length();i++)
       System.out.println(n[i] +" ");
}
}