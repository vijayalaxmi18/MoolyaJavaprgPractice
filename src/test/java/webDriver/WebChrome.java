package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebChrome {
	
	public void learning() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("hello")));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("URL");
		driver.findElement(By.id("ok")).clear();
		driver.quit();
	}
	
}
