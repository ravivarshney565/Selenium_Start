import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SS7 {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.omayo.blogspot.com/");
		
		WebElement dropdownField = driver.findElement(By.id("drop1"));
		
		Select select = new Select(dropdownField);
		
		select.selectByVisibleText("doc 3");
	
		WebElement MultiSelectionField = driver.findElement(By.id("multiselect1"));
		
		Select select1 = new Select(MultiSelectionField);
		
		select1.selectByVisibleText("Swift");
		
		select1.selectByVisibleText("Audi");
		
		Thread.sleep(2000);
		
		select1.deselectByVisibleText("Audi");
		
	}

}