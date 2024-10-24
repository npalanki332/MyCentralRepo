package SeleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest1 {

public static void main(String[] args)
{
WebDriver driver = new ChromeDriver();
driver.get("https://demo.guru99.com/test/newtours/reservation.php");
WebElement radioButton = driver.findElement(By.xpath("//input[@name='tripType'and@value='oneway']"));
//WebElement radioButton = driver.findElement(By.xpath("//input[@name='tripType'and@value='oneway']"));
boolean displayRadioButton = radioButton.isDisplayed();
System.out.println("displayRadioButton : "+displayRadioButton);
if (displayRadioButton == true)
{
System.out.println("RadioButton Displayed");
}
else
{
System.out.println("RadioButton not Displayed");
}
boolean enableRadioButton = radioButton.isEnabled();
System.out.println("enableRadioButton : "+enableRadioButton);
if (enableRadioButton == true)
{
System.out.println("RadioButton Enabled");
}
else
{
System.out.println("RadioButton not Enabled");
}

boolean radioButtonStatus = radioButton.isSelected();
System.out.println("radioButtonStatus : "+radioButtonStatus);
if (radioButtonStatus == true)
{
System.out.println("RadioButton selected");
}
else
{
System.out.println("Expected RadioButton not selected");
}
radioButton.click();

radioButtonStatus = radioButton.isSelected();
System.out.println("RadioButtonStatus : "+radioButtonStatus);
if (radioButtonStatus == true)
{
System.out.println("Expected RadioButton is selected");
}
else
{
System.out.println("RadioButton is not selected");
}




}

}
