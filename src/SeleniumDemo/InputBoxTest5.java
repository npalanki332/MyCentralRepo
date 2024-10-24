package SeleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class InputBoxTest5 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		WebElement UsernameInputBox = driver.findElement(By.xpath("//input[@name='userName']"));
		boolean DisplayInputBox = UsernameInputBox.isDisplayed();
		System.out.println("DisplayInputBox : "+DisplayInputBox);
		if (DisplayInputBox == true)
		{
			System.out.println("InputBox is displaying");
		}
		else
		{
			System.out.println("InputBox is not displaying");
		}

		boolean EnableInputBox = UsernameInputBox.isEnabled();
		System.out.println("EnableInputBox : "+EnableInputBox);
		if (EnableInputBox == true)
		{
			System.out.println("InputBox Enabled");
		}
		else
		{
			System.out.println("InputBox not Enabled");
		}

		String UsernameWatermark = UsernameInputBox.getAttribute("placeholder");
		System.out.println("UsernameWatermark : "+ UsernameWatermark);

		String ExpectedWatermark = "NA";
		if (UsernameWatermark == ExpectedWatermark)
		{
			System.out.println("pass-watermark");
		}
		else
		{
			System.out.println("fail-watermark");
		}

		UsernameInputBox.sendKeys("RBG");

		String ModifiedInputBox = UsernameInputBox.getAttribute("value");
		String Expecteddata = "RBG";

		if (ModifiedInputBox.equals(Expecteddata))
		{
			System.out.println("ExpectedData - pass");
		}
		else
		{
			System.out.println("ExpectedData - fail");
		}




	}

}