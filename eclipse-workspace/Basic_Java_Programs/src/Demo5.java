
public class Demo5 {

	public static void main(String[] args) {
		
		Bike bike1 = new Bike("honda", "noida", 101);
		bike1.feature1();

	}
}

class Bike {
	
	String brand1;
	String place1;
	int part1;
	
	// constructor cannot be define under { } brackets
	public Bike(String brand2, String place2, int part2) {
		
		System.out.println("this is constructor");
		brand1=brand2;
		place1=place2;
		part1=part2;
	}
	
	void feature1()
	
	{ 
		System.out.println(brand1 + " this is brand");
		System.out.println(place1 + " this is place");
		System.out.println(part1 + " this is part");
	
	}
	}
	