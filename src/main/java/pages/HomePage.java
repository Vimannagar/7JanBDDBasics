package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	@FindBy(xpath = "//*[@id='submitButton123']")
	WebElement freequotes;
	
	WebDriverWait wait;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(80));
		
	}
	
	
	public String getTitleOfPage() throws InterruptedException
	{
		Thread.sleep(2000);
		String title = driver.getTitle();
		
		System.out.println(title);
		
		return title;
	}
	
	public void navToTermPage()
	{
		terminsurance.click();
	}
	
	public void enteringDetails(String nameofperson) throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(name));
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
