import java.util.*;
public class star {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num,row,col,spc;
        num=obj.nextInt();
        for(row=1;row<=num;row++,System.out.println("\n")){
            for(col=1;col<row;row++){
              System.out.print("* ");
              for(spc=1;spc<=(num-row)*2;spc++){
                System.out.print(" ");
                for(col=1;col<=row;col++){
                    System.out.print("* ");
                }
              }
            }
        }


        

    }
}

    
