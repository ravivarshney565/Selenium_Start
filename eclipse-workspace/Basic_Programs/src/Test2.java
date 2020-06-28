import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test2 {
	public static void main(String[] args) {
		try {
			Properties properties = new Properties();
			properties.setProperty("x1", "1");
			properties.setProperty("y1", "2");
			properties.setProperty("z1", "3");

			File file = new File("/Users/qainfotech/eclipse-workspace/Basic_Programs/src/resources/write.properties");
			FileOutputStream fileOut = new FileOutputStream(file);
			properties.store(fileOut, "variables");
			fileOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
