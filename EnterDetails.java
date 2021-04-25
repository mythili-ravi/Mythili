package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnterDetails {

	private static String Automobile;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver =new ChromeDriver();
driver.get("http://leaftaps.com/opentaps");
driver.manage().window().maximize();
// Create userName
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//Create password
driver.findElement(By.id("password")).sendKeys("crmsfa");
//login
driver.findElement(By.className("decorativeSubmit")).click();
//Get the name of header and print the valuue
String text =driver.findElement(By.tagName("h2")).getText();
System.out.println(text);
//click the link
driver.findElement(By.linkText("CRM/SFA")).click();
//create Account
driver.findElement(By.linkText("My Home")).click();
driver.findElement(By.linkText("Create Lead")).click();
//Enter COmpany Name
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Exela");
//Enter First Name& Last Name
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mythili");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");
// Create Source Id
WebElement eleDropdown2=driver.findElement(By.id("createLeadForm_dataSourceId"));
Select dd2 = new Select(eleDropdown2);
dd2.selectByVisibleText("Self Generated");
//Create Source Id
WebElement eleDropdown3=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select dd3=new Select(eleDropdown3);
dd3.selectByVisibleText("Automobile");
driver.findElementById("createLeadForm_personalTitle").sendKeys("I am present");
driver.findElementById("createLeadForm_generalProfTitle").sendKeys("This is my first code");
driver.findElementById("createLeadForm_birthDate").sendKeys("03/30/1994");
driver.findElementById("createLeadForm_departmentName").sendKeys("Testing");
driver.findElementById("createLeadForm_annualRevenue").sendKeys("300000");
driver.findElementById("createLeadForm_numberEmployees").sendKeys("300");
WebElement eleDropdown4 =driver.findElementById("createLeadForm_currencyUomId");
Select dd4 =new Select (eleDropdown4);
dd4.selectByVisibleText("ZRZ - Zaire");
WebElement eleDropdown5 =driver.findElementById("createLeadForm_industryEnumId");
Select dd5 =new Select (eleDropdown5);
dd5.selectByVisibleText("Finance");
WebElement eleDropdown6 =driver.findElementById("createLeadForm_ownershipEnumId");
Select dd6 =new Select (eleDropdown6);
dd6.selectByVisibleText("LLC/LLP");
driver.findElementById("createLeadForm_sicCode").sendKeys("456789");
driver.findElementById("createLeadForm_tickerSymbol").sendKeys("Alpha");
driver.findElementById("createLeadForm_description").sendKeys(" New Beginer");
driver.findElementById("createLeadForm_importantNote").sendKeys("Learn Quickly");
driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("10");
driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("915974123456");
driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("636905");
driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("For verfication");
driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("1234587");
driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("https://test");
driver.findElementById("createLeadForm_primaryEmail").sendKeys("mythilisujir@gmail.com");
driver.findElementById("createLeadForm_generalToName").sendKeys("Priya");
driver.findElementById("createLeadForm_generalAttnName").sendKeys("rani");
driver.findElementById("createLeadForm_generalAddress1").sendKeys("baby Nagar");
driver.findElementById("createLeadForm_generalAddress2").sendKeys("Velachery");
driver.findElementById("createLeadForm_generalCity").sendKeys("chennai");
WebElement eleDropdown7 =driver.findElementById("createLeadForm_generalStateProvinceGeoId");
Select dd7 =new Select (eleDropdown7);
dd7.selectByVisibleText("Indiana");
WebElement eleDropdown8 =driver.findElementById("createLeadForm_generalCountryGeoId");
Select dd8 =new Select (eleDropdown8);
dd8.selectByVisibleText("India");
driver.findElementById("createLeadForm_generalPostalCode").sendKeys("97845");
driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("61230");
driver.findElementByClassName("smallSubmit").click();

driver.findElement(By.linkText("Duplicate Lead")).click();
driver.findElement(By.className("inputBox")).clear();
driver.findElement(By.className("inputBox")).sendKeys("ZOHO");
driver.findElement(By.className("smallSubmit")).click();

String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
System.out.println(text2);








 
 
 
 
 

	}

}
