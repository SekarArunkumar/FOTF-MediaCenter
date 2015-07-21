package fotf_Testcase;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import fotf_Config.Basedriver;
import fotf_Objects.FotfChannelPageobjects;
import fotf_Objects.FotfHomePageObjects;

public class Homepage extends Basedriver{
	
	
	@Test
	public static void fotf_channel(){

		homepage.channel_url();
		Driver.quit();
		
	}
	
	
}
