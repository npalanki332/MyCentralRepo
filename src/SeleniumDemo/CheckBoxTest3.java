package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest3 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox'][5]"));
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
		boolean selectCheckBox = checkBox.isSelected();
		System.out.println("SelectCheckBox : "+selectCheckBox);
		if(selectCheckBox== true)
		{
			System.out.println("SelectCheckBox - Expected Selected");
		}
		else
		{
			System.out.println("SelectCheckBox - not selected");
		}
		checkBox.click();
		selectCheckBox=checkBox.isSelected();
		System.out.println("SelectCheckBox : "+selectCheckBox);
		if(selectCheckBox== true)
		{
			System.out.println("SelectCheckBox1 - pass");
		}
		else
		{
			System.out.println("SelectCheckBox1 - fail");
		}
		
		
	}

}
