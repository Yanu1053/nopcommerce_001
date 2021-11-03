

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextVsGetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement username=driver.findElement(By.xpath("//*[@id='Email']"));
//		username.clear();
//		username.sendKeys("yanu1053@gmail.com");
		System.out.println(username.getAttribute("value"));
		System.out.println("getText "+username.getText());
		WebElement lonin=driver.findElement(By.xpath("//*[@type='submit']"));
		System.out.println(lonin.getText());
		System.out.println(lonin.getAttribute("class"));
		System.out.println(lonin.getAttribute("type"));
		//
		
		

	}

}
