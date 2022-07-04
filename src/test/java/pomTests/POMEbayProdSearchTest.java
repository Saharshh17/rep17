package pomTests;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pompages.BrowserFactory;
import pompages.ClsEbay;

public class POMEbayProdSearchTest
{
  @Test
  public void prodSearch() 
  {
	  WebDriver driver=BrowserFactory.startBrowser("Chrome", "http://ebay.com");

		ClsEbay obj=new ClsEbay(driver);
		obj.fnSearch("Sony");

		Reporter.log("Ebay Product Search Test is Successful...",true);
  }
}
