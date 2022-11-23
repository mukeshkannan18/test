package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OenCart {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.id("input-username"));
		name.sendKeys("mukeshkannan");
		WebElement fname=driver.findElement(By.id("input-firstname"));
		fname.sendKeys("mukesh");
		WebElement lname=driver.findElement(By.id("input-lastname"));
		lname.sendKeys("kannan s");
		WebElement email=driver.findElement(By.id("input-email"));
		email.sendKeys("mukeshkannansubbaiah18@gmail.com");
		WebElement dropdown=driver.findElement(By.id("input-country"));
		Select dd=new Select(dropdown);
		dd.selectByVisibleText("India");
		WebElement passw=driver.findElement(By.id("input-password"));
		passw.sendKeys("mukesh18");
		

}
	

}
