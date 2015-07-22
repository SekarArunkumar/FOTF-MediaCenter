package fotf_Testcase;

import org.testng.annotations.Test;

import fotf_Config.Basedriver;

public class Channelpage extends Basedriver{
	@Test
	public static void fotf_channel(){

		channelObj.featuredimg();
		
		Driver.quit();
		
	}
}
