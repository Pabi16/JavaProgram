class bikee{
	int speed;
	String color;
	
	bikee(){                 //constructor
		speed = 100;
		color = "ordinary";
	}
	
	void cost() {
		System.out.println("Affordable");
	}
}

public class bike {
	public static void main(String args[]) {
		bikee RX = new bikee();
		//bikee shine = new bikee();
		RX.speed=400;
		RX.color="red";
		
		bikee duke = new bikee();
		duke.speed = 500;
		duke.color = "orange";
		
		System.out.println(RX.color);
		System.out.println(RX.speed+"  " + duke.speed);
		RX.cost();
	}

}

