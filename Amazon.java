package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement amaze=driver.findElement(By.id("twotabsearchtextbox"));
		amaze.sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement>name=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		System.out.println(name.size());
		
		
		for (int i = 0; i <name.size(); i++) {
			String price=name.get(i).getText();
			System.out.println(price);
			
		}
	
	}

}
