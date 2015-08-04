package fotf_Config;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

//import com.gargoylesoftware.htmlunit.xml.XmlUtil;





import org.testng.annotations.Test;

import fotf_DDF.ExcelLib;
import fotf_DDF.XmlUtil;
import fotf_Objects.FotfChannelPageobjects;
import fotf_Objects.FotfHomePageObjects;

public class Basedriver {
public static WebDriver Driver=null;
public static FotfHomePageObjects homepage;
public static FotfChannelPageobjects channelObj;
public static Logger log = Logger.getLogger(Basedriver.class.getName());
//public static ExcelLib excel=new ExcelLib("Switches\\Flags.xls");

public static void main(String args[]) throws Exception{
	XmlUtil.createXml();
	XmlUtil.autoRunXml();
	
}

	@BeforeSuite
	public static void config() throws Exception {
		
		
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
	
	@Test
	public static void sample1(){
		System.out.println("sample1");
	}
	
	@Test
	public static void sample2(){
		System.out.println("sample2");
	}
	
	@Test
	public static void sample3(){
		System.out.println("sample3");
	}
	
}
