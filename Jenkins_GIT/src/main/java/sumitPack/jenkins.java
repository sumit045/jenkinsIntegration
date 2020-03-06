package sumitPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class jenkins {
	
	@Test
	public void test()
	{
		System.out.println("Test success hoga");
		String path = "C:\\Users\\SumitKumar\\git\\repositoryJenkins\\Jenkins_GIT\\Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
	}

}
