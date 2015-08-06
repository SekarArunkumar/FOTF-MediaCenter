package fotf_Testcase;

import org.testng.annotations.Test;

import fotf_Config.Basedriver;

public class Channelpage extends Basedriver{
	@Test
	public static void verify_fotf_channel(){
		log.info("Testcase Execution starts for verify Operation on FOTF Channel Page Featured Content");
		channelObj.featuredimg();
	}
	
	@Test
	public static void sample1(){
		System.out.println("sample1");
	}
	
	@Test
	public static void sample2(){
		System.out.println("sample2");
	}
	
	@Test
	public static void sample3(){
		System.out.println("sample3");
	}
}
