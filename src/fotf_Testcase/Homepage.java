package fotf_Testcase;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import fotf_Config.Basedriver;
import fotf_DDF.XmlUtil;
import fotf_Objects.FotfChannelPageobjects;
import fotf_Objects.FotfHomePageObjects;

public class Homepage extends Basedriver{
	
	
	
	// Testcase for verifying FOTF Home page
	@Test
	public static void verify_fotf_logo(){
		log.info("Testcase Execution starts for verify Operation on FOTF Home Page Content");
		
		homepage.home_logo();
			
		
	}
	// Testcase for clicking FOTF Home page Objects
	@Test
	public static void click_fotf_channels(){
		log.info("Testcase Execution starts for click Operation on FOTF Home Page Channel Content");
		
		channelObj=homepage.channel_url();
		
		
	}
	
	
	
	
}
