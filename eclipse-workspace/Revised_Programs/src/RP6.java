// Java code for using this() to 
// invoke current class constructor 
class RP6
{ 
	int a; 
	int b; 

	//Default constructor 
	RP6() 
	{ 
		this(10, 20); 
		System.out.println("Inside default constructor"); 
		
		System.out.println(a +" "+b); 
	} 
	
	//Parameterized constructor 
	RP6(int a, int b) 
	{ 
		this.a = a; 
		this.b = b; 
		System.out.println("Inside parameterized constructor"); 
		System.out.println(a +" "+b); 
	} 

	public static void main(String[] args) 
	{ 
		RP6 object = new RP6(); 
	} 
} 
