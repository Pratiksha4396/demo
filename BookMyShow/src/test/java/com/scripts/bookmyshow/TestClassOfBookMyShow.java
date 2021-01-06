package com.scripts.bookmyshow;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.generic.BaseClassOfBookMyShow;

import com.generic.WrapperFunctionsOfBookMyShow;

import com.pageFactory.HomePage;

import junit.framework.Assert;

public class TestClassOfBookMyShow extends BaseClassOfBookMyShow {
	HomePage objHomePage = new HomePage (this);
	WrapperFunctionsOfBookMyShow objWrapperFunctionsOfBookMyShow = new WrapperFunctionsOfBookMyShow(this);
	
  @BeforeMethod
  public void initializeEnvironment()
  {
	  this.initializeEnvoirment();
	  
  }
  
  @Test
  
  public void BookTicket() throws IOException
  {
	 
		  objHomePage.clickOnNothanksPopup();
		  objHomePage.selectRandomCity();
		  objHomePage.clickOnMovies();
		  objHomePage.selectLanguageOfMovie();
		  objHomePage.clickOnRandomMovie();
		  objHomePage.getNamesOfCastActors();
		  objHomePage.clickOnBookTicketButton();
		  objHomePage.verifyTitleMovieName();
		  objHomePage.clickOnRandomDate();
		  objHomePage.clickOnRandomTimeOfMovie();
		  objHomePage.selectNoOfSeat();
		  objHomePage.verifyNumOfTicketsAndSelectTheSeat();
		  objHomePage.clickOnPayAmount();
		  objHomePage.clickOnInternetHandlingDropdown();
	
	}
	  
  }
 



