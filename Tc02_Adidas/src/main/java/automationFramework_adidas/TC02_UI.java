package main.java.automationFramework_adidas;


import java.util.NoSuchElementException;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TC02_UI {

	static WebDriver browser; 
	public static void main(String[] args) {o
		// TODO Auto-generated method stub


		  
				String choice= null;
				
				Scanner scanner = new Scanner (System.in);
				System.out.print("Enter Here Your Browser Choice Chrome or Firefox  ");  
				choice = scanner.next(); // Get what the user types.

				
				try
				{
				 if(choice.equalsIgnoreCase("chrome"))
				 {
					 System.setProperty("webdriver.chrome.driver", "Path of  chrome driver\\chromedriver.exe");
					 browser = new ChromeDriver();    

		    		 browser.get("https://www.adidas.fi");
					 browser.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div/div[1]/div[1]/a[2]/div"));
					  System.out.println("Home page loaded secessfully ");
				 }
				 else
						if (choice.equalsIgnoreCase("firefox"))
				         { 
							System.setProperty("webdriver.firefox.marionette", "path of geockodriver\\geckodriver.exe");
							browser = new FirefoxDriver();
							browser.get("https://www.adidas.fi");

				    		 
							browser.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div/div[1]/div[1]/a[2]/div"));
							System.out.println("Home page loaded secessfully ");
				         }
				 }catch (NoSuchElementException e) {
					boolean homepagepresent = false;
					 System.out.println("Home page loaded unsecessfully");
					 }        
				
				 
			
				//Adidas logo validation
				
				 boolean present;
				 try {
				    browser.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div/div[1]/div[1]/a[2]/div"));
				    present = true;
				    System.out.println("Logo Present");
				 } catch (NoSuchElementException e) {
				    present = false;
				    System.out.println("Logo not Present");
				 } 
				 
				//Scrolling banner validation
				
				 boolean bannerpresent;
				 try {
				    browser.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div[1]/div/div/div[1]/div[5]/div/div"));
				    bannerpresent = true;
				    System.out.println("Scrolling banner Present");
				 } catch (NoSuchElementException e) {
					 bannerpresent = false;
					 System.out.println("Scrolling banner not Present");
				 }  
				 
				 //Validation for LogIN available or not
				
				 boolean loginpresent;
				 try {
				    browser.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div/div[2]/div[1]/div/div/a[3]"));
				    loginpresent = true;
				    System.out.println("Login Icon Present");
				 } catch (NoSuchElementException e) {
					 loginpresent = false;
					 System.out.println("Login Icon not Present");
				 } 
				 
					     
			        browser.close();
			      
					System.exit(0);
	}

}
