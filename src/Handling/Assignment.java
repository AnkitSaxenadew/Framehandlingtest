package Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./diver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");

		driver.manage().window().maximize();
		
		String close="//div[@id='parentdiv']//img[@class='popupCloseButton']";
		
           driver.findElement(By.xpath(close)).click();
           driver.switchTo().defaultContent();
          // WebElement drpdwn = driver.findElement(By.xpath("//div[text()='NetBanking']"));
        	   
         // Select sel = new Select(drpdwn);
        //   sel.selectByValue("3");
           
        	   
          driver.findElement(By.id("loginsubmit")).click();
          
          
          
          String  cntd="//a[@href=\"https://netbanking.hdfcbank.com/netbanking/?_ga=2.151128057.1707704175.1557940124-1937208428.1557940124\"]";
          driver.switchTo().parentFrame();
          driver.findElement(By.xpath(cntd)).click(); 
          
          
	}

}
