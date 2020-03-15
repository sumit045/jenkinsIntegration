package sumitPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class jenkins {
	
	/*public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
	}*/
	
	@Test
	public void test()
	{
		System.out.println("Test success hoga");
		String path = System.getProperty("user.dir")+ "\\Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
	}

}
