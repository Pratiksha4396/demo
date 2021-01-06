package com.pageFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.generic.PojoClassOfBookMyShow;


public class HomePage {
	//Reference Variable of pojo class
	PojoClassOfBookMyShow objPojoClassOfBookMyShow;
	
	//Locators
	By btnNothanksPopup = By.xpath("//div[@class='wzrk-button-container']//child::button[@class='No thanks']");
	By cityName = By.xpath("//ul[@class='sc-iybRtq fYDbAn']//child::li"); 
	By lnkMovies = By.xpath("//div[@class='sc-jWBwVP irFRpA']//child::a[contains(text(),'Movies')]");
	By clkLanguages = By.xpath("//div[@class='commonStyles__VerticalFlexBox-sc-1k17atf-2 style__FilterHeaderTitle-uh5pb7-8 dprgMW']");
	By clkFormat = By.xpath("//div[text()='Format']");
	By fltLanguage = By.xpath("//div[@class='commonStyles__VerticalFlexBox-sc-1k17atf-2 style__FilterBody-uh5pb7-11 hetbjZ']/div");
	By clkMovie = By.xpath("//div[@class='style__StyledText-tgsgks-0 gbzvvd']");
	By castActorName = By.xpath("//h4[text()='Cast']//ancestor::section//descendant::img");
	By btnBookTicket = By.xpath("//div[@class='styles__CtaWrapper-sc-16qvuq-8 goFMPV']//child::button");
	By popup = By.xpath("//div[@class='styles__BottomSheetContainer-xr4gt6-0 gSpSqW']");
	By clkOption3D = By.xpath("//div[@class='styles__BottomSheetContainer-xr4gt6-0 gSpSqW']//following::section[@class='styles__DimensionWrapper-sc-1efo077-2 kquseX']/child::div");
	By clkDate = By.xpath("//div[@class='date-numeric']");
	By verifyMovie = By.xpath("//div[@class='cinema-name-wrapper']/a");
	By clkTime = By.xpath("//a[@class='showtime-pill']");
	By btnAccept = By.xpath("//a[@id='btnPopupAccept']");
	By clkSeat = By.xpath("//ul[@id='popQty']/child::li");
	By btnPopUpOk = By.xpath("//a[@id='btnPopupOK']");
	By btnSelectSeat = By.xpath("//div[@id='proceed-Qty']");
	By verifyNoOfTickets = By.xpath("//div[@class='no-of-tickets']/child::span[@id='intQty']");
	By clkAvaiableSeat = By.xpath("//a[@class='_available']");
	By btnPayAmount = By.xpath("//div[@class='__seat-action']/child::a[@id='btmcntbook']");
	By drpGSTCaculation = By.xpath("//div[@class='order-summary']//following::ul[@class='__details']//following::span[@class='__up-icon up-icon-tax'][2]");
	By calculateGSTAmount = By.xpath("//div[@id='intHandlingFeeBreakdown']");
	By totalAmount = By.xpath("//span[@id='subTT']");
	By rbMTicket = By.xpath("//label[@for='mticket']");
	By btnProceed = By.xpath("//a[@id='prePay']");
	
	//HomePage Class Constructor  
	public HomePage(PojoClassOfBookMyShow objPojoClassOfBookMyShow)
	{
		this.objPojoClassOfBookMyShow = objPojoClassOfBookMyShow;
	}
	/*
	 * @Discription:- This method is Handel GetPersonlize popup
	 */
	public void clickOnNothanksPopup()
	{
		objPojoClassOfBookMyShow.getWrapper().commonClick(btnNothanksPopup);
	}
	/*
	 * @Discription:- This method is for Selecting the Any Random city
	 */
	public void selectRandomCity()
	{
		 String selCity = objPojoClassOfBookMyShow.getWrapper().randomSelectreturntypeString(cityName);       
	     System.out.println("Select City is : "+selCity);
		
		 if (selCity.equalsIgnoreCase("Kochi")) {
			 objPojoClassOfBookMyShow.getDriver().findElement(By.xpath("//span[contains(text(),'Kochi')]")).click();
			 objPojoClassOfBookMyShow.getWrapper().waitForElemenClickable(cityName);
	            String selCity1 = objPojoClassOfBookMyShow.getWrapper().randomSelectreturntypeString(cityName);
	            System.out.println("Select city:"+selCity1 );
	        }
		 

	}
	public void clickOnMovies()
	{
		objPojoClassOfBookMyShow.getWrapper().commonClick(lnkMovies);
	}
	public void selectLanguageOfMovie()
	{
		objPojoClassOfBookMyShow.getWrapper().scrollDown();
		objPojoClassOfBookMyShow.getWrapper().randomSelect(fltLanguage);
	}
	
