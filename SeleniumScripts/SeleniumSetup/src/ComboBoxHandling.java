import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ComboBoxHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Students\\Postman\\Drivers\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.get("https://letskodeit.teachable.com/p/practice");
		
		WebElement Combo=D.findElementById("carselect");
		Select Se=new Select(Combo);
		/*
		 * getFirstSelectedOption return <option> tag of SELECTED VALUE
		 * <option value="bmw">BMW</option>
		 */
		WebElement SelectedElement=Se.getFirstSelectedOption();
		String SelectedOptionValue=SelectedElement.getText();
		if(SelectedOptionValue.equals("BMW"))
			System.out.println("Deefult value selected in Combobox is CORRECT");
		else
			System.out.println("Deefult value selected in Combobox is NOT CORRECT");
		
		//This will select 2nd option from Combobox
		Se.selectByIndex(1);
		Thread.sleep(3000);
		Se.selectByValue("honda");
		Thread.sleep(3000);
		Se.selectByVisibleText("BMW");
		
		
		ArrayList<String>ExpectedCarNames=new ArrayList<String>();
		ExpectedCarNames.add("BMW");
		ExpectedCarNames.add("Benz");
		ExpectedCarNames.add("Honda");
		
		List<WebElement>AllOptions=Combo.findElements(By.tagName("option"));
		
		for(WebElement Option:AllOptions)
		{
			String OptionText=Option.getText();
			if(ExpectedCarNames.contains(OptionText))
			{
				System.out.println("Correct option is shown");
			}	
			else
			{	
				System.out.println("Correct option is NOT shown");
			}	
		}	
		
	}

}
