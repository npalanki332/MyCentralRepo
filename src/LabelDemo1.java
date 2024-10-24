import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabelDemo1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get ("http://gmail.com");
		String actualValue = driver.findElement(By.xpath("//span[text()='to continue to Gmail']")).getText();
//		WebElement a1 = driver.findElement(By.xpath("//span [text()='to continue to Gmail']"));
//		String data = a1.getText();
		String expectedData = "to Continue to Gmail";

		if (actualValue.equals(expectedData))
		{
			System.out.println("Expected Data");
		}
		else
		{
			System.out.println("not a Expected Data");
		}		

	}

}
