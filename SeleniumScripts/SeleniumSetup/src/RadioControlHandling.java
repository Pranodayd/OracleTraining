import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioControlHandling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Students\\Postman\\Drivers\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.get("https://letskodeit.teachable.com/p/practice");
		
		WebElement BenzRadio=D.findElementById("benzradio");
		BenzRadio.click();
		boolean IsChecked=BenzRadio.isSelected();
		if(IsChecked==true)
		{
			System.out.println("After clicking on Radio control it got selected correctly");
		}	
	
		else
		{
			System.out.println("After clicking on Radio control it DID NOT get selected correctly");
		}	
		WebElement HondaRadio=D.findElementById("hondaradio");
		HondaRadio.click();
		IsChecked=HondaRadio.isSelected();
		if(IsChecked==true)
		{
			System.out.println("After clicking on Radio control it got selected correctly");
		}	
	
		else
		{
			System.out.println("After clicking on Radio control it DID NOT get selected correctly");
		}	
	
		IsChecked=BenzRadio.isSelected();
		if(IsChecked==false)
		{
			System.out.println("After clicking on OTHER Radio control,this one got Deselected correctly");
		}	
	
		else
		{
			System.out.println("After clicking on OTHER Radio control,this one did not get Deselected correctly");
		}	
	

	}

}
