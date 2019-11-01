import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")
				+"\\src\\Browser_drivers\\chromedriver.exe";
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver",driverPath);  //chrome
		WebDriver driver= new ChromeDriver(); //chrome
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
		//xpath locator demo.
		int count=driver.findElements(By.tagName("a")).size();
		System.out.println(count);
		for(int j=45; j<count;j++)
		{
			String value=driver.findElements(By.tagName("a")).get(j).getAttribute("href");
			System.out.println(value);
		}

	}

}
