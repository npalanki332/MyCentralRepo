package SeleniumDemo;

import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxTest2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		WebElement inspect = driver.findElement(By.xpath("//input[@name='identifier']"));		
		boolean verifyIputBox = inspect.isDisplayed();
		System.out.println("verifyIputBox : "+verifyIputBox);
		if (verifyIputBox == true)
		{
			System.out.println("InputBox Visable");
		}
		else
		{
			System.out.println("InputBox NotVisable");
		}
		
		boolean verifyEnable = inspect.isEnabled();
		System.out.println("verifyEnable : "+verifyEnable);
		if (verifyEnable == true)
		{
			System.out.println("Enabled InputBox");
		}
		else
		{
			System.out.println("not a Enabled InputBox");
		}
		
		String attributeValue = inspect.getAttribute("aria-label");
		
		System.out.println("attributeValue : "+attributeValue);
		
		String ExpectedData = "Email or phone";
		
		if (attributeValue.equals(ExpectedData))
		{
			System.out.println("Expected WaterMark");
		}
		else
		{
			System.out.println("Not a Expected Water Mark");
		}
		
		inspect.sendKeys("RBG Technologies");
		
		String verifyAttributeValue = inspect.getAttribute("value");
		
		System.out.println("verifyAttributeValue : "+verifyAttributeValue);
		
		String expectedAttributeValue = "RBG Technologies";
		
		if (verifyAttributeValue.equals(expectedAttributeValue))
		{
			System.out.println("Validate");
		}
		else
		{
			System.out.println("not Validate");
		}	
		

	}

}
