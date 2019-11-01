
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		//1. get drivers and set drivers.
		String driverPath=System.getProperty("user.dir")
				+"\\src\\Browser_drivers\\chromedriver.exe";
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver",driverPath);  //chrome
			//System.setProperty("webdriver.gecko.driver",driverPath); // for firefox
		//2. launch drivers.
		WebDriver driver= new ChromeDriver(); //chrome
			//WebDriver driver_1= new FirefoxDriver();
		//3. launch application.
			//driver.manage().window().setPosition(new Point(-2000,0)); //to minimize
		driver.manage().window().maximize();					// maximize
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
		String title1=driver.getCurrentUrl();
		System.out.println(title1);
			//driver.get("https://artoftesting.com/");
		driver.navigate().back();
		
	}

}
