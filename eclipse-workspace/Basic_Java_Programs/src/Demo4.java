
public class Demo4 {

	public static void main(String[] args) {
		
Bus x = new Bus();
x.model = "Swift Dzire";
x.methodA();

System.out.println("program done");

	}

}

class Bus {
	
	String model;
	String y;
	
public Bus ()
	
	{
		System.out.println("This is constructor");
	}
	
	 void methodA()
	
	{
	
	System.out.println(model + " This is model");
	System.out.println(y + " This is new model");
	
    }

}