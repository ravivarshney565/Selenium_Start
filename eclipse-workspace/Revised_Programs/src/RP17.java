import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RP17 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String str="MethodA";
		Method m = RP17.class.getMethod(str);
		m.invoke(m);

	}

	public static void MethodA()
	{
		System.out.println("testing program");
	}
}
