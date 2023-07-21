import java.util.*;
 class student {
    int id;
    String name;
    student(int i,String n){
        id =i;
        name=n;
        System.out.println(id+" "+name);
    }
    //void display(){System.out.println(id+" "+name);}
    public static void main(String[] args) {
        student s1=new student(111,"shana");
        student s2=new student(222,"pooja");
        //s1.display();
        //s2.display();
    }



}
