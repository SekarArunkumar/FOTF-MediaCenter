package fotf_Config;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

//import com.gargoylesoftware.htmlunit.xml.XmlUtil;





import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fotf_DDF.ExcelLib;
import fotf_DDF.RD_XmlUtil;
import fotf_DDF.XmlUtil;
import fotf_Objects.FotfChannelPageobjects;
import fotf_Objects.FotfHomePageObjects;

public class Basedriver extends Trigger{
public static WebDriver Driver=null;
public static FotfHomePageObjects homepage;
public static FotfChannelPageobjects channelObj;
public static Logger log = Logger.getLogger(Basedriver.class.getName());

	@Parameters({ "browser" })
	@BeforeTest
	public static void config(String browser) throws Exception {
	
	DOMConfigurator.configure("log4j.xml");
	
	if(browser.equalsIgnoreCase("firefox")){
		 Driver=new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		 Driver=new ChromeDriver();
	}
	else{
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
		Driver=new InternetExplorerDriver(capabilities);			
	}
		
		Driver.get("http://www.focusonthefamily.com/");
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homepage=new FotfHomePageObjects(Driver);
		channelObj=new FotfChannelPageobjects(Driver);
		log.info(" ");
		log.info("******************************************************* ");
		log.info("TestCase Execution Starts for FOTF Media Center Project");
		log.info("******************************************************* ");
		log.info(" ");
			
	}
	
	@AfterTest
	public static void closeDriver(){
		log.info("TestCase Execution Finished for FOTF Media Center Project");
		log.info("Closing Driver");
		Driver.quit();
		
	}
	
	
	
}
