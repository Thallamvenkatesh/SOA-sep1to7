package co.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		driver.manage().window();
		
		driver.findElement(By.id("frame1"));
		driver.switchTo().frame("frame1");
		
		WebElement frameheading = driver.findElement(By.id("sampleHeading"));
		System.out.println(frameheading.getText());
		
		driver.quit();
	}

}
