package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabelDemo2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//span[text()='to continue to Gmail']")).getText();
		
		WebElement label = driver.findElement(By.xpath("//span[text()='to continue to Gmail']"));
		label.getText();
		
		
		
	}

}
