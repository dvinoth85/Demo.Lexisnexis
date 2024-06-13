package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class Steps {
	
	
	    WebDriver driver;

	    @Before
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @Given("I open LexisNexis Risk Solutions homepage")
	    public void i_open_lexisnexis_risk_solutions_homepage() throws InterruptedException {
	        driver.get("https://risk.lexisnexis.co.uk/");
	        Thread.sleep(5000);
	        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	    }

	    @When("I Click on Choose Your Industry tab")
	    public void i_click_on_choose_your_industry_tab() throws InterruptedException {
	        driver.findElement(By.linkText("Choose Your Industry")).click();
	        
	    }


	    @Then("the Financial Services link should be present, clickable and active")
	    public void the_link_should_be_present_and_clickable() throws InterruptedException {
	        WebElement link = driver.findElement(By.xpath("//ul[@role=\"tablist\"]/li[1]/a"));
	        Assert.assertTrue("Link is not displayed", link.isDisplayed());
	        Assert.assertTrue("Link is not enabled", link.isEnabled());
	        
	        JavascriptExecutor ex=(JavascriptExecutor)driver; 
	        ex.executeScript("arguments[0].click()",link);
	        Assert.assertTrue(driver.findElement(By.linkText("View Financial Services Home")).isDisplayed());
	    }
	    
	    @Then("the Insurance link should be present, clickable and active")
	    public void the_insurance_link_should_be_present_and_clickable() throws InterruptedException {
	    	WebElement link = driver.findElement(By.xpath("//ul[@role=\"tablist\"]/li[2]/a"));
	        Assert.assertTrue("Link is not displayed", link.isDisplayed());
	        Assert.assertTrue("Link is not enabled", link.isEnabled());
	        
	        JavascriptExecutor ex=(JavascriptExecutor)driver; 
	        ex.executeScript("arguments[0].click()",link);
	        Assert.assertTrue(driver.findElement(By.linkText("View Insurance Home")).isDisplayed());   
	    }

	    @Then("the Life and Pensions link should be present, clickable and active")
	    public void the_life_and_pensions_link_should_be_present_clickable_and_active() throws InterruptedException {
	    	WebElement link = driver.findElement(By.xpath("//ul[@role=\"tablist\"]/li[3]/a"));
	        Assert.assertTrue("Link is not displayed", link.isDisplayed());
	        Assert.assertTrue("Link is not enabled", link.isEnabled());
	        
	        JavascriptExecutor ex=(JavascriptExecutor)driver; 
	        ex.executeScript("arguments[0].click()",link);
	        Assert.assertTrue(driver.findElement(By.linkText("View Life and Pensions Home")).isDisplayed());   
	    }
	    
	    @Then("the Corporations and Non-Profits link should be present, clickable and active")
	    public void the_corporations_and_non_profits_link_should_be_present_clickable_and_active() throws InterruptedException {
	    	WebElement link = driver.findElement(By.xpath("//ul[@role=\"tablist\"]/li[4]/a"));
	        Assert.assertTrue("Link is not displayed", link.isDisplayed());
	        Assert.assertTrue("Link is not enabled", link.isEnabled());
	        
	        JavascriptExecutor ex=(JavascriptExecutor)driver; 
	        ex.executeScript("arguments[0].click()",link);
	        Assert.assertTrue(driver.findElement(By.linkText("View Corporations and Non-Profits Home")).isDisplayed());   
	    }

	    @When("I click on the Financial Services link")
	    public void i_click_on_the_financial_services_link() throws InterruptedException {
	    	driver.findElement(By.xpath("//ul[@role=\"tablist\"]/li[1]/a")).click();

}

	    @Then("the Financial Crime Compliance link should be present and clickable")
	    public void the_financial_crime_compliance_link_should_be_present_and_clickable() throws InterruptedException {
	    	WebElement link = driver.findElement(By.xpath("/html/body/header//nav[@class='score-megamenu']//div[@class='collapse navbar-collapse']/div/div[@class='score-center']/ul[@role='menu']/li[1]/ul[@role='menu']//div[@class='second-step']/div/div[1]/ul[@class='level-1 score-section-menu']//a[@href='/financial-services/financial-crime-compliance']"));
	    	Assert.assertTrue("Link is not enabled", link.isEnabled());
    
	    	JavascriptExecutor ex=(JavascriptExecutor)driver; 
	    	ex.executeScript("arguments[0].click()",link);
	    	Assert.assertTrue(driver.getCurrentUrl().equals("https://risk.lexisnexis.co.uk/corporations-and-non-profits/financial-crime-compliance"));
}

	    @Then("the Customer Data Management link should be present and clickable")
	    public void the_customer_data_management_link_should_be_present_and_clickable() {
	    	WebElement link = driver.findElement(By.xpath("/html/body/header//nav[@class='score-megamenu']//div[@class='collapse navbar-collapse']/div/div[@class='score-center']/ul[@role='menu']/li[1]/ul[@role='menu']//div[@class='second-step']/div/div[1]/ul[@class='level-1 score-section-menu']//a[@href='/financial-services/customer-data-management']"));
	    	Assert.assertTrue("Link is not enabled", link.isEnabled());
    
	    	JavascriptExecutor ex=(JavascriptExecutor)driver;
	    	ex.executeScript("arguments[0].click()",link);
	    	Assert.assertTrue(driver.getCurrentUrl().equals("https://risk.lexisnexis.co.uk/corporations-and-non-profits/customer-information-management"));
}

	    @Then("the Collections and Recovery link should be present and clickable")
	    public void the_collections_and_recovery_link_should_be_present_and_clickable() {
	    	WebElement link = driver.findElement(By.xpath("/html/body/header//nav[@class='score-megamenu']//div[@class='collapse navbar-collapse']/div/div[@class='score-center']/ul[@role='menu']/li[1]/ul[@role='menu']//div[@class='second-step']/div/div[1]/ul[@class='level-1 score-section-menu']//a[@href='/financial-services/collections-and-recovery']"));
	    	Assert.assertTrue("Link is not enabled", link.isEnabled());
    
	    	JavascriptExecutor ex=(JavascriptExecutor)driver;
	    	ex.executeScript("arguments[0].click()",link);
	    	Assert.assertTrue(driver.getCurrentUrl().equals("https://risk.lexisnexis.co.uk/corporations-and-non-profits/collections-and-recovery"));
}

	    @Then("the Risk Orchestration link should be present and clickable")
	    public void the_risk_orchestration_link_should_be_present_and_clickable() {
	    	WebElement link = driver.findElement(By.xpath("/html/body/header//nav[@class='score-megamenu']//div[@class='collapse navbar-collapse']/div/div[@class='score-center']/ul[@role='menu']/li[1]/ul[@role='menu']//div[@class='second-step']/div/div[1]/ul[@class='level-1 score-section-menu']//a[@href='/financial-services/risk-orchestration']"));
	    	Assert.assertTrue("Link is not enabled", link.isEnabled());
    
	    	JavascriptExecutor ex=(JavascriptExecutor)driver;
	    	ex.executeScript("arguments[0].click()",link);
	    	Assert.assertTrue(driver.getCurrentUrl().equals("https://risk.lexisnexis.co.uk/corporations-and-non-profits/risk-orchestration"));
}

	    @Then("the Fraud and Identity Management link should be present and clickable")
	    public void the_fraud_and_identity_management_link_should_be_present_and_clickable() {
	    	WebElement link = driver.findElement(By.xpath("/html/body/header//nav[@class='score-megamenu']//div[@class='collapse navbar-collapse']/div/div[@class='score-center']/ul[@role='menu']/li[1]/ul[@role='menu']//div[@class='second-step']/div/div[1]/ul[@class='level-1 score-section-menu']//a[@href='/financial-services/fraud-and-identity-management']"));
	    	Assert.assertTrue("Link is not enabled", link.isEnabled());
    
	    	JavascriptExecutor ex=(JavascriptExecutor)driver;
	    	ex.executeScript("arguments[0].click()",link);
	    	Assert.assertTrue(driver.getCurrentUrl().equals("https://risk.lexisnexis.co.uk/corporations-and-non-profits/fraud-and-identity-management"));
}

	    @Then("the Credit Risk Assessment link should be present and clickable")
	    public void the_credit_risk_assessment_link_should_be_present_and_clickable() {
	    	WebElement link = driver.findElement(By.xpath("/html/body/header//nav[@class='score-megamenu']//div[@class='collapse navbar-collapse']/div/div[@class='score-center']/ul[@role='menu']/li[1]/ul[@role='menu']//div[@class='second-step']/div/div[1]/ul[@class='level-1 score-section-menu']//a[@href='/financial-services/credit-risk-assessment']"));
	    	Assert.assertTrue("Link is not enabled", link.isEnabled());
    
	    	JavascriptExecutor ex=(JavascriptExecutor)driver;
	    	ex.executeScript("arguments[0].click()",link);
	    	Assert.assertTrue(driver.getCurrentUrl().equals("https://risk.lexisnexis.co.uk/corporations-and-non-profits/credit-risk-assessment"));
}

	    @Then("the Investigations and Due Diligence link should be present and clickable")
	    public void the_investigations_and_due_diligence_link_should_be_present_and_clickable() {
	    	WebElement link = driver.findElement(By.xpath("/html/body/header//nav[@class='score-megamenu']//div[@class='collapse navbar-collapse']/div/div[@class='score-center']/ul[@role='menu']/li[1]/ul[@role='menu']//div[@class='second-step']/div/div[1]/ul[@class='level-1 score-section-menu']//a[@href='/financial-services/tracing-and-investigations']"));
	    	Assert.assertTrue("Link is not enabled", link.isEnabled());
    
	    	JavascriptExecutor ex=(JavascriptExecutor)driver;
	    	ex.executeScript("arguments[0].click()",link);
	    	Assert.assertTrue(driver.getCurrentUrl().equals("https://risk.lexisnexis.co.uk/corporations-and-non-profits/investigations-and-due-diligence"));
}
	   
	    @When("I click on the {string} link")
	    public void i_click_on_the_link(String linkText) {
	        WebElement link = driver.findElement(By.linkText(linkText));
	        link.click();
	    }

	    @After
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	    
	}
	    


