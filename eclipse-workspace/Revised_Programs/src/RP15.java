import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

	public class RP15 {

		public static void main(String[] args) {
			
			Collection<String> itr = new HashSet<String>();
			
			itr.add("ravi");
			itr.add("varshney");
			Iterator<String> itr1 = itr.iterator();
			
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}

		}

	}
