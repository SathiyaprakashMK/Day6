package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Zoho");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ram");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ram");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Leas");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10,00,000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("5");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("3711");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("AAPL");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Create a lead");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Nothing");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("642");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9988776655");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("34");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Raj");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramraj@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://ramraj.com/");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Ram");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Raj");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("45");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Raj street");
		driver.findElement(By.name("generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600001");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("2");
		//driver.findElement(By.className("smallSubmit")).click();
	}

}
