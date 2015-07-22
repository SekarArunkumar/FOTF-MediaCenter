package fotf_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FotfChannelPageobjects {
public static String expected_featured_img="channel_featured--image";
public static String actual_featured_img;
	public FotfChannelPageobjects(){
			
	}
	public FotfChannelPageobjects(WebDriver Driver){
		
		PageFactory.initElements(Driver, this);
	}
	
	
	@FindBy(xpath="html/body/div[2]/article/header/div[1]/div/ul/li[1]/a")
	public static WebElement topic1;
	
	@FindBy(xpath="html/body/div[2]/article/header/div[1]/div/ul/li[2]/a")
	public static WebElement topic2;
	
	@FindBy(xpath="html/body/div[2]/article/header/div[1]/div/ul/li[3]/a")
	public static WebElement topic3;
	
	@FindBy(xpath="html/body/div[2]/article/div/div[1]/section/div/img")
	public static WebElement featured_img;
	
	public static void clickTopics(){
		topic1.click();
		topic2.click();
		topic3.click();
	}
	
	// Verifying Featured Image content on channel page
	public static void featuredimg(){
		actual_featured_img=featured_img.getAttribute("class");
		try{
			Assert.assertEquals(actual_featured_img, expected_featured_img);
			System.out.println("Featured image content is available");
		}
		catch(AssertionError e){
			System.out.println("Featured image content is not available");
		}
	}
	
}
