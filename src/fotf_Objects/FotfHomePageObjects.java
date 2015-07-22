package fotf_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FotfHomePageObjects {
	//Initialize my objects in the page
	public FotfHomePageObjects(WebDriver Driver){
		PageFactory.initElements(Driver, this);
	}
	
	//FOTF Logo
	@FindBy(xpath="html/body/header/div/h1/a/i[2]")
	public static WebElement logo;

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

	//Operation for Verifying FOTF logo
	public static void home_logo(){

		String actual_logo;
		String expected_logo="site_header--logo_lg icon-logo";
		
		actual_logo=logo.getAttribute("class");
		try{
			Assert.assertEquals(actual_logo, expected_logo);
			System.out.println("FOTF Logo content is available");
		}
		catch(AssertionError e){
			System.out.println("FOTF Logo content is not available");
		}
	}
	//Operation for Clicking on the channel url's
	public static FotfChannelPageobjects channel_url(){
		
		marriage.click();
		
		parenting.click();
		lifechallenges.click();
		faith.click();
		social.click();
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
