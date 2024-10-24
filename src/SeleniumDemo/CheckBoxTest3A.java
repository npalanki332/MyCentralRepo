package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest3A
{

	public static void main(String[] args)
	{
		CheckBoxTest3A multipleCheckBox = new CheckBoxTest3A();
		multipleCheckBox.selectcheckbox(5);
	}
	public WebElement selectcheckbox(int a)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
		for(int d= a; a<=100; a++)
		{
			if(a%5==0)
			{
				WebElement  checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"+"["+a+"]"));
				checkBox.click();
				boolean a1 = checkBox.isSelected();
				System.out.println(a1);
			}
			
		}
		
		return null;


	}

}