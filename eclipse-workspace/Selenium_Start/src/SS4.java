import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SS4 {

	public static void main(String[] args) throws InterruptedException {
		

		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.omayo.blogspot.com/");
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		driver.findElement(By.linkText("Blogger")).click();
		
		String ParentwindowId = driver.getWindowHandle();
		
		//Switch to child window from main window
		
		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext())
		{
			String ChildWindowId=itr.next();
			
			if (!ParentwindowId.equals(ChildWindowId))
			{
				driver.switchTo().window(ChildWindowId);
				
				System.out.println(driver.getTitle());
			}
		}
	}
}
		