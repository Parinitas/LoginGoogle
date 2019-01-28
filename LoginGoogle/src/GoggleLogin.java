import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoggleLogin {
	public static WebDriver driver; 
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\sadhup\\Downloads\\Drivers\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadhup\\Downloads\\Drivers\\chromedriver_win32\\chromedriver.exe");
		// driver = new FirefoxDriver();
		 driver = new ChromeDriver();
         driver.manage().window().maximize();
         String url = "https://accounts.google.com/signin";
         driver.get(url);

	}

}
