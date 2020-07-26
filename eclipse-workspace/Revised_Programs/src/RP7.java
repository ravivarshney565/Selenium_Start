 interface Test1 {
    public void sayMyName();
    public void Something();
    
    String type= "type1";  //static and final by default
}

//Class to implement the interface

abstract class Triangle implements Test1 {
	public void Something() {
	    System.out.println("Say Something");
	  }
}

class Square extends Triangle {
	 public void sayMyName() {
	    System.out.println("I am a Triangle!!");
	  }
	 
	public void methodA()
	{
		System.out.println("testing");
	}
	
}

 public class RP7 {
	public static void main(String[] args)
	{
		Test1 ba;
		Square t1 = new Square();
		ba=t1;
		t1.sayMyName();
		t1.Something();
		t1.methodA();
		System.out.println(Test1.type);
		ba.sayMyName();
		ba.Something();
		System.out.println(ba.type);
	}
}