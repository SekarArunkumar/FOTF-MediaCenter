package fotf_Config;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import fotf_DDF.XmlUtil;

public class Trigger {
  public static void main(String args[]) throws Exception {
	  XmlUtil.createXml();
	 // XmlUtil.autoRunXml();
  }
}
