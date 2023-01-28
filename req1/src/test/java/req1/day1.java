package req1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class day1 {

	public static void main(String[] args) throws IOException, InterruptedException { 
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();        
        driver.manage().window().maximize();        
	    driver.get("https://google.com/");
	    Thread.sleep(1000);
	    WebElement findElement = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a"));
	    findElement.click();
	    Thread.sleep(1000);
	    WebElement findElement1 = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
	    findElement1.sendKeys("venarunxp");
	    Thread.sleep(1000);
	    WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
	    findElement2.click();
	}
	}

//}
