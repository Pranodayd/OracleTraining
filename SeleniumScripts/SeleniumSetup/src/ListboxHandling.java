import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxHandling {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver", "E:\\Students\\Postman\\Drivers\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.get("https://letskodeit.teachable.com/p/practice");
		
		WebElement ListBox=D.findElementById("multiple-select-example");
		Select Se=new Select(ListBox);
		
		Se.selectByIndex(0);
		Thread.sleep(2000);
		Se.deselectAll();
		Se.selectByValue("peach");
		
		
	}

}
