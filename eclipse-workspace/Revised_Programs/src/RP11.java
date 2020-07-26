import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RP11 {

	public static void main(String[] args) throws IOException {
		
File f1 = new File("File_Folder//Tutorial.docx");

System.out.println(f1.getAbsolutePath());

FileReader fr = new FileReader(f1);

BufferedReader br = new BufferedReader(fr);

String str;

while ((str=br.readLine())!=null) {
	System.out.println(str);
}

	}

}
