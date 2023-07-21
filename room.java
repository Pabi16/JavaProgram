import java.util.*;
public class room {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Toatal person in a room:");
        int num=sc.nextInt();
        int total;
        System.out.println("maximum number of handshake");
        total=(num*(num-1))/2;
        System.out.println(total);
    }
    
}
