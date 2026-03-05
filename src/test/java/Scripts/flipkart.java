package Scripts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://www.flipkart.com/");
		
		 //String key = "webdriver.gecko.driver";
         //String value ="./geckodriver.exe";
         //System.setProperty(key, value);
        // WebDriver driver = new FirefoxDriver(); 
         driver.get("https://www.amazon.in/");
      WebElement ele = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
         Thread.sleep(2000);
         ArrayList<String> arr=new ArrayList<String>();
         
        Select s = new Select(ele);  
         List<WebElement> options = s.getOptions();
         for(WebElement ele1:options)
         {
        	 String text = ele1.getText();
        	arr.add(text);
         }
         Collections.sort(arr);
         for(Object O :arr)
         {
        	 System.out.println(O); 
         }
         driver.close(); 
}

	}


