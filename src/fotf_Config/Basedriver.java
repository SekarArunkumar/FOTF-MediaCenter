package fotf_Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Basedriver {
public static WebDriver Driver;
	
	@BeforeSuite
	public static void basedriver(){
		Driver=new FirefoxDriver();
	}
}
