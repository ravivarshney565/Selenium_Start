import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SS3 {

	public static void main(String[] args) throws InterruptedException {
		

		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.omayo.blogspot.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		//Switch to child window from main window
		
		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> itr = set.iterator();
		
		String mainWindowID = itr.next();
		
		String childWindowID = itr.next();
		
		driver.switchTo().window(childWindowID);
		
		Thread.sleep(5000);
		
		String str = driver.findElement(By.id("para1")).getText();
		
		System.out.println(str);
		
		
		
	}

}
