package fotf_Operations;

import org.testng.Assert;
import org.testng.annotations.Test;

import fotf_Config.Basedriver;

public class O_Channelpage extends Basedriver{
	public static void clickTopics(){
		channelObj.topic1.click();
		channelObj.topic2.click();
		channelObj.topic3.click();
	}
	
	// Verifying Featured Image content on channel page
		public static void featuredimg(){
			String expected_featured_img="channel_featured--image";
			String actual_featured_img;
			
			actual_featured_img=channelObj.featured_img.getAttribute("class");
			try{
				Assert.assertEquals(actual_featured_img, expected_featured_img);
				log.info("Featured image content is available");
			}
			catch(AssertionError e){
				log.error("Featured image content is not available");
			}
		}
}
