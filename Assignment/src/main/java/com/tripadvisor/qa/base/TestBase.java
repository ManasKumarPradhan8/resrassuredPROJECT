package com.tripadvisor.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	static Properties prop;

	public TestBase() throws IOException {
		try {
			prop = new Properties();
			FileInputStream fi = new FileInputStream(
					"C:\\Users\\HP\\workspace\\Assignment\\src\\main\\java\\com\\tripadvisor\\qa\\config\\tripadvisor.properties");
			prop.load(fi);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

	public static void initialisation() {
		String browser = prop.getProperty("browser");
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			// driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			// driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
			break;
		case "default":
			System.out.println("Select a Brower to Initialise");
			break;
		}
		driver.get(prop.getProperty("url"));

	}
}
