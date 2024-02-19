package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverNewChromeDriver {

	public void login() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		WebElement username = driver.findElement(By.name("user_name"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("user_password"));
		password.sendKeys("manager");
		WebElement loginButton = driver.findElement(By.id("submitButton"));
		loginButton.click();
	}

}
