package stepDefinations;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AboutPage;
import pageObjects.BlogPage;
import pageObjects.ElectPage;
import pageObjects.FlatsalePage;
import pageObjects.HostelPage;
import pageObjects.LoginPage;
import pageObjects.PostPage;
import pageObjects.RentalAgtPage;
import pageObjects.SellerPage;
import pageObjects.WarehousePage;
import utilities.BaseClass;
import utilities.CaptureScreenshot;


public class Steps extends BaseClass {
      public LoginPage lp;
      public ElectPage ep;
      public PostPage pp;
      public SellerPage sp;
      public AboutPage ap;
      public BlogPage bp;
      public FlatsalePage fsp;
      public HostelPage hp;
      public RentalAgtPage rap;
      public WarehousePage wp;
      public CaptureScreenshot screenshot;
	
	@Before
	public void setup()
	
	{
		logger=Logger.getLogger("nobroker");
		PropertyConfigurator.configure("log4j.properties");
		screenshot =new CaptureScreenshot();
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
	         driver=new ChromeDriver();
	         logger.info("--Launching browser--");
	         driver.manage().window().maximize();
		}
		else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
			driver =new FirefoxDriver();
			 logger.info("--Launching browser--");
	         driver.manage().window().maximize();	
		}	}

	 @Given("^Initialize the browser$")
	    public void initialize_the_browser_with_chrome() throws Throwable {
	         lp=new LoginPage(driver);
	         ep=new ElectPage(driver);
	         pp=new PostPage(driver);
	         sp=new SellerPage(driver);
	         ap=new AboutPage(driver);
	         bp=new BlogPage(driver);
	         fsp=new FlatsalePage(driver);
	         hp=new HostelPage(driver);
	         rap=new RentalAgtPage(driver);
	         wp=new WarehousePage(driver);
	    }
	 @Given("^Navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String url) throws Throwable {
	        driver.get(url);
	    }

	    @When("^User clicks on Login$")
	    public void user_clicks_on_login() throws Throwable {
	        lp.login();
	        logger.info("User clicked Login");
	    }
	    
	    @When("^User enters mobile number (.+)$")
	    public void user_enters_mobile_number(String mobilenum) throws Throwable {
	        lp.number(mobilenum);
	        logger.info("User entered mobile number");
	    }
	    
	    @When("^User clicks on I've Password$")
	    public void user_clicks_on_ive_password() throws Throwable {
	    	Thread.sleep(5000);
	       lp.radiobt();
	       logger.info("User clicked on I've Password");
	      
	    }
	    
	    @When("^User enters password (.+)$")
	    public void user_enters_password(String password) throws Throwable {
	    			    	   
	     lp.password(password);
	     logger.info("User entered password");

	    }



	    @When("^User clicks on Continue$")
	    public void user_clicks_on_continue() throws Throwable {
	      lp.contbt();
	      logger.info("User clicked on Continue");
	      

	    }

	    @Then("^Verify that text (.+) is displayed$")
	    public void verify_that_text_is_displayed(String result) throws Throwable {
	    	boolean correct=lp.verify();
	    	if(correct=true) {
		 		   Assert.assertTrue(true);
		 		  logger.info("--To verify Login functionality Passed--");
		 	   }
		    	else {
		 		   
		 		  logger.info("--To verify Login functionality Failed--");
		 		 screenshot.takeScreenshot(driver);

		 		   Assert.assertTrue(false);
		 	   } 	  
	    }
	    
	    @Then("^close browser$")
	    public void close_browser() throws Throwable {
	    logger.info("--Exiting browser--");
	   	 driver.quit(); 
	    }
	    
	  //steps remaining for electrician page
	    
	    @When("^User clicks on \"([^\"]*)\" under \"([^\"]*)\" in footer$")
	    public void user_clicks_on_something_under_something_in_footer(String strArg1, String strArg2) throws Throwable {
	        ep.scroll();
	        logger.info("User clicked on  Miscellaneous");
	        ep.electrician();
	        logger.info("User clicked on  Electrician Services Bangalore");
	    }
	    
	    @Then("^Verify that text \"([^\"]*)\" is displayed in next page$")
	    public void verify_that_text_something_is_displayed_in_next_page(String strArg1) throws Throwable {
	    	Thread.sleep(5000);
	        if(driver.getTitle().contains("Electrician")) {
	        	 Assert.assertTrue(true);
		 		  logger.info("--To verify Electrican service Passed--");
		 	   }
		    	else {
		 		   
		 		  logger.info("--To verify Electrican service Failed--");
		 		 screenshot.takeScreenshot(driver);

		 		   Assert.assertTrue(false);
		 	   } 	  
	        	
	        }
	    
	    //steps remaining for post property page
	    
	    @When("^User clicks on \"([^\"]*)\"$")
	    public void user_clicks_on_something(String strArg1) throws Throwable {
	    	Thread.sleep(2000);
	        pp.property();
	        logger.info("User clicked on Post Free property ad");
	    }
	    
	    @Then("^Verify that text \"([^\"]*)\" is displayed in same page$")
	    public void verify_that_text_something_is_displayed_in_same_page(String strArg1) throws Throwable {
	    	Thread.sleep(5000);
	        if(driver.getPageSource().contains("Sell or Rent your Property For Free")) {
	        	logger.info("Page contains Sell or Rent your Property For Free ");
	        	 Assert.assertTrue(true);
		 		  logger.info("--To verify Post property Passed--");
		 	   }
		    	else {
		 		   
		 		  logger.info("--To verify Post property Failed--");
		 		 screenshot.takeScreenshot(driver);

		 		   Assert.assertTrue(false);
		 	   } 	  
	    }
	    
	  //steps remaining for seller page

	    @When("^User clicks on Menu$")
	    public void user_clicks_on_menu() throws Throwable {
	        sp.menuss();
	        logger.info("User clicked on Menu");

	    }
	    
	    @When("^User clicks on Sellers plan$")
	    public void user_clicks_on_sellers_plan() throws Throwable {
	       sp.plan();
	       logger.info("User clicked on Seller Plans");
	    }
       
	    @Then("^Verify that title contains text \"([^\"]*)\"$")
	    public void verify_that_title_contains_text_something(String strArg1) throws Throwable {
	    	Thread.sleep(2000);
	        if(driver.getTitle().contains("Seller Plans")) {
	        	 Assert.assertTrue(true);
		 		  logger.info("--To check sellers plans Passed--");
		 	   }
		    	else {
		 		   
		 		  logger.info("--To check sellers plans Failed--");
		 		 screenshot.takeScreenshot(driver);

		 		   Assert.assertTrue(false);
		 	   } 	  
	    }
	    
	  //steps remaining for about page

	    @When("^User clicks on \"([^\"]*)\" in footer$")
	    public void user_clicks_on_something_in_footer(String strArg1) throws Throwable {
	        ap.down();
	        logger.info("User clicked on About us");
	    }
	    
	    @Then("^Verify whether text \"([^\"]*)\" is displayed$")
	    public void verify_whether_text_something_is_displayed(String strArg1) throws Throwable {
	    	Thread.sleep(5000);
	        if(driver.getPageSource().contains("Welcome to NoBroker!")) {
	        	logger.info("Page contains Sell or Rent your Property For Free ");
	        	 Assert.assertTrue(true);
		 		  logger.info("--To check About Us  Passed--");
		 	   }
		    	else {
		 		   
		 		  logger.info("--To check About Us Failed--");
		 		 screenshot.takeScreenshot(driver);

		 		   Assert.assertTrue(false);
		 	   } 	  
	    }
	    
	  //steps remaining for blog page
	    
	    @When("^User clicks on Blog$")
	    public void user_clicks_on_blog() throws Throwable {
	        bp.blog();
	        logger.info("User clicked on Blog");
	    }
	    
	    @Then("^Verify whether title contains text \"([^\"]*)\"$")
	    public void verify_whether_title_contains_text_something(String strArg1) throws Throwable {
	    	Thread.sleep(2000);
	        if(driver.getTitle().contains("The NoBroker Times")) {
	        	 Assert.assertTrue(true);
		 		  logger.info("--To check noboker's blog Passed--");
		 	   }
		    	else {
		 		   
		 		  logger.info("--To check nobroker's blog Failed--");
		 		 screenshot.takeScreenshot(driver);

		 		   Assert.assertTrue(false);
		 	   } 	  
	    }
	    
	    //steps remaining for flats for sale  page
	    @When("^User clicks on \"([^\"]*)\" under \"([^\"]*)\" in the footer$")
	    public void user_clicks_on_something_under_something_in_the_footer(String strArg1, String strArg2) throws Throwable {
	      fsp.nagar();
	      logger.info("User clicked on Flats for sale in T Nagr");
	    }

	    @Then("^Verify that text \"([^\"]*)\" is displayed in the redirected page$")
	    public void verify_that_text_something_is_displayed_in_the_redirected_page(String strArg1) throws Throwable {
	    	Thread.sleep(5000);
	    	
	        if(driver.getTitle().contains("Flats for Sale in T Nagar")) {
	        	logger.info("Page contains all the available options ");
	        	 Assert.assertTrue(true);
		 		  logger.info("--To check Flats for sale in T Nagar  Passed--");
		 	   }
		    	else {
		 		   
		 		  logger.info("--To check Flats for sale in T Nagar Failed--");
		 		 screenshot.takeScreenshot(driver);

		 		   Assert.assertTrue(false);
		 	   } 	  
	    }

	    //steps remaining for PG or Hostels  page
	    
	    @When("^User clicks on \"([^\"]*)\" under \"([^\"]*)\" under PG or Hostels$")
	    public void user_clicks_on_something_under_something_under_pg_or_hostels(String strArg1, String strArg2) throws Throwable {
	        hp.hostel();
	        logger.info("User clicked on PG in Powai");
	    }
	    
	   
	    
	    @Then("^Verify that text \"([^\"]*)\" is displayed on the redirected page$")
	    public void verify_that_text_something_is_displayed_on_the_redirected_page(String strArg1) throws Throwable {
	    	Thread.sleep(5000);
	    	
	        if(driver.getPageSource().contains("PG in Powai")) {
	        	 Assert.assertTrue(true);
		 		  logger.info("--To check PG or Hostel Passed--");
		 	   }
		    	else {
		 		   
		 		  logger.info("--To check PG or Hostel Failed--");
		 		 screenshot.takeScreenshot(driver);

		 		   Assert.assertTrue(false);
		 	   } 	  
	    }
	    
	  //steps remaining for Rental Agreement  page
	    
	    @When("^User clicks on \"([^\"]*)\" under Rent in footer$")
	    public void user_clicks_on_something_under_rent_in_footer(String strArg1) throws Throwable {
	        rap.rental();
	        logger.info("User clicked on Rental Agreement under Rent in footer");
	    }

	    @Then("^Verify whether title has \"([^\"]*)\" is the next or redirected page$")
	    public void verify_whether_title_has_something_is_the_next_or_redirected_page(String strArg1) throws Throwable {
         Thread.sleep(2000);
	    	
	        if(driver.getPageSource().contains("Rental Agreement")) {
	        	 Assert.assertTrue(true);
		 		  logger.info("--To check about Rental Agreement Passed--");
		 	   }
		    	else {
		 		   
		 		  logger.info("--To check about Rental Agreement Failed--");
		 		 screenshot.takeScreenshot(driver);

		 		   Assert.assertTrue(false);
		 	   } 	     
	    }
	    
	  //steps remaining for Warehouse  page
	    
	    @When("^User clicks on \"([^\"]*)\" for options$")
	    public void user_clicks_on_something_for_options(String strArg1) throws Throwable {
	       wp.commercial();
	       logger.info("User clicked on Commercial");
	    }
	    
	    @When("^User clicks on \"([^\"]*)\" under it$")
	    public void user_clicks_on_something_under_it(String strArg1) throws Throwable {
	       wp.wareh();
	       logger.info("User clicked on Warehouse for Rent in Gurgaon");
	    }
	    
	    @Then("^Verify that text \"([^\"]*)\" is displayed in the title of the page$")
	    public void verify_that_text_something_is_displayed_in_the_title_of_the_page(String strArg1) throws Throwable {
         Thread.sleep(5000);
	    
	        if(driver.getPageSource().contains("Warehouse")) {
	        	logger.info("Page contains all the available options ");
	        	 Assert.assertTrue(true);
		 		  logger.info("--To check warehouses for rent  Passed--");
		 	   }
		    	else {
		 		   
		 		  logger.info("--To check warehouses for rent Failed--");
		 		 screenshot.takeScreenshot(driver);

		 		   Assert.assertTrue(false);
		 	   }
	    }


	    }
	    
	    
	    
	    
	    
	    

