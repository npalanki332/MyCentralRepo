package SeleniumDemo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioTest2 {

	public static void main(String[] args) 
	{

		List<WebElement> list = new ArrayList<WebElement>();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement radio1 = driver.findElement(By.xpath("//input[@type='radio'and@name='tripType'and@value='roundtrip']"));
		WebElement radio2 = driver.findElement(By.xpath("//input[@type='radio'and@name='tripType'and@value='oneway']"));
		WebElement radio3 = driver.findElement(By.xpath("//input[@type='radio'and@value='Coach']"));
		WebElement radio4 = driver.findElement(By.xpath("//input[@type='radio'and@value='Business']"));
		WebElement radio5 = driver.findElement(By.xpath("//input[@type='radio'and@value='First']"));
		list.add(radio1);
		list.add(radio2);
		list.add(radio3);
		list.add(radio4);
		list.add(radio5);
		list.get(3);
		list.get(3).click();
		WebElement listRadio3 = list.get(3);
		listRadio3.click();
		System.out.println("Click action performed on list.get(3)");


	}

}