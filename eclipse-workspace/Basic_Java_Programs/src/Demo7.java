
public class Demo7 {
	
	int a;
	int b;
	static int c=4;

	public static void main(String[] args) {
		Car2 maruti = new Car2("Swift Vdi", 80000, 25);
		Car2 benz = new Car2("Benz Aclass", 6000, 56);
		Car2 audi = new Car2("audi hero", 708, 965);
		
		maruti.carDetails();
		benz.carDetails();
		audi.carDetails();
	}
}

class Car2 {
	
	String carModel;
	int cost;
	double milage;
	
	public Car2(String carModel, int cost, double milage) {
		this.carModel= carModel;
		this.cost= cost;
		this.milage=milage;
		
	}
	public void carDetails() {
		System.out.println("The model of car is "+carModel);
		System.out.println("The model of car is "+cost);
		System.out.println("The model of car is "+milage);
		
	}
}