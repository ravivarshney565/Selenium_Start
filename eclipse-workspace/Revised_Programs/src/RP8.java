
public class RP8 {

	public static void main(String[] args) {
		
		System.out.println("before exception");
		
		try {
			int a=10/0;
			System.out.println("inside try block after exception");
		}
		catch(Exception e)
		{
			System.out.println("after exception");
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Exception Handled");
		
		
		try {
			int a=10/2;
			System.out.println("inside try block without exception");
		}
		catch(Exception e) // May also use Arithmetic Exception in place of Exception or Throwable can be use any where
		{
			System.out.println("after exception");
		}
		
		System.out.println("No Exception");
	}

}
