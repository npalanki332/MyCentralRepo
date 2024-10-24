package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxTest3 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement userNameInputBox = driver.findElement(By.xpath("//input[@id='email']"));
		boolean displayInputBox = userNameInputBox.isDisplayed();
		System.out.println("displayInputBox : "+displayInputBox);
		if (displayInputBox == true)
		{
			System.out.println("Displaying InputBox");
		}
		else
		{
			System.out.println("Not Diplaying InputBox");
		}

		boolean enableInputBox = userNameInputBox.isEnabled();
		System.out.println("enableInputBox : "+enableInputBox);
		if(enableInputBox == true)
		{
			System.out.println("InputBox is enabled");
		}
		else
		{
			System.out.println("Input box Disabled");
		}

		String ActualvalueOfUsernameInputBox = userNameInputBox.getAttribute("placeholder");
		String ExpectedvalueOfUsernameInputBox = "Email address or phone number";

		if(ActualvalueOfUsernameInputBox.equals(ExpectedvalueOfUsernameInputBox))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

		userNameInputBox.sendKeys("RBG Technologies");
		String modifiedvalueOfUsernameInputBox = userNameInputBox.getAttribute("value");
		System.out.println("modifiedvalueOfUsernameInputBox : "+ modifiedvalueOfUsernameInputBox);

		String ExpectedvalueOfUsernameInputBox2 = "RBG Technologies";
		if(modifiedvalueOfUsernameInputBox.equals(ExpectedvalueOfUsernameInputBox2))
		{
			System.out.println("Modified InputBox - pass");
		}
		else
		{
			System.out.println("Modified InputBox - fail");
		}

	}

}
