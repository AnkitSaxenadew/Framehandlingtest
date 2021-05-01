package Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frmehnlde {

	public static void main(String[] args) {
		
		String key="webdriver.chrome.driver";
		String value="./diver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");

		driver.manage().window().maximize();
		//switch from default frame to frame 1
		
		driver.switchTo().frame("packageListFrame");
		
		String xp = "//ul[@title='Packages']//a[text()='com.thoughtworks.selenium']";
		
		driver.findElement(By.xpath(xp)).click();
		
		//switch frame frame 1 to default content
		
		driver.switchTo().defaultContent();
		
		//switch from default frame to frame 2
		
		driver.switchTo().frame("packageFrame");
		
		driver.findElement(By.linkText("DefaultSelenium")).click();
		
		//switch frame frame 2 to default content 
		
		driver.switchTo().defaultContent();
		
		//switch from default frame to frame 3
		
		  //WebElement frame3 = driver.findElement(By.xpath("//frame[@name='classFrame']"));
		
		  //driver.switchTo().frame(frame3);
		
		  //driver.findElement(By.linkText("WebDriverBackedSelenium")).click();
		
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("WebDriverBackedSelenium")).click();
		
		
		
		
	}

}
