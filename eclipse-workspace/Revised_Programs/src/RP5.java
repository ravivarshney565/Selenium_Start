
public class RP5 {

	public static void main(String[] args) {
		
		// Parameterized constructor 
		Ravi1 ob1= new Ravi1(9, 'h');
		ob1.Ravi2();
	}
}
	class Ravi1
	
	{
		int i;
		char a;
		
		Ravi1(int i, char a)
		
		{
			 
			this.i=i;
			this.a=a;
			System.out.println(i+" "+a);
			 	
		}
		
		public void Ravi2()
		
		{
			  //Displaying value of variables a and i
			System.out.println(i+" "+a);
			
		}
	}

	
