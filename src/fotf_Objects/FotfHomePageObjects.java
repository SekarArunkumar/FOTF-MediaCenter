package fotf_Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import fotf_Config.Basedriver;

public class FotfHomePageObjects extends Basedriver{
	static String actualChannelUrl=null;
	static String expectedChannelUrl=null;
	//Initialize my objects in the page
	public FotfHomePageObjects(WebDriver Driver){
		PageFactory.initElements(Driver, this);
	}
	
	//FOTF Logo
	@FindBy(xpath="html/body/header/div/h1/a/i[2]")
	public static WebElement logo;

	//Operation for Verifying FOTF logo
	public static void home_logo(){

		String actual_logo;
		String expected_logo="site_header--logo_lg icon-logo";
		
		actual_logo=logo.getAttribute("class");
		try{
			Assert.assertEquals(actual_logo, expected_logo);
			log.info("FOTF Logo content is available");
		}
		catch(AssertionError e){
			log.error("FOTF Logo content is not available");
		}
	}
	
	//Channel Main Objects
		@FindBy(xpath=".//*[@id='main_nav']/ul[2]/li[1]/a")
		public static WebElement marriage;
		
		@FindBy(xpath=".//*[@id='main_nav']/ul[2]/li[2]/a")
		public static WebElement parenting;
		
		@FindBy(xpath=".//*[@id='main_nav']/ul[2]/li[3]/a")
		public static WebElement lifechallenges;
		
		@FindBy(xpath=".//*[@id='main_nav']/ul[2]/li[4]/a")
		public static WebElement faith;
		
		@FindBy(xpath=".//*[@id='main_nav']/ul[2]/li[5]/a")
		public static WebElement social;
		
		@FindBy(xpath=".//*[@id='main_nav']/ul[2]/li[6]/a")
		public static WebElement prolife;

	//Operation for Clicking on the channel url's
	public static FotfChannelPageobjects channel_url(){
		// Operation for Clicking on the Channel and Verifying whether all the channels are Navigating correctly or not
		//Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		marriage.click();
		log.info("Clicking on the Marriage Channel of FOTF Home page");
		actualChannelUrl = Driver.getCurrentUrl();
		expectedChannelUrl ="http://www.focusonthefamily.com/marriage";
		try{
			Assert.assertEquals(actualChannelUrl, expectedChannelUrl);
			log.info("Navigated to Marriage Channel Page Correctly");
		}catch(AssertionError e){
			log.error("Navigating to Wrong Url");
			log.error("URL: "+actualChannelUrl);
		}
		
		parenting.click();
		log.info("Clicking on the Parenting Channel of FOTF Home page");
		actualChannelUrl = Driver.getCurrentUrl();
		expectedChannelUrl ="http://www.focusonthefamily.com/parenting";
		try{
			Assert.assertEquals(actualChannelUrl, expectedChannelUrl);
			log.info("Navigated to Parenting Channel Page Correctly");
		}catch(AssertionError e){
			log.error("Navigating to Wrong Url");
			log.error("URL: "+actualChannelUrl);
		}
		
		lifechallenges.click();
		log.info("Clicking on the Lifechallenges Channel of FOTF Home page");
		actualChannelUrl = Driver.getCurrentUrl();
		expectedChannelUrl ="http://www.focusonthefamily.com/lifechallenges";
		try{
			Assert.assertEquals(actualChannelUrl, expectedChannelUrl);
			log.info("Navigated to LifeChallenges Channel Page Correctly");
		}catch(AssertionError e){
			log.error("Navigating to Wrong Url");
			log.error("URL: "+actualChannelUrl);
		}
		
		faith.click();
		log.info("Clicking on the Faith Channel of FOTF Home page");
		actualChannelUrl = Driver.getCurrentUrl();
		expectedChannelUrl ="http://www.focusonthefamily.com/faith";
		try{
			Assert.assertEquals(actualChannelUrl, expectedChannelUrl);
			log.info("Navigated to Faith Channel Page Correctly");
		}catch(AssertionError e){
			log.error("Navigating to Wrong Url");
			log.error("URL: "+actualChannelUrl);
		}
		
		social.click();
		log.info("Clicking on the Social Channel of FOTF Home page");
		actualChannelUrl = Driver.getCurrentUrl();
		expectedChannelUrl ="http://www.focusonthefamily.com/socialissues";
		try{
			Assert.assertEquals(actualChannelUrl, expectedChannelUrl);
			log.info("Navigated to Social Channel Page Correctly");
		}catch(AssertionError e){
			log.error("Navigating to Wrong Url");
			log.error("URL: "+actualChannelUrl);
		}
		
		
		//prolife.click();
		
		return new FotfChannelPageobjects();
	}
	// Secondary_nav Object
	@FindBy(xpath=".//*[@id='main_nav']/ul[1]/li[1]/a")
	public static WebElement todaysbroadcast;
	@FindBy(xpath=".//*[@id='main_nav']/ul[1]/li[2]/a")
	public static WebElement familyhelp;
	@FindBy(xpath=".//*[@id='main_nav']/ul[1]/li[3]/a")
	public static WebElement about;
	@FindBy(xpath=".//*[@id='main_nav']/ul[1]/li[4]/a")
	public static WebElement store;
	
	public static void secondary_nav(){
		todaysbroadcast.click();
		/*familyhelp.click();
		about.click();
		store.click();*/
	}
}
