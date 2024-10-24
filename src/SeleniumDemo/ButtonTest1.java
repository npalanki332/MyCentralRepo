package SeleniumDemo;

import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonTest1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
		boolean VerifyButton = button.isDisplayed();
		System.out.println("VerifyButton : "+VerifyButton);
		
		if (VerifyButton == true)
		{
			System.out.println("VerifyButton - pass");
		}
		else
		{
			System.out.println("VerifyButton - fail");			
		}
		
		boolean VerifyEnable = button.isEnabled();
		System.out.println("VerifyEnable : "+VerifyEnable);
		
		if (VerifyEnable == true)
		{
			System.out.println("VerifyEnable - pass");			
		}
		else
		{
			System.out.println("VerifyEnable - fail");
		}		
		String attributeValue = button.getAttribute("name");
		System.out.println("attributeValue : "+attributeValue);
		String expectedText = "Log In";
		if (attributeValue.equals(expectedText))
		{
			System.out.println("expectedText Pass");
		}
		else
		{
			System.out.println("expectedText fail");			
		}
		button.click();
		
	}

}
