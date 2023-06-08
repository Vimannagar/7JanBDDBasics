package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath = "//*[@id='submitButton']")
	WebElement freequotes;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
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
			
	}
	
	public void enterDOB(String dateofbirth)
	{
		dob.sendKeys(dateofbirth);
	}
	
	public void enterMobile(String mobilenumber)
	{
		mobile.sendKeys(mobilenumber);
		
	
	}
	
	public void clickOnFreeQuote()
	{
		freequotes.click();
	}
	
	
}
