package main;

import Base.baseInfo;
import BookingPage.bookingPage;
import RedbusFrontPage.redBusFrontpage;
import paymentPage.paymentPage;
import personalDetails.personalDetails;

public class main extends baseInfo {
	 public static void main(String[] args) throws InterruptedException {
		 redBusFrontpage rf=new redBusFrontpage();
		 bookingPage bp=new bookingPage();
		 personalDetails pd=new personalDetails();
		 paymentPage pp=new paymentPage();
		 
		 rf.invokeBrowser();
		 rf.openURL();
		 rf.frontPageUI();
		 rf.fromInput();
		 rf.toInput();
		 rf.dateInput();
		 rf.search();
		 
		 bp.scrollbus();
		 bp.selectSeat();
		 bp.boardingPoint();
		 bp.next();
		 bp.proceed();
		 
		 pd.name();
		 pd.gender();
		 pd.age();
		 pd.email();
		 pd.phone();
		 pd.insurance();
		 pd.pay();
		 
		 pp.payment();
		 pp.closeBrowser();
		 
		 
	 }

}
	 
