import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SS8 {

	public static void main(String[] args) throws InterruptedException {
		
       FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.omayo.blogspot.com/");
		
		WebElement FrameTwo = driver.findElement(By.id("iframe2"));
		
		driver.switchTo().frame(FrameTwo);
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Chapter1")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("Ravi Varshney");

	}

}
