import java.util.*;
class rect{
    Scanner sc=new Scanner(System.in);
    int l=sc.nextInt();
    int b=sc.nextInt();
    int h=sc.nextInt();
    int volume=l*b*h;
}
public class cuboid{
    public static void main(String[] args) {
        rect cuboid=new rect();
        System.out.println(cuboid.volume);

    }
}