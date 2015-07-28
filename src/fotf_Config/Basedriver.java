package fotf_Config;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import fotf_Objects.FotfChannelPageobjects;
import fotf_Objects.FotfHomePageObjects;

public class Basedriver {
public static WebDriver Driver=null;
public static FotfHomePageObjects homepage;
public static FotfChannelPageobjects channelObj;
public static Logger log = Logger.getLogger(Basedriver.class.getName());

	@BeforeSuite
	public static void config(){
		DOMConfigurator.configure("log4j.xml");
		Driver=new FirefoxDriver();
		Driver.get("http://www.focusonthefamily.com/");
		homepage=new FotfHomePageObjects(Driver);
		channelObj=new FotfChannelPageobjects(Driver);
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log.info(" ");
		log.info("******************************************************* ");
		log.info("TestCase Execution Starts for FOTF Media Center Project");
		log.info("******************************************************* ");
		log.info(" ");
		
	}
	
	@AfterSuite
	public static void closeDriver(){
		log.info("TestCase Execution Finished for FOTF Media Center Project");
		log.info("Closing Driver");
		Driver.quit();
		
	}
	
}
