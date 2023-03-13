package personalDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import Base.baseInfo;

public class personalDetails extends baseInfo{
	
	//XPATH FOR PERSONAL DETAILS PAGE
	static By name1=By.xpath("//input[@name='Name_0']");
	static By gender1=By.id("div_22_0");
	static By age1=By.xpath("//input[@name='Age_0']");
	static By email1=By.id("seatno-05");
	static By phone1=By.id("seatno-06");
	static By insurance1=By.id("insuranceNotOpted_rap");
	static By pay1=By.xpath("//input[@value='Proceed to pay']");
	
	//NAME DETAILS
	public void name() throws InterruptedException {
		WebElement name=driver.findElement(name1);
		name.sendKeys(prop.getProperty("Name"));
		sleep(1000);
	}
	
	//GENDER DETAILS
	public void gender() throws InterruptedException {
		WebElement gender=driver.findElement(gender1);
		gender.click();
		sleep(1000);
	}
	
	//AGE DETAILS
	public void age() throws InterruptedException {
		WebElement age=driver.findElement(age1);
		age.sendKeys(prop.getProperty("Age"));;
		sleep(1000);
	}
	
	//EMAIL DETAILS
	public void email() throws InterruptedException {
		WebElement email=driver.findElement(email1);
		email.sendKeys(prop.getProperty("Email"));;
		sleep(1000);
	}
	
	//PHONE NUMBER DETAILS
	public void phone() throws InterruptedException {
		WebElement phone=driver.findElement(phone1);
		phone.sendKeys(prop.getProperty("Phone"));;
		sleep(1000);
	}
	
	//INSURANCE DETAILS
	public void insurance() throws InterruptedException {
		WebElement insurance=driver.findElement(insurance1);
		insurance.click();
		sleep(1000);
	}
	
	//PROCEED TO PAY
	public void pay() throws InterruptedException {
		WebElement pay=driver.findElement(pay1);
		pay.click();
		sleep(1000);
	}

}
