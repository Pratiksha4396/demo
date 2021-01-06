package com.generic;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WrapperFunctionsOfBookMyShow {
	PojoClassOfBookMyShow objPojoClassOfBookMyShow;
	
	public WrapperFunctionsOfBookMyShow(PojoClassOfBookMyShow objPojoClassOfBookMyShow){
		this.objPojoClassOfBookMyShow = objPojoClassOfBookMyShow;
	}
	
	/**
	 * @Description : This is wrapper method wait for ElemenClickable
	 * @param :
	 *            locator - By identification of element
	 */
	public void waitForElemenClickable(By locator)
	{
		WebDriverWait wait = new WebDriverWait(objPojoClassOfBookMyShow.getDriver(), 100);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	/**
	 * @Description : This is wrapper method wait for visibilityOfAllElementsLocated
	 * @param :
	 *            locator - By identification of element
	 */
	public void waitForvisibilityOfAllElementsLocated(By locator)
	{
		WebDriverWait wait = new WebDriverWait(objPojoClassOfBookMyShow.getDriver(),  100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	/**
	 * @Method : setText
	 * @Description : This is wrapper method to set text for input element
	 * @param :
	 *            locator - By identification of element
	 */
	 public void setText(By locator, String text)
	  {
			WebElement element = objPojoClassOfBookMyShow.getDriver().findElement(locator);
			
			this.waitForvisibilityOfAllElementsLocated(locator);
			element.clear();
			element.sendKeys(text);
		}
	
	 /**
		 * @Method : getText
		 * @Description : This is wrapper method to set text for input element
		 * @param :
		 *            locator - By identification of element
		 */
	 public String getText(By locator)
		{
			WebElement element = objPojoClassOfBookMyShow.getDriver().findElement(locator);
			this.waitForvisibilityOfAllElementsLocated(locator);
			String val = element.getAttribute("value");
			System.out.println("Value from Textbox is : "+val);
			return val;
		}
	 /**
		 * @Method : getTextofList
		 * @Description : This is wrapper method to get text of List of webelement
		 * @param :
		 *            locator - By identification of element
		 */
	 public void getTextofList(By locator)
	 {
		 List<WebElement> allText = objPojoClassOfBookMyShow.getDriver().findElements(locator);
		 int Length = allText.size();
	         for (int i=0;i<Length;i++)
	         {
	            System.out.println(allText.get(i).getAttribute("alt"));
	         }
	        
	 }
	 /**
		 * @Method : commonClick
		 * @Description : This is wrapper method to click on the element
		 * @param :
		 *            locator - By identification of element
		 */
	 public void commonClick(By locator)
	   {
		  objPojoClassOfBookMyShow.getDriver().findElement(locator).click();
	   }
	 /**
		 * @Method : commonClick using JavaScript
		 * @Description : This is wrapper method to click on the element using java script
		 * @param :
		 *            locator - By identification of element
		 */
	 public void commonClickUsingJavaScript(By locator)
	   {
		 WebElement element = objPojoClassOfBookMyShow.getDriver().findElement(locator);
		 JavascriptExecutor executor = (JavascriptExecutor)objPojoClassOfBookMyShow.getDriver();
		 executor.executeScript("arguments[0].click();", element);  
		objPojoClassOfBookMyShow.getDriver().findElement(locator).click();
	   }
	 
	 
	 /**
		 * @Method :scrollDown
		 * @Description : This is wrapper method to scrollDown the webPage using java script
		 * @param :
		 *            locator - By identification of element
		 */
	 
	  public void scrollDown()
	   	 {
	   		//scroll down using javascript 
	   		JavascriptExecutor js = (JavascriptExecutor) objPojoClassOfBookMyShow.getDriver();
	   		// This  will scroll down the page by  200 pixel vertical		
	   	    js.executeScript("window.scrollBy(0,500)");
	   	 }
	  
	  /**
		 * @Method :isDisplayed
		 * @Description : This is wrapper method to check the element is displyed or not 
		 * @param :
		 *            locator - By identification of element
		 */ 
	  public void isDisplyed(By locator)
	  {
		  Boolean Display = objPojoClassOfBookMyShow.getDriver().findElement(locator).isDisplayed();
		  System.out.println(Display+"Element is Displayed");
	  }
	  
	  /**
		 * @Method :randomSelect
		 * @Description : This is wrapper method to select any random element in the webpage 
		 * @param :
		 *            locator - By identification of element
		 */ 
	  public void randomSelect(By locator)
	  {
		  List<WebElement> objrandomSelect = objPojoClassOfBookMyShow.getDriver().findElements(locator);
		  Random objrandom=new Random();
		  int size = objrandom.nextInt(objrandomSelect.size());
		  WebElement random = objrandomSelect.get(size);
		  String getSelectedName = random.getText();
	      System.out.println("You Have Selected " +getSelectedName);
		  random.click();
	  }

	  public String randomSelectreturntypeString(By locator)
	  {
		  List<WebElement> objrandomSelect = objPojoClassOfBookMyShow.getDriver().findElements(locator);
		  Random objrandom=new Random();
		  int size = objrandom.nextInt(objrandomSelect.size());
		  WebElement random = objrandomSelect.get(size);
		  String getSelectedName = random.getText();
	      System.out.println("You Have Selected " +getSelectedName);
		  random.click();
		return getSelectedName;
	  }
	  
	//Find prime no
	    public int getPrimeNo(){
	        int a[]={2, 3, 5, 7};
	        Random r=new Random();
	        int num=0;
	        int rNo= r.nextInt(a.length-1);
	        for (int i = 0; i < a.length; i++) {
	            num=a[rNo];
	        }
	        return num;
	    }
	  //Click on element
	    public void clickElement(WebElement element) {
	    	objPojoClassOfBookMyShow.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    WebDriverWait wait = new WebDriverWait(objPojoClassOfBookMyShow.getDriver(), 100);
	    wait.until(ExpectedConditions.elementToBeClickable(element));
	    try{
	    element.click();
	    }catch(Exception e){
	    try{
	    Actions actions = new Actions(objPojoClassOfBookMyShow.getDriver());
	    actions.moveToElement(element).click().build().perform();
	    }catch(Exception e1){
	    JavascriptExecutor js = (JavascriptExecutor) objPojoClassOfBookMyShow.getDriver();
	    // This will scroll down the page by 200 pixel vertical
	    js.executeScript("window.scrollBy(0,600)");
	    clickElement(element);
	    }
	    }
	    }


}
