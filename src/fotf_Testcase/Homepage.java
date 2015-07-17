package fotf_Testcase;



import org.testng.annotations.Test;

import fotf_Config.Basedriver;

public class Homepage extends Basedriver{

	
	@Test
	public static void smoketest(){
		Driver.get("http://www.focusonthefamily.com/");
	}
}
