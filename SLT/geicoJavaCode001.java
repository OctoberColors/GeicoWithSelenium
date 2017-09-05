package com.example.tests;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class geicoTC001 {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.geico.com";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testGeicoTC001() throws Exception {
		selenium.open("about:home");
		selenium.type("id=searchText", "geico.com");
		selenium.click("id=searchSubmit");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=An Insurance Company For Your Car And More | GEICO®");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=zip", "12345");
		selenium.click("id=submitButton");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=btnSubmit");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
