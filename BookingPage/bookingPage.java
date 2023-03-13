package BookingPage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.baseInfo;

public class bookingPage extends baseInfo {
	
	//XPATH FOR BOOKING PAGE
	static By popUp1=By.xpath("//i[@class='icon icon-close']");
	static By viewseat1=By.xpath("//*[@id=\"9209701\"]/div/div[2]/div[1]");
	//static By fullpopup1=By.xpath("//body[1]/section[1]/div[2]/div[3]/div[1]/div[3]");
	static By boardingpoint1=By.xpath("//*[@id=\"9209701\"]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/ul/li[1]/div/div[1]");
	static By continue1=By.xpath("//button[@class='button continue inactive text-trans-uc w-h-cont']");
	static By proceed1=By.xpath("//button[@class='button continue inactive']");
	
	
	//SCROLL AND SELECT VIEW SEATS
	public void scrollbus() throws InterruptedException {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/section[1]/div[2]/div[3]/div[1]/div[3]"))); //wait for pop up visible
			WebElement popUp=driver.findElement(popUp1);
			popUp.click();
			
		}
		catch(Exception e) {
			System.out.println("\nAd not shown"+"\n"+e);
		}
		sleep(3000);
		scroll2();
		implicitWait(5);
		WebElement viewseat=driver.findElement(viewseat1);
		viewseat.click();	
	}
	
	
	//SELECTING SEAT
	public void selectSeat() throws InterruptedException {
			scroll1();
			sleep(5000);
			System.out.println("\nSelecting Vaccancy seat!");
			WebElement canvas = driver.findElement(By.xpath("//canvas[@data-type='lower']"));
	        Actions actions = new Actions(driver);
	        int flag = 0;
	        for (int i = 30; i < 75 && flag != 1; i = i + 2) {
	            for (int j = 30; j < 75 && flag != 1; j = j + 2) {
	                actions.moveToElement(canvas, i, j).click().build().perform();
	                if (!(canvas.getAttribute("class").equals(""))) {
	                    flag = 1;
	                }
	            }
	        }
	    	System.out.println("\nSeat Booked!");
  
		scroll2();
	}
	
	//CHOOSING BOARDING POINT
	public void boardingPoint() throws InterruptedException {
		WebElement boardingpoint=driver.findElement(boardingpoint1);
		boardingpoint.click();
		sleep(2000);
	}
	
	//CLICK CONTINUE BUTTON
	public void next() throws InterruptedException {
		WebElement continue2=driver.findElement(continue1);
		continue2.click();
		sleep(2000);
	}
	
	//CLICK PROCEED BUTTON
	public void proceed() throws InterruptedException {
		WebElement proceed=driver.findElement(proceed1);
		proceed.click();
		sleep(2);
	}
}


