
public class Demo6 {

	public static void main(String[] args) {
		Car maruti = new Car("Swift Vdi", 80000, 25);
		Car benz = new Car("Benz Aclass", 6000, 56);
		Car audi = new Car("audi hero", 708, 965);
		
		maruti.carDetails();
		benz.carDetails();
		audi.carDetails();
	}
}

class Car {
	
	String carModel;
	int cost;
	double milage;
	
	public Car(String cm, int cs, double mil) {
		
		carModel= cm;
		cost= cs;
		milage=mil;
	}
	public void carDetails() {
		System.out.println("The model of car is "+carModel);
		System.out.println("The model of car is "+cost);
		System.out.println("The model of car is "+milage);
		
	}
}