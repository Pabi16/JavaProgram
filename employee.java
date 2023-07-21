
import java.util.*; 
public class employee {
	Scanner sc=new Scanner(System.in);
	//int hours;
	int employee;
	int employees=sc.nextInt();
	int hours=sc.nextInt();
}
class get_info{
	public static void main(String[]args)
	{
	employee details=new employee();
	int salary;
	salary=details.hours*5;
	System.out.println(salary);
	
}
}