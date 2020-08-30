package Com.pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.TestBase.Testbase;

public class Sign extends Testbase 
{
	@FindBy(xpath="(//a[@href='/login'])[3]")
	WebElement sign;
	
	@FindBy(xpath="//select[contains(@class,'MuiNativeSelect-root MuiNativeSelect-select')]")
	WebElement clickonselect;
    
    @FindBy(id="txtMobileNumber")
	WebElement EnterMobileNumber;
    
    @FindBy(xpath="//button[text()='Sign In']")
    WebElement signIn;
    
    @FindBy(xpath="//div[text()='Real Estate']")
    WebElement realestate;
    
    @FindBy(xpath="//div[text()='RN4. Registering of a real estate mortgage contract']")
    WebElement RN4Estate;
    
    @FindBy(xpath="//button[text()='Agree']")
    WebElement agree;
    
    @FindBy(xpath="//span[text()='New Mortgage request']")
    WebElement NewMortgageRequest;
    
    @FindBy(xpath="//span[@class='MuiButton-label']")
    WebElement Mortgage;
    
    @FindBy(xpath="//button[text()='Proceed to Mortgage']")
    WebElement ProceedtoMortgage;
    
    @FindBy(xpath="//select[@name='entityName']")
    WebElement SelectEntityName;
    
    @FindBy(xpath="//input[@name='mortgageContractNumber']")
    WebElement MortgageContractNumber;
    
    @FindBy(xpath="//input[@class='form-control width100']")
    WebElement MortgageContractDate;
    
    @FindBy(xpath="//button[@aria-label='Next Month']")
    WebElement NextMonth;
    
    @FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--008']")
    WebElement NextMonthDate;
    
    @FindBy(xpath="//input[@id='strmortgageamount']")
    WebElement MortgageAmount;
    
    @FindBy(xpath="//input[@id='strfeesamount']")
    WebElement Feesamount;
    
    @FindBy(xpath="//input[@name='installmentValue']")
    WebElement Installmentvalue;
    
    @FindBy(xpath="//input[@name='numofInstallments']")
    WebElement Numberofinstallments;
    
    @FindBy(xpath="//button[text()='Proceed to Mortgage']")
    WebElement Proceedtomortgage;
    
    @FindBy(xpath="//img[@alt='getfile']")
    WebElement uploaddocument;
    
    @FindBy(xpath="(//img[@alt='getfile'])[2]")
    WebElement documenttype;
    
    @FindBy(xpath="(//button[text()='Upload'])[2]")
    WebElement uploadbutton;
    
    @FindBy(xpath="//button[text()='Proceed Payment']")
    WebElement proceedpayment;
    
    @FindBy(xpath="//button[@id='btnPayNow']")
    WebElement paynow;
    
    @FindBy(xpath="(//a[@href='/login'])[2]")
    WebElement logout;
    
    

   
   //create constructor---initialize pageobjects
    public Sign()
    {
    	PageFactory.initElements(driver, this); // this means, current class object
    }
    
    
    public void validatesignpage() throws Exception
    {
    	sign.click();
    	Thread.sleep(2000);
    	Select sel=new Select(clickonselect);
    	sel.selectByIndex(1);
    	Thread.sleep(3000);
    	EnterMobileNumber.sendKeys("90123456");
    	signIn.click();
    	realestate.click();
    	RN4Estate.click();
    	agree.click();
    	NewMortgageRequest.click();
    	Mortgage.click();
    	ProceedtoMortgage.click();
    	SelectEntityName.click();
    	
    	Select select=new Select(SelectEntityName);
    	select.selectByIndex(1);
    	MortgageContractNumber.sendKeys("10");
    	MortgageContractDate.click();
    	NextMonth.click();
    	NextMonthDate.click();
    	MortgageAmount.sendKeys("20");
    	Feesamount.sendKeys("10");
    	Installmentvalue.sendKeys("20");
    	Numberofinstallments.sendKeys("5");
    	Proceedtomortgage.click();
    	
    	uploaddocument.click();
    	Thread.sleep(2000);
        Runtime.getRuntime().exec("E:\\AutoIt\\FileUpload.exe");
        Thread.sleep(6000);
        
        documenttype.click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("E:\\AutoIt\\Document.exe");
        
        Thread.sleep(1000);
        uploadbutton.click();
        proceedpayment.click();
        paynow.click();
        logout.click();
    	
    
    	
    }
}
