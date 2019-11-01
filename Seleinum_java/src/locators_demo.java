import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_demo {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")
				+"\\src\\Browser_drivers\\chromedriver.exe";
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver",driverPath);  //chrome
		WebDriver driver= new ChromeDriver(); //chrome
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
		
//1. Id locator.
	  driver.findElement(By.id("email")).sendKeys("anki@gmail.com"); //it
		driver.findElement(By.id("pass")).sendKeys("anki");
		//driver.findElement(By.id("loginbutton")).click();  // to click the button
		driver.findElement(By.id("login_form")).submit(); //to submit the form
		
//2. name locator.
		 driver.findElement(By.name("firstname")).sendKeys("ankita"); 
		driver.findElement(By.name("lastname")).sendKeys("sharma"); 
	
//3. lintText locator and partiallicktext with <a> tag
		 driver.findElement(By.linkText("Forgotten account?")).click();  //linktext
		driver.findElement(By.partialLinkText("Forgotten account")).click();	//partiallinktext
		
		
		
//7. class name 
		//driver.findElement(By.className("inputtext")).sendKeys("sharma"); // only used when same class name doesnt exist
		int size= driver.findElements(By.className("inputtext")).size();
		System.out.println(size); // to check total no. of elments which having class name is same
		
		driver.findElements(By.className("inputtext")).get(3).sendKeys("sharma");
		
//8. tagname 
		 boolean res=driver.findElements(By.tagName("span")).get(8).isDisplayed();
		if(res){
			System.out.println("yes");
		}
		else{
			System.out.println("nooooooooooooooo");
		}
		
		String actul=driver.findElements(By.tagName("span")).get(7).getText();
		System.out.println(actul);
		String expt="Create an account";
		if(expt.equals(actul)){
			System.out.println("yes");
		}
		else{
			System.out.println("nooooooooooooooo");
		} 
		
		String value= driver.findElements(By.tagName("a")).get(0).getAttribute("href");
		System.out.println(value);
	}

}
