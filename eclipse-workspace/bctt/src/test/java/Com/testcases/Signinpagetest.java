package Com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.TestBase.Testbase;
import Com.pageobjects.Sign;

public class Signinpagetest extends Testbase 
{
	Sign sin;
	
	public Signinpagetest() {
		super();
	}
	
	
    @BeforeMethod
    public void SetUp()
    {
    	implement();
    	sin=new Sign();
    }
    
    @Test
    public void signpage() throws Exception
    {
    	sin.validatesignpage();
    }
    
    
}
