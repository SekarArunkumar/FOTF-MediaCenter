package fotf_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import fotf_Config.Basedriver;
import fotf_Operations.O_Channelpage;

public class Obj_Channel extends O_Channelpage{

	public Obj_Channel(){
			
	}
	public Obj_Channel(WebDriver Driver){
		
		PageFactory.initElements(Driver, this);
	}
	
	@FindBy(xpath="html/body/div[2]/article/header/div[1]/div/ul/li[1]/a")
	public static WebElement topic1;
	
	@FindBy(xpath="html/body/div[2]/article/header/div[1]/div/ul/li[2]/a")
	public static WebElement topic2;
	
	@FindBy(xpath="html/body/div[2]/article/header/div[1]/div/ul/li[3]/a")
	public static WebElement topic3;
	
	@FindBy(xpath="html/body/div[1]/article/div/div[1]/section/div/a/img")
	public static WebElement featured_img;
	
	
	
	
	
}
