import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SS5 {

	public static void main(String[] args) throws InterruptedException {
		

		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.omayo.blogspot.com/");
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		driver.findElement(By.linkText("Blogger")).click();
		
		// String ParentwindowId = driver.getWindowHandle();
		
		//Switch to child window from main window
		
		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext())
		{
			String WindowId=itr.next();
			
				driver.switchTo().window(WindowId);
				
				String windowTitle=driver.getTitle();
				
				if(windowTitle.equals("Basic Web Page Title")) {
						
					String paraone=driver.findElement(By.id("para1")).getText();
				
				System.out.println(paraone);
			}
		}
	}
}
