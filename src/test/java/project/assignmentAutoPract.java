package project;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import io.appium.java_client.android.AndroidDriver;

public class assignmentAutoPract {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		AndroidDriver driver;

		DesiredCapabilities cap = new DesiredCapabilities();

		// detail of device

		cap.setCapability("deviceName", "Pixel_2_API_29");
		cap.setCapability("udid", "emulator-5554");

		// platform details

		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10.0(Q)");

		// automation engine

		cap.setCapability("automationName", "UiAutomator1");

		// web driver detail

		cap.setCapability("chromedriverExecutable", "C:\\Selenium\\pixel\\chromedriver.exe");
		cap.setCapability("browserName", "Chrome");

		// server info

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		System.out.println("Application Started");

		// Access web page on Chrome browser
		// open automation practice web page
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(5000);

		// verify title
		String actual1 = driver.getTitle();
		String Expected1 = "My Store";
		System.out.println("title 1 verified = " + actual1.equals(Expected1));
		
		actual1.equals(Expected1);
		
		// click on sign in
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();

		Thread.sleep(3000);

		// verify title
		String actual2 = driver.getTitle();
		String Expected2 = "Login - My Store";
		System.out.println("title 2 verified = " + actual2.equals(Expected2));

		// type in email address to create an account and click on Create an account
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("johnmarq1@gmail.com"); // type email address
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click(); // click on create account

		Thread.sleep(3000);

		// verify title
		String actual3 = driver.getTitle();
		String Expected3 = "Login - My Store";
		System.out.println("title 3 verified = " + actual3.equals(Expected3));
		
		Thread.sleep(5000);
		
		// select title
		WebElement title = driver.findElement(
				By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[1]/div[1]/label/div/span/input"));
		title.click();

		// first name
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[2]/input"))
				.sendKeys("john");

		// last name
		driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("marq");

		// email
		driver.findElement(By.xpath("//*[@id=\"email\"]")).click();

		// password
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("123ABC");

		// date of birth
		Select day = new Select(driver.findElement(By.xpath("//*[@id=\"days\"]")));
		day.selectByValue("30");
		Select month = new Select(driver.findElement(By.xpath("//*[@id=\"months\"]")));
		month.selectByValue("8");
		Select year = new Select(driver.findElement(By.xpath("//*[@id=\"years\"]")));
		year.selectByValue("1980");

		// address
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("123 avenue west");

		// address2
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("b");

		// city
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("new york");

		// state
		Select state = new Select(driver.findElement(By.xpath("//*[@id=\"id_state\"]")));
		state.selectByValue("32");

		// postal code
		driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("23234");

		// add info
		driver.findElement(By.xpath("//*[@id=\"other\"]")).sendKeys("test");

		// mobile phone
		driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("5142223344");

		// register
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();
		
		Thread.sleep(3000);

		// verify title
		String actual4 = driver.getTitle();
		String Expected4 = "My account - My Store";
		System.out.println("title 4 verified = " + actual4.equals(Expected4));

		// click on sign out
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();

	}

}
