import java.util.*;
class box{
    float Depth;
    float hight;
    float breath;
    box{
        Scanner obj=new Scanner(System.in);
        Depth = obj.nextInt();
        hight = obj.nextInt();
        breath = obj.nextInt();
        float vol=Depth * hight * breath;
        System.out.println(vol);
    }
}
 class box()
 {
         public static void main(String[] args) {
            box mybox=new box();
         }
}
