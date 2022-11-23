package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		WebElement from=driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("chennai ce",Keys.TAB);
				
		WebElement to=driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("pudukkottai",Keys.TAB);
		
		driver.findElement(By.id("buttonFromTo")).click();
		
		List<WebElement> trainName=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
		for (int i  =0; i <trainName.size(); i++) {
		     String text=trainName.get(i).getText();
			System.out.println(text);
			
		}
		
		
		
	}

}
