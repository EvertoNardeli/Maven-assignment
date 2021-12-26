package project;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;

public class webApp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver driver;
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		//detail of device
		
		cap.setCapability("deviceName", "Pixel_2_API_29");
		cap.setCapability("udid", "emulator-5554");
		
		//platform details
		
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10.0(Q)");
		
		//automation engine
		
		cap.setCapability("automationName", "UiAutomator1");
		
		//web driver detail
		
		cap.setCapability("chromedriverExecutable", "C:\\Selenium\\pixel\\chromedriver.exe");
		cap.setCapability("browserName", "Chrome");
		
		//server info
		
		driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		System.out.println("Application Started");
		
		// Access web page on Chrome browser
		
		/*
		driver.get("http://zero.webappsecurity.com/login.html");
		Thread.sleep(5000);
		
		driver.findElementById("user_login").sendKeys("username");
		driver.findElementById("user_password").sendKeys("password");
		driver.findElementByXPath("/html/body/div[1]/div[2]/div/div/div/form/div[2]/input").click();
		*/
		
		// open Demo Guru web page
		driver.get("http://demo.guru99.com");
		Thread.sleep(5000);
		
		//click on insurance project
		driver.findElementByXPath("/html/body/div[1]/div[2]/nav/div/div/ul/li[3]/a").click();
		Thread.sleep(2000);
		
		//click on Register
		driver.findElementByXPath("/html/body/div[3]/a").click();
		Thread.sleep(2000);
		
		//select drop down title
		Select title = new Select(driver.findElementById("user_title"));
		title.selectByValue("Captain");
		
		//click on first name and type in
		driver.findElementById("user_firstname").sendKeys("john");
		
		//click on surname and type in
		driver.findElementById("user_surname").sendKeys("marq");
		
		//click on phone and type in
		driver.findElementById("user_phone").sendKeys("5142223344");
		
		//select date of birth
		Select year = new Select(driver.findElementById("user_dateofbirth_1i"));
		year.selectByValue("1980");
		Select month = new Select(driver.findElementById("user_dateofbirth_2i"));
		month.selectByValue("8");//august
		Select day = new Select(driver.findElementById("user_dateofbirth_3i"));
		day.selectByValue("30");

		//select web element Provisional
		WebElement prov = driver.findElementById("licencetype_f");
		prov.click();
		
		//select occupation
		Select occ = new Select(driver.findElementById("user_occupation_id"));
		occ.selectByValue("6");//student
		
		//click on address street and type in
		driver.findElementById("user_address_attributes_street").sendKeys("1212 Avenue west");
		
		//click on city and type in
		driver.findElementById("user_address_attributes_city").sendKeys("Montreal");
		
		//click on country and type in
		driver.findElementById("user_address_attributes_county").sendKeys("Canada");
		
		//click on postal code and type in
		driver.findElementById("user_address_attributes_postcode").sendKeys("h1h2v2");
		
		//click on email and type in
		driver.findElementById("user_user_detail_attributes_email").sendKeys("johnmarq@gmail.com");
		
		//click on password and type in
		driver.findElementById("user_user_detail_attributes_password").sendKeys("abc123");
		
		//click on confirm password and type in
		driver.findElementById("user_user_detail_attributes_password_confirmation").sendKeys("abc123");
		
	}

}
