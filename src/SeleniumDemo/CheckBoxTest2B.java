package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest2B {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/mortgage-calculator.html");
		WebElement checkBox = driver.findElement(By.xpath("//*[@id='content']/div[4]/div/form/table/tbody/tr[6]/td/label/span"));
		WebElement checkBoxSelect = driver.findElement(By.xpath("//*[@id='caddoptional']"));		
		// if given Xpath is not related to Checkbox(Attribute value) we need to check sibling mostly it will be on top of the current Xpath
		boolean verifyCheckBox = checkBox.isDisplayed();
		System.out.println("VerifyCheckBox : "+verifyCheckBox);
		if(verifyCheckBox== true)
		{
			System.out.println("VerifyCheckBox - pass");
		}
		else
		{
			System.out.println("VerifyCheckBox - fail");
		}
		boolean EnableCheckBox = checkBox.isEnabled();
		System.out.println("EnableCheckBox : "+EnableCheckBox);
		if(EnableCheckBox== true)
		{
			System.out.println("EnableCheckBox - pass");
		}
		else
		{
			System.out.println("EnableCheckBox - fail");
		}
		boolean selectCheckBox = checkBoxSelect.isSelected();
		System.out.println("SelectCheckBox : "+selectCheckBox);
		if(selectCheckBox== true)
		{
			System.out.println("SelectCheckBox - Expected Selected");
		}
		else
		{
			System.out.println("SelectCheckBox - not selected");
		}
		checkBox.click();//
		selectCheckBox=checkBoxSelect.isSelected();
		System.out.println("SelectCheckBox : "+selectCheckBox);
		if(selectCheckBox== true)
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Expected Not Selected");
		}
		
		
	}

}
