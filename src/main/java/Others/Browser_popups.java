package Others;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_popups {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Integer> contentsetting = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		
		//contentsetting.put("notifications", 2);
		contentsetting.put("geolocation", 2);
		profile.put("managed_default_content_settings", contentsetting);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//driver.get("https://www.irctc.co.in/nget/train-search");
		driver.get("https://whatmylocation.com/");
		
		Thread.sleep(7000);
		//driver.close();
		
		
		
		
	}
	
}
