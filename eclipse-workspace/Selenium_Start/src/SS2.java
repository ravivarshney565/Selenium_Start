import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SS2 {

	public static void main(String[] args) throws InterruptedException {
		

		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.omayo.blogspot.com/");

		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Selenium")).click();
		
		String str = driver.getCurrentUrl();
		
        System.out.println(str);
		
		driver.close();

	}

}