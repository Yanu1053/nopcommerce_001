
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlesDropDowns {
	@Test
	public void dropdowns() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement drop=driver.findElement(By.xpath("//*[@rel-title='Select Country']/p/select[1]"));
		//drop.click();
		Select contrydrop=new Select(drop);
		//contrydrop.selectByVisibleText("India");
		List<WebElement> alloption=contrydrop.getOptions();
		
	}

}
