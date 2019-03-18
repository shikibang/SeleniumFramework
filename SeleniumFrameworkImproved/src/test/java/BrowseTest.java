import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowseTest {
	
	static String browser; // variable available to all the programs
	static WebDriver driver; 
	
	public static void main(String[] args) {
		setBrowser();
		setBrowserconfig();
		runTest();
		}
	
// function TIME	
	public static void setBrowser() {
		browser="Chrome";
		}
	
	public static void setBrowserconfig() {
		String projectLocation = System.getProperty("user.dir"); //location of the project 
		
		if(browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver",projectLocation+"\\drivers\\geckoDriver\\geckodriver.exe");
			System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe")	;	
			driver=new FirefoxDriver();
			//WebDriver driver=new MarionetteDriver();
		}
		
		if(browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver",projectLocation+"\\drivers\\chromeDriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
}

	public static void runTest(){
			driver.get("https://www.youtube.com/");
			driver.quit();
		}
		
	}