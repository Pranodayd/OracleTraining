import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Students\\Postman\\Drivers\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.get("https://letskodeit.teachable.com/p/practice");
	
	
		WebElement NameField= D.findElementById("name");
		NameField.sendKeys("Pranoday");
		
		Actions Act =new Actions(D);
		Act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		Act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//show-hide
		WebElement Field2= D.findElementByName("show-hide");
		Act.keyDown(Field2,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
	
	}

}
