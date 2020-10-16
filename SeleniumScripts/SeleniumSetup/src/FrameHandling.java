import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Students\\Postman\\Drivers\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		
		/*
		 * WebDriver by default works with the main html page
		 */
		
				/*
		 * Telling WebDriver to move its searching context from MAIN Page to frame
		 * hosting nested html document from which we want to work the elements
		 */
		D.switchTo().frame("iframeResult");
		
		WebElement Fname=D.findElementById("fname");
		Fname.sendKeys("Pranoday");
		/*
		 * When we type any text inside TextBox control(i.e. edit control),it gets set to
		 * value attribute of that control
		 */
		String FnameEntered=Fname.getAttribute("value");

		WebElement Lname=D.findElementById("lname");
		Lname.sendKeys("Dingare");
		
		WebElement LoginBtn=D.findElementByCssSelector("input[type='submit']");
		LoginBtn.click();
		Thread.sleep(10000);
		WebElement MessageDiv=D.findElementByCssSelector("div[style='word-wrap:break-word']");
		/*
		 * getText() retrieves the text from within element
		 */
		String Message=MessageDiv.getText();
		if(Message.contains(FnameEntered))
		{
			System.out.println("Data got submitted successfully");
		}	
		else
		{
			System.out.println("Data didnt get submitted successfully");
		}	
		
		/*
		 * D.switchTo().defaultContent() asks webdriver to come back to the MAIN HTML
		 */
		D.switchTo().defaultContent();
		/*
		 * findElementByClassName can not be used if a tag has COMPOSITE I.E. MULTIPLE VALUES set for
		 * class property hence we have to use CssSelector
		 */
		WebElement RunButton=D.findElementByCssSelector("button[class='w3-button w3-bar-item w3-green w3-hover-white w3-hover-text-green']");
		RunButton.click();
	}

}
