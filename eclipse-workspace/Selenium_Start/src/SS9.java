import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SS9 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");
		
       ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.omayo.blogspot.com/");
		
		driver.findElement(By.name("q")).sendKeys("Ravi Varshney");

	}

}