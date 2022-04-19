package textscript;

import java.io.IOException;

import generic.Base_class;
import generic.generic_excel;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import pomscript.pom_loginfacebook;

public class Testscript_login extends Base_class{
	@Test
	public void  test() throws EncryptedDocumentException, IOException
	{
		String user = generic_excel.getData("sheet1", 0, 0);
		String pass = generic_excel.getData("sheet1", 1, 0);
		
	
		pom_loginfacebook fb=new pom_loginfacebook(driver);
		fb.username(user);
		fb.password(pass);
		fb.login();
		Assert.fail();
		
	}

}
