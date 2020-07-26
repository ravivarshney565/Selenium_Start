	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;

	public class RP10 {

		public static void main(String[] args) throws FileNotFoundException {
			
			File fo = new File("//Users//qainfotech//Desktop//ESQ//Issues.docx");
			
			FileReader fr = new FileReader(fo);
			
			System.out.println("After No Exception");
			
		}

	}
