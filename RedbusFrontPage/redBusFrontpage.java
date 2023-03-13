package RedbusFrontPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.baseInfo;

public class redBusFrontpage extends baseInfo{
		
	
		//XPATH FOR RED BUS FRONT PAGE
		static By from1=By.id("src");
		static By to1=By.id("dest");
		static By datefield1=By.id("onward_cal");
		static By search1=By.id("search_btn");
		//static By date4 = By.xpath("//div[@id='rb-calendar_onward_cal']/table[@class='rb-monthTable first last']/tbody/tr[7]/td[2]");
		
		
		//CHECK FRONTPAGE UI
		public void frontPageUI() throws InterruptedException{  
			WebElement from = driver.findElement(from1);
			WebElement to= driver.findElement(to1);
			WebElement datefield= driver.findElement(datefield1);
			//from input field
	        if(from.isEnabled())
			  {
			   System.out.print("\nText box From Field is enabled.");
			  }
			  else
			  {
			   System.out.print("\nText box From Field is disabled.");
			  }
	         
	        
	        // To input field	       
	        if(to.isEnabled())
			  {
			   System.out.print("\nText box To Field is enabled.");
			  }
			  else
			  {
			   System.out.print("\nText box To Field is disabled.");
			  }
	        // Date input field	       
	        if(datefield.isEnabled())
			  {
			   System.out.print("\nDate box  Field is enabled.");
			  }
			  else
			  {
			   System.out.print("\nDate box  Field is disabled.");
			  }

	          
	}
		
		
		//FROM INPUT DETAILS
		public void fromInput() throws InterruptedException {
			WebElement from = driver.findElement(from1);
			from.sendKeys(prop.getProperty("Arrival"));
	        sleep(1000); 
	        from.sendKeys(Keys.ENTER);
			
		}
		
		//TO INPUT DETAILS
		public void toInput() throws InterruptedException {
			WebElement to= driver.findElement(to1);
			to.sendKeys(prop.getProperty("Depature"));
		    sleep(1000);
		    to.sendKeys(Keys.ENTER);
		}
		
		//DATE INPUT DETAILS
		public void dateInput() throws InterruptedException {
			WebElement datefield=driver.findElement(datefield1);
			//WebElement date=driver.findElement(date4);
			datefield.click();
			sleep(1000);
			WebElement date=driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table[@class='rb-monthTable first last']/tbody/tr[6]/td[1]"));
			date.click();
		}
		
		//SEARCH BUTTON
		public void search() {
			WebElement search=driver.findElement(search1);
			search.click(); 
		}
		
}
