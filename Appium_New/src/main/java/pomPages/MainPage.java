package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MainPage {
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Views']")
	private WebElement ViewsText;
	
	public MainPage(AndroidDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public WebElement getViewsText() {
		return ViewsText;
	}

	
	}

	

