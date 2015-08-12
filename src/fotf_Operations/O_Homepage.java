package fotf_Operations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import fotf_Config.Basedriver;
import fotf_Objects.Obj_Channel;
import fotf_Objects.Obj_Home;

public class O_Homepage extends Basedriver{
	
	static String actualChannelUrl=null;
	static String expectedChannelUrl=null;
		//Operation for Verifying FOTF logo
		public static void home_logo(){

			String actual_logo;
			String expected_logo="site_header--logo_lg icon-logo";
			
			actual_logo=homepage.logo.getAttribute("class");
			try{
				Assert.assertEquals(actual_logo, expected_logo);
				log.info("FOTF Logo content is available");
			}
			catch(AssertionError e){
				log.error("FOTF Logo content is not available");
			}
		}
		
		//Operation for Clicking on the Channel and Verifying whether all the channels are Navigating correctly or not
			public static Obj_Channel channel_url(){
			homepage.marriage.click();
			log.info("Clicking on the Marriage Channel of FOTF Home page");
			actualChannelUrl = Driver.getCurrentUrl();
			expectedChannelUrl ="http://www.focusonthefamily.com/marriage";
			try{
				Assert.assertEquals(actualChannelUrl, expectedChannelUrl);
				log.info("Navigated to Marriage Channel Page Correctly");
			}catch(AssertionError e){
				log.error("Navigating to Wrong Url");
				log.error("URL: "+actualChannelUrl);
			}
			
			homepage.parenting.click();
			log.info("Clicking on the Parenting Channel of FOTF Home page");
			actualChannelUrl = Driver.getCurrentUrl();
			expectedChannelUrl ="http://www.focusonthefamily.com/parenting";
			try{
				Assert.assertEquals(actualChannelUrl, expectedChannelUrl);
				log.info("Navigated to Parenting Channel Page Correctly");
			}catch(AssertionError e){
				log.error("Navigating to Wrong Url");
				log.error("URL: "+actualChannelUrl);
			}
			
			homepage.lifechallenges.click();
			log.info("Clicking on the Lifechallenges Channel of FOTF Home page");
			actualChannelUrl = Driver.getCurrentUrl();
			expectedChannelUrl ="http://www.focusonthefamily.com/lifechallenges";
			try{
				Assert.assertEquals(actualChannelUrl, expectedChannelUrl);
				log.info("Navigated to LifeChallenges Channel Page Correctly");
			}catch(AssertionError e){
				log.error("Navigating to Wrong Url");
				log.error("URL: "+actualChannelUrl);
			}
			
			homepage.faith.click();
			log.info("Clicking on the Faith Channel of FOTF Home page");
			actualChannelUrl = Driver.getCurrentUrl();
			expectedChannelUrl ="http://www.focusonthefamily.com/faith";
			try{
				Assert.assertEquals(actualChannelUrl, expectedChannelUrl);
				log.info("Navigated to Faith Channel Page Correctly");
			}catch(AssertionError e){
				log.error("Navigating to Wrong Url");
				log.error("URL: "+actualChannelUrl);
			}
			
			homepage.social.click();
			log.info("Clicking on the Social Channel of FOTF Home page");
			actualChannelUrl = Driver.getCurrentUrl();
			expectedChannelUrl ="http://www.focusonthefamily.com/socialissues";
			try{
				Assert.assertEquals(actualChannelUrl, expectedChannelUrl);
				log.info("Navigated to Social Channel Page Correctly");
			}catch(AssertionError e){
				log.error("Navigating to Wrong Url");
				log.error("URL: "+actualChannelUrl);
			}
			return new Obj_Channel();
		}
		
		public static void secondary_nav(){
			homepage.todaysbroadcast.click();
			/*familyhelp.click();
			about.click();
			store.click();*/
		}
}
