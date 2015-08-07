package fotf_Config;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import fotf_DDF.XmlUtil;

public class Trigger {
  @Test
  public void triggerProject() throws Exception {
	  XmlUtil.createXml();
	 // XmlUtil.autoRunXml();
  }
}
