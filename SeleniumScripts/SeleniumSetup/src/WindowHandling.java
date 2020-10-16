import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Students\\Postman\\Drivers\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.get("https://letskodeit.teachable.com/p/practice");
		
		WebElement OpenWindowButton=D.findElementById("openwindow");
		OpenWindowButton.click();
		Thread.sleep(10000);
		/*
		 * Every opened window on screen has 1 unique property set i.e. WndHandle.
		 * 
		 */
		
		/*
		 * D.getWindowHandle(); will return handle of CURRENT WINDOW.
		 * CURRENT WINDOW MEANS THE WINDOW DRIVER IS CURRENTLY WORKING ON.
		 * 
		 * BY DEFAULT DRIVER WORKS ON WINDOW IT STARTS DURING TEST EXECUTION
		 */
		String OriginalWindowHandle=D.getWindowHandle();
		
		/*
		 * D.getWindowHandles() will return HANDLES OF ALL WINDOWS OPENED DURING THE TEST EXECUTION
		 * SESSION.
		 */
		Set<String>Handles=D.getWindowHandles();
		String[]HandlesArr=new String[Handles.size()];
		
		int index=0;
		for(String H:Handles)
		{
			/*
			 * Each handle would be retrieved 1 by 1 with every iteration of for loop
			 * and would be stored in variable H.
			 * This value from variable H would be stored in the array
				if(D.switchTo().window(H).getTitle().equals("Login"))
				{
					D.switchTo().window(H);
					break;
				}	
			 */
			
			
			HandlesArr[index++]=H;
		}	
		
		/*Following statement will switch driver from ORIGINAL WINDOW TO 2nd window
		 * and NOW onwards 2nd window will become CURRENT WINDOW.
		 * All APIs we call with the reference of Driver object gets performed on CURRENT WINDOW
		 * i.e. getTitle(),Close() etc.
		*/
		D.switchTo().window(HandlesArr[1]);
		System.out.println(D.getTitle());
		
		/*
		 * findElementByLinkText AND findElementByPartialLinkText are specifically to identify
		 * Hyperlinks based on their TEXTS which are always unique 
		 */
		WebElement LoginLink=D.findElementByLinkText("Login");
		LoginLink.click();
		Thread.sleep(10000);
		//D.close() CLOSES ONLY CURRENT WINDOW
		D.close();
		D.switchTo().window(HandlesArr[0]);
		/*D.quit() terminates the driver exe itself which results into terminating entire script 
		 * session and because of this ALL BROWSER WINDOWS STARTED IN THAT SCRIPT SESSION TERMINATES
		*/
		D.quit();
	}

}
