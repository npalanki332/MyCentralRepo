package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class InputBoxTest4 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement PasswordInputBox = driver.findElement(By.xpath("//input[@id='pass']"));
		boolean displayPassword = PasswordInputBox.isDisplayed();
		System.out.println("displayPassword : "+displayPassword);
		if (displayPassword == true)
		{
			System.out.println("Displaying Password");
		}
		else
		{
			System.out.println("Not Diplaying Password");
		}

		boolean enablePassword = PasswordInputBox.isEnabled();
		System.out.println("enableInputBox : "+enablePassword);
		if(enablePassword == true)
		{
			System.out.println("Password is enabled");
		}
		else
		{
			System.out.println("Password Disabled");
		}

		String ActualvalueOfPasswordInputBox = PasswordInputBox.getAttribute("placeholder");
		String ExpectedvalueOfPasswordInputBox = "Password";

		if(ActualvalueOfPasswordInputBox.equals(ExpectedvalueOfPasswordInputBox))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

		PasswordInputBox.sendKeys("RBG Technologies");

		String modifiedvalueOfUsernameInputBox = PasswordInputBox.getAttribute("value");
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