	public void clickOnRandomMovie()
	{
		objPojoClassOfBookMyShow.getWrapper().waitForvisibilityOfAllElementsLocated(clkMovie);
		objPojoClassOfBookMyShow.getWrapper().randomSelect(clkMovie);
	}
	
	public void getNamesOfCastActors() throws IOException
	{
		objPojoClassOfBookMyShow.getWrapper().scrollDown();
		
		List<WebElement> allText = objPojoClassOfBookMyShow.getDriver().findElements(castActorName);
		 int Length = allText.size();
		 System.out.println("*********Cast Names are As below :******");
	         for (int i=0;i<Length;i++)
	         {
	            System.out.println(allText.get(i).getAttribute("alt"));
	            String data = allText.get(i).getAttribute("alt");
	            FileWriter fw =new FileWriter("./target/file/data2.txt",true);   
	            fw.write(data+"\n");
	            fw.close();
	           }
	       System.out.println("*******************************");  
	   }
	public void clickOnBookTicketButton()
	{
		objPojoClassOfBookMyShow.getWrapper().commonClick(btnBookTicket); 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try{
	    boolean flag = objPojoClassOfBookMyShow.getDriver().findElement(popup).isDisplayed();
	    System.out.println("Popup status : "+flag);
	    if (flag==true) {
	    	System.out.println("Entering in if  loop");
	    	objPojoClassOfBookMyShow.getWrapper().randomSelect(clkOption3D);
	    	objPojoClassOfBookMyShow.getWrapper().randomSelect(clkDate);
	    	System.out.println("Date is selected in if");
		}
		else
		{
			System.out.println("Entering in else loop");
			objPojoClassOfBookMyShow.getWrapper().randomSelect(clkDate);
			System.out.println("Date is selected in else");
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void verifyTitleMovieName()
	{
		String Expected = objPojoClassOfBookMyShow.getDriver().findElement(verifyMovie).getText();
		String Actual = objPojoClassOfBookMyShow.getDriver().findElement(verifyMovie).getText();
		Assert.assertEquals(Actual, Expected);
		System.out.println("Movie Name is = " +Actual);
		System.out.println("Movie name Assert is  Pass");
	}
	
	public void clickOnRandomDate()
	{
		objPojoClassOfBookMyShow.getWrapper().randomSelect(clkDate);
	}
	public void clickOnRandomTimeOfMovie()
	{
		//objPojoClassOfBookMyShow.getWrapper().waitForvisibilityOfAllElementsLocated(clkTime);
		objPojoClassOfBookMyShow.getWrapper().randomSelect(clkTime);
		boolean flag1 = objPojoClassOfBookMyShow.getDriver().findElement(btnPopUpOk).isDisplayed();
		System.out.println("Flag set to " +flag1);
		if(flag1==true)
		{
			objPojoClassOfBookMyShow.getWrapper().commonClick(btnPopUpOk);
		}
		else
		{
			objPojoClassOfBookMyShow.getWrapper().commonClick(btnAccept);
		}
		
}
	
	public void selectNoOfSeat()
	{
//		objPojoClassOfBookMyShow.getWrapper().randomSelect(clkSeat);
//		objPojoClassOfBookMyShow.getWrapper().commonClick(btnSelectSeat);
		//objPojo_BookMyShow.getWrapper().waitForvisibilityOfAllElementsLocated(seat);
        int pNo=objPojoClassOfBookMyShow.getWrapper().getPrimeNo();
        WebElement element = objPojoClassOfBookMyShow.getDriver().findElement(By.xpath("//li[@id='pop_"+pNo+"']"));
        objPojoClassOfBookMyShow.getWrapper().clickElement(element);
        String seatNo = element.getText();       
        System.out.println("Select seat count: "+seatNo);
        objPojoClassOfBookMyShow.getWrapper().commonClick(btnSelectSeat);
        System.out.println("Click on Select seats");
//         String s = objPojoClassOfBookMyShow.getDriver().findElement(getNumberSeat).getText();
//         int num = Integer.parseInt(s);
//         for(int i=0;i<=num-1;i++)
//         {         
//             objPojo_BookMyShow.getDriver().findElement(SeatNumberSelect).click();
//             boolean flag = objPojo_BookMyShow.getDriver().findElement(btnPayRs).isDisplayed();
//             if (flag==true)
//             {       
//                 objPojo_BookMyShow.getWrapper().clickLocator(btnPayRs);
//                 String payRS = objPojo_BookMyShow.getDriver().findElement(btnPayRs).getText();
//                 System.out.println("Total amount: "+payRS);
//                 System.out.println("flag:"+flag);
//             }
//            
//         }
		
		
	}
	
	
	public void verifyNumOfTicketsAndSelectTheSeat()
	{
		String numberofTicket = objPojoClassOfBookMyShow.getDriver().findElement(verifyNoOfTickets).getText();
		System.out.println("You Have Selected " +numberofTicket+" Tickets");
		int size = Integer.parseInt(numberofTicket);
		System.out.println("size is " +size);
		try {
			for(int i =1;i<=size;i++)
			{
				objPojoClassOfBookMyShow.getWrapper().waitForElemenClickable(clkAvaiableSeat);
				multipleTimesClick();
				objPojoClassOfBookMyShow.getWrapper().commonClick(btnPayAmount);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void multipleTimesClick(){
		boolean flag = objPojoClassOfBookMyShow.getDriver().findElement(btnPayAmount).isDisplayed();
		while(flag==false){
			By locator = By.xpath("//a[@class='_available']");
			objPojoClassOfBookMyShow.getWrapper().commonClick(locator);
			boolean flag2 = objPojoClassOfBookMyShow.getDriver().findElement(btnPayAmount).isDisplayed();
			flag=flag2;
		}
	}
	public void clickOnPayAmount()
	{
		objPojoClassOfBookMyShow.getWrapper().commonClick(btnPayAmount);
	}
	
	public void clickOnInternetHandlingDropdown()
	{
		objPojoClassOfBookMyShow.getWrapper().waitForElemenClickable(drpGSTCaculation);
		objPojoClassOfBookMyShow.getWrapper().commonClickUsingJavaScript(drpGSTCaculation);
		String calculate = objPojoClassOfBookMyShow.getDriver().findElement(calculateGSTAmount).getText();
		System.out.println("GST Calculation is "+calculate);
		String subtotalAmount=objPojoClassOfBookMyShow.getDriver().findElement(totalAmount).getText();
		System.out.println("Total Amount Including All Taxes is " +subtotalAmount);
		objPojoClassOfBookMyShow.getWrapper().scrollDown();
		boolean flag = objPojoClassOfBookMyShow.getDriver().findElement(rbMTicket).isDisplayed();
		
		if(flag==true)
		{
			objPojoClassOfBookMyShow.getWrapper().waitForElemenClickable(rbMTicket);
			objPojoClassOfBookMyShow.getWrapper().commonClick(rbMTicket);
			objPojoClassOfBookMyShow.getWrapper().commonClick(btnProceed);
		}
		else
		{
			
			objPojoClassOfBookMyShow.getWrapper().commonClick(btnProceed);
		}
		
		
	}
	
	

	
	
	
	
	
	
	
	

}
