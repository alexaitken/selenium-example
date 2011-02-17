package com.thoughtcorp.seleniumexample;
import org.junit.Test;


public class SeleniumExampleTest extends SeleniumJunit4TestCase {
	
	@Test
	public void my_results_should_have_a_total_in_the_10000s() throws Exception {
		selenium.open("/firefox?client=firefox-a&rls=org.mozilla:en-US:official");
		selenium.type("sf", "alexaitken");
		selenium.click("btnG");
		selenium.waitForPageToLoad("30000");
		verifyEquals("regexp:About \\d{2},\\d{3} results",selenium.getText("css=#resultStats"));
	}
	

	
	@Test
	public void top_results_still_come_up() throws Exception {
		selenium.open("/firefox?client=firefox-a&rls=org.mozilla:en-US:official");
		selenium.type("sf", "alexaitken");
		selenium.click("btnG");
		selenium.waitForPageToLoad("30000");
		verifyEquals("www.alexaitken.ca/", selenium.getText("//div[@id='ires']/ol/li[1]/div/div[2]/span/cite"));
		
	}
	
	
	@Test
	public void testUntitled2() throws Exception {
		selenium.open("/firefox?client=firefox-a&rls=org.mozilla:en-US:official");
		selenium.type("sf", "thoughtcorp");
		selenium.click("btnG");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=#ires #result1 .mainlink");
		selenium.waitForPageToLoad("30000");
		selenium.click("//h1[@id='logo']/a");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Thoughtcorp", selenium.getTitle());
	}
	
	
}
