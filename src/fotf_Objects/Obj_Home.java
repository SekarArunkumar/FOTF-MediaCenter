package fotf_Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import fotf_Config.Basedriver;
import fotf_Operations.O_Homepage;

public class Obj_Home extends O_Homepage{
	
	//Initialize my objects in the page
		public Obj_Home(WebDriver Driver){
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

	
	//Secondary_nav Object
		@FindBy(xpath=".//*[@id='main_nav']/ul[1]/li[1]/a")
		public static WebElement todaysbroadcast;
		@FindBy(xpath=".//*[@id='main_nav']/ul[1]/li[2]/a")
		public static WebElement familyhelp;
		@FindBy(xpath=".//*[@id='main_nav']/ul[1]/li[3]/a")
		public static WebElement about;
		@FindBy(xpath=".//*[@id='main_nav']/ul[1]/li[4]/a")
		public static WebElement store;
	}
