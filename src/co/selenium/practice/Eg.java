package co.selenium.practice;
 
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import java.util.concurrent.TimeUnit;
 
public class Eg
{
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException {
 
       System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
 
       driver.get("https://www.lambdatest.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
       JavascriptExecutor js = (JavascriptExecutor) driver;
 
       //specify the number of pixels the page has to be scrolled
       js.executeScript("window.scrollBy(0,3000)");
       
       Thread.sleep(5000);
 
       driver.close();
   }
}