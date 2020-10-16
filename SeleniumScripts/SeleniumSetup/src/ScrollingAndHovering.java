import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingAndHovering {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Students\\Postman\\Drivers\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.get("https://letskodeit.teachable.com/p/practice");
	
		
		WebElement Btn=D.findElementById("mousehover");
		/*
		 * Here we want to scroll the page.Seleium does not have any API for page scroll,but JAVASCRIPT
		 * does have an API to support page scroll
		 * Following will sroll the pagge untill required element is aligned to the bottom of the page
		 * arguments[0].scrollIntoView(false);
		 * 
		 */
		D.executeScript("arguments[0].scrollIntoView({block: \"center\"});", Btn);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * Actions class supports ADVANCED KEYBOARD and MOUSE OPERATIONS OVER AND ABOVE
		 * NORMAL CLICK AND TYPING.
		 * We need to call perform() function to get the actions performed
		 */
		Actions Act=new Actions(D);
		Act.moveToElement(Btn).perform();
		//mousehover
	
	}

}
