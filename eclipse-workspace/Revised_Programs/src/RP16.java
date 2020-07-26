import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

	public class RP16 {

		public static void main(String[] args) {
			
			HashMap<Integer, String> hmap = new HashMap<Integer, String>();
			
			hmap.put(00,"ravi");
			hmap.put(01,"varshney");
			hmap.put(02,"testing");
			hmap.put(03,"program");
			
			
				System.out.println(hmap.get(00));
				System.out.println(hmap.get(03));
				
				for (Integer temp:hmap.keySet())
				{
					System.out.println(hmap.get(temp));
				}
			}

		}
