import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Students\\Postman\\Drivers\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.get("https://letskodeit.teachable.com/p/practice");
		
		WebElement NameField=D.findElementByName("enter-name");
		NameField.sendKeys("Pranoday");
		Thread.sleep(5000);
		String Name=NameField.getAttribute("value");
		//enter-name
		WebElement AlertBtn=D.findElementByCssSelector("input[value='Alert']");
		AlertBtn.click();
		/*
		 * D.switchTo().alert() will switch webdriver context from Browser DOM to Alert and 
		 * will return that Alert in the script.
		 */
		Alert Al=D.switchTo().alert();
		String Message=Al.getText();
		
		if(Message.contains(Name))
			System.out.println("Alert contains CORRECT message");
		else
			System.out.println("Alert contains INCORRECT message");
		/*
		 * accept() will simulate click on OK button of information alert
		 */
		Thread.sleep(5000);
		Al.accept();
		
	}

}
