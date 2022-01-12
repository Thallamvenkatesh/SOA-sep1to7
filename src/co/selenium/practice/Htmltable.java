package co.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmltable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window();
	     driver.get("https://demoqa.com/webtables");
	     WebElement t = driver.findElement(By.xpath("//div[@class='rt-resizable-header-content'][contains(.,'First Name')]"));
	     
	     @SuppressWarnings("unchecked")
		List <WebElement> rows = (List<WebElement>) t.findElement(By.tagName("rt-tr-group"));
	     int rowscount = rows.size();
	     
	     for (int i = 0;i<rowscount; i++)
	     {
	    	 List<WebElement> col = rows.get(i).findElements(By.tagName("rt-td"));
	    	 int colcount = col.size();
	    	for(int j=0;j<colcount; j++)
	    	{
	    		String a = col.get(j).getText();
	    		System.out.println("The cell value is: " + a);
	    	}
	    			 
	     }
	}

}
