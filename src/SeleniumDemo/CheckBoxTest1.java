package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest1 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		WebElement checkBox = driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
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
			System.out.println("SelectCheckBox - Selected");
		}
		else
		{
			System.out.println("SelectCheckBox - Expected is not selected");
		}
		checkBox.click();// type = checkbox attribute not available on Xpath hence it is not a checkbox
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
