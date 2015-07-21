package fotf_Config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import fotf_Objects.FotfChannelPageobjects;
import fotf_Objects.FotfHomePageObjects;

public class Basedriver {
public static WebDriver Driver=null;
public static FotfHomePageObjects homepage;
public static FotfChannelPageobjects channelObj;

	@BeforeSuite
	public static void config(){
	
		Driver=new FirefoxDriver();
		Driver.get("http://www.focusonthefamily.com/");
		homepage=new FotfHomePageObjects(Driver);
		channelObj=new FotfChannelPageobjects(Driver);
	}
	
}
