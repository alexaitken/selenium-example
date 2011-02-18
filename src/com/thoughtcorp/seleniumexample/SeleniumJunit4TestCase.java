package com.thoughtcorp.seleniumexample;

import org.junit.After;
import org.junit.Before;

import com.thoughtworks.selenium.SeleneseTestBase;


public class SeleniumJunit4TestCase extends SeleneseTestBase {

	public String baseURL;

	public SeleniumJunit4TestCase() {
		super();
		this.baseURL = "http://www.google.com";
	}


	@Before
	public void setUp() throws Exception {
		super.setUp(baseURL);
		selenium.setSpeed("1000");
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
		
	}

}