import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SS1 {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.omayo.blogspot.com/");
		
		Dimension newDimension=new Dimension(700,600);
		
		driver.manage().window().setSize(newDimension);
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("classone")).sendKeys("Ravi Varshney");  // id is static method of By class
		
        Thread.sleep(5000);
		
		driver.findElement(By.className("classone")).clear();
		
		driver.findElement(By.linkText("Selenium143")).click();
		
		driver.close();

	}

}
