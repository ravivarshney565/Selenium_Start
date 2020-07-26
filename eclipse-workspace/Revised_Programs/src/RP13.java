import java.util.HashSet;
import java.util.Set;

public class RP13 {

	public static void main(String[] args) {
	
		Set<String> hs= new HashSet<String>(); // Set or collection may be used because both are interface for hashset
		hs.add("ravi");
		hs.add("varshney");
		
		for(String temp:hs)
		{
			System.out.println(temp);
		}	

	}

}
