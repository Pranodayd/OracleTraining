import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableControlHandling {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\Students\\Postman\\Drivers\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.get("https://letskodeit.teachable.com/p/practice");
		
		WebElement PriceElement=D.findElementByXPath("//td[text()='Selenium WebDriver With Java']/following-sibling::td");
		System.out.println(PriceElement.getText());
	
	
	}

}
