package fotf_Testcase;

import org.testng.annotations.Test;

import fotf_Config.Basedriver;

public class Channelpage extends Basedriver{
	@Test
	public static void verify_fotf_channel(){
		log.info("Testcase Execution starts for verify Operation on FOTF Channel Page Featured Content");
		channelObj.featuredimg();
		

		
	}
}
