package fotf_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FotfChannelPageobjects {

	public FotfChannelPageobjects(){
			
	}
	public FotfChannelPageobjects(WebDriver Driver){
		
		PageFactory.initElements(Driver, this);
	}
	
	
	@FindBy(xpath="html/body/div[2]/article/header/div[1]/div/ul/li[1]/a")
	public WebElement topic1;
	
	@FindBy(xpath="html/body/div[2]/article/header/div[1]/div/ul/li[2]/a")
	public WebElement topic2;
	
	@FindBy(xpath="html/body/div[2]/article/header/div[1]/div/ul/li[3]/a")
	public WebElement topic3;
	
	public void clickTopics(){
		topic1.click();
		topic2.click();
		topic3.click();
	}
}
