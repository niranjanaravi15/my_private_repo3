package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://letcode.in/sortable");
        
        WebElement elements = driver.findElement(By.xpath("/html/body/app-root/app-sortable/section[1]/div/div/div[1]/div/div/div/div/div[2]/div"));
        
        List<WebElement> allOptions =  elements.findElements(By.tagName("div"));
        
        WebElement fromElement= allOptions.get(4);
        WebElement toElement = allOptions.get(0);
        
        Actions actions = new Actions(driver);
        
        actions.clickAndHold(fromElement);
        actions.moveToElement(toElement);
        actions.release(toElement);
        actions.build().perform();

	}

}
