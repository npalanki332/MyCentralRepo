package SeleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonTest2 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/button/");
		//unable to found xpath
		WebElement ASubmitButton = driver.findElement(By.xpath("//input[@value='A submit button' and @class='ui-button ui-widget ui-corner-all']"));
		boolean verifyASubmitButton = ASubmitButton.isDisplayed();
		System.out.println("verifyASubmitButton : "+verifyASubmitButton);
		if (verifyASubmitButton == true)
		{
			System.out.println("verifyASubmitButton - Pass");
		}
		else
		{
			System.out.println("verifyASubmitButton - fail");
		}
		boolean enableASubmitButton = ASubmitButton.isEnabled();
		System.out.println("enableASubmitButton : "+enableASubmitButton);
		if(enableASubmitButton == true)
		{
			System.out.println("enableASubmitButton - pass");
		}
		else
		{
			System.out.println("enableASubmitButton - fail");
		}
		String ActualOfASubmiutButton = ASubmitButton.getAttribute("value");
		System.out.println("ActualOfASubmiutButton : "+ActualOfASubmiutButton);
		String ExpectedOfASubmiutButton = "A submit button";
		if(ActualOfASubmiutButton.equals(ExpectedOfASubmiutButton))
		{
			System.out.println("Validated");
		}
		else
		{
			System.out.println("not validated");
		}



	}

}
