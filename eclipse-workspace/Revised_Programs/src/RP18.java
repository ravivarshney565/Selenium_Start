import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RP18 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String str="MethodA";
		Method m = RP18.class.getMethod(str, Integer.class, Integer.class);
		m.invoke(m, 9, 2);

	}

	public static void MethodA(Integer x, Integer y)
	{
		System.out.println(x+y);
	}
}
