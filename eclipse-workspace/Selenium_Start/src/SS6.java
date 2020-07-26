import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SS6 {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.omayo.blogspot.com/");
		driver.findElement(By.id("alert1")).click();
		Alert alt = driver.switchTo().alert();
		String TextOnAlert = alt.getText();
		System.out.println("TextOnAlert");
		alt.accept();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.close();
	}
}

