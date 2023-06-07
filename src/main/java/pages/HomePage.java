package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	@FindBy(xpath = "(//*[@class='prd-block']//a)[1]")
	WebElement terminsurance;
	
	@FindBy(xpath="//*[@id='nameAdd']")
	WebElement name;
	
	
	@FindBy(xpath = "//*[@id='dob']")
	WebElement dob;
	
	@FindBy(xpath = "//*[@id='mobileNo']")
	WebElement mobile;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public String getTitleOfPage()
	{
		String title = driver.getTitle();
		
		System.out.println(title);
		
		return title;
	}
	
	public void navToTermPage()
	{
		terminsurance.click();
	}
	
	public void enteringDetails(String nameofperson)
	{
		name.sendKeys(nameofperson);
		
		dob.sendKeys("07061995");
		
		mobile.sendKeys("9988776655");
		
	}
	
	
}
