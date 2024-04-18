package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
import java.util.List;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/NIRANJANA/Downloads/solution.html");
        
        WebElement cats = driver.findElement(By.xpath("/html/body/form[1]/fieldset/input[1]"));
        cats.click();
        
        WebElement javaCheck = driver.findElement(By.id("Java"));
        boolean javaSelected = javaCheck.isSelected();
        System.out.println(javaSelected);
        
        WebElement firstElement = driver.findElement(By.id("devcplus"));
        
        if(firstElement.isSelected()) {
        	firstElement.click();
        }
        
        WebElement secondElement = driver.findElement(By.id("eclipse"));
        
        if(secondElement.isSelected()) {
        	secondElement.click();
        }
        
	}

}
