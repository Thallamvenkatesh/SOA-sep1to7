package co.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick{

 public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();


 driver.get("https://demoqa.com/buttons"); 
 driver.manage().window().maximize();

 Actions act = new Actions(driver);

 WebElement btnElement = driver.findElement(By.id("doubleClickBtn"));

 act.doubleClick(btnElement).perform();
 Thread.sleep(2000);
 System.out.println("Double click operation performed");

 driver.quit();

}
}
