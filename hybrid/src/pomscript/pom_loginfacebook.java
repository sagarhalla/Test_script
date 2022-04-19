package pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import textscript.Base_page;

public class pom_loginfacebook extends Base_page {
	
@FindBy(id="email")
private WebElement usern;

@FindBy(id="pass")
private WebElement passw;

@FindBy(xpath="//button[@name='login']")
private WebElement lgn_btn;

public pom_loginfacebook(WebDriver driver)
{
	super(driver);
	
}
public void username(String user)
{
	usern.sendKeys(user);
}
public void password(String pass)
{
	passw.sendKeys(pass);
}
public void login()
{
	lgn_btn.click();
}
}
