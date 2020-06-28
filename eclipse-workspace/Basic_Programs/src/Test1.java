import java.util.*;
import java.io.*;

public class Test1 {
	public static void main(String[] args) throws Exception {

		Properties p = new Properties();
		p.setProperty("name", "Ravi Varshney1");
		p.setProperty("email", "email- varshneyravi565@gmail.com");

		p.store(new FileWriter("/Users/qainfotech/eclipse-workspace/Basic_Programs/src/resources/info.properties"),
				"Generate Property File Example");

	}
}