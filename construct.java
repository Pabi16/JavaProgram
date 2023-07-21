import java.util.*;

    class bike{
        int speed;
        String color;
        
        bike(){                 //constructor
            speed = 100;
            color = "ordinary";
        }
        
        void cost() {
            System.out.println("Affordable");
        }
    }
    public class construct {
        public static void main(String args[]) {
            bike RX = new bike();
            bike shine = new bike();
            RX.speed=400;
            RX.color="red";
            
            bike duke = new bike();
            duke.speed = 500;
            duke.color = "orange";
            
            System.out.println(RX.color);
            System.out.println(+RX.speed+"  " + duke.speed);
            RX.cost();
        }
    
    }
