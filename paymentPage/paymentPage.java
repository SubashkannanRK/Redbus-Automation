package paymentPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.baseInfo;

public class paymentPage extends baseInfo{
	
	static By paymentcontainer=By.xpath("//div[@class='payment-container']");
	//PAYMENT PAGE
	public void payment() throws InterruptedException {
	WebElement paymentcontainer1 = driver.findElement(paymentcontainer);
	String paymentpage = driver.getCurrentUrl();
	System.out.println("URL of the payment page="+" "+paymentpage);
	String title=driver.getTitle();
	System.out.println("Title of the page="+" "+title);
	
    sleep(3000);
    if(paymentcontainer1.isDisplayed())      
    {
     System.out.println("Payment page is Opened");
              
    }
    else {
    System.out.println("payment page not opened");
     }
    sleep(2000);
}
	
	//CLOSE BROWSER
	public void closeBrowser() {
		driver.quit();
	}
}