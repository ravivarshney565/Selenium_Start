import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class RP9 {

	public static void main(String[] args) {
		
		File fo = new File("Macintosh HD//Users//qainfotech//Desktop//hosts");
		
		try {
		FileReader fr = new FileReader(fo);
		}
		
		catch (FileNotFoundException e) {
			System.out.println("After Exception");
			System.out.println(e);
		}

	}

}
