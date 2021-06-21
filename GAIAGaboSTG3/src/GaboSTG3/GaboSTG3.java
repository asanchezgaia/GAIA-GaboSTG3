package GaboSTG3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.support.ui.*;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.openqa.selenium.Keys;
import java.net.MalformedURLException;
import org.testng.annotations.AfterMethod;
import org.apache.log4j.Logger;




public class GaboSTG3 {
	  
	  public WebDriver driver;
	  public WebDriverWait wait;
	  Logger log = Logger.getLogger(GaboSTG3.class.getName());
	  private static int contador = 0;
	  
	  private static void incrementarContador() {
	        contador++;
	        
	    }
	  
	  
	  By btnIniciaGoogle	= By.xpath("/html/body/div[1]/div/div[2]/div/a");
	  By cuentaGoogle 		= By.id("identifierId");
	  By password 			= By.xpath("//*[@id='password']/div[1]/div/div[1]/input");
	  By ecommerce			= By.xpath("/html/body/div[1]/aside/div[1]/section/ul/li[2]/a/span[1]");
	  By ordenventa			= By.xpath("/html/body/div[1]/aside/div[1]/section/ul/li[2]/ul/li[1]/a/i");
	  By oventa				= By.xpath("/html/body/div[1]/div/section[2]/div[2]/div[1]/form/div/div[1]/table/tbody/tr[4]/td[1]/div");
	  
	  @Test
	  
	  public void Login() throws Exception {
		  
		  	String url = "http://stg3.gabo.gaia.design/app_dev.php/admin/";
		  	ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			ChromeDriver driver = new ChromeDriver(options);
			driver.get(url);
			wait = new WebDriverWait(driver, 7);
		  

		  	Thread.sleep(2000); 
			incrementarContador();
			log.debug("Iniciando Test Login ");
			wait.until(ExpectedConditions.visibilityOfElementLocated(btnIniciaGoogle)).click();
			File scrFile  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("d:\\GAIA\\Automatizacion\\GaboSTG3\\login" + contador + ".png"));
			wait.until(ExpectedConditions.visibilityOfElementLocated(cuentaGoogle)).sendKeys("angel.sanchez@gaiadesign.com.mx");
			incrementarContador();
			File scrFile1  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile1, new File("d:\\GAIA\\Automatizacion\\GaboSTG3\\login" + contador + ".png"));
			wait.until(ExpectedConditions.visibilityOfElementLocated(cuentaGoogle)).sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("doki1010");
			incrementarContador();
			File scrFile2  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile2, new File("d:\\GAIA\\Automatizacion\\GaboSTG3\\login" + contador + ".png"));
			wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(Keys.ENTER);
			incrementarContador();
			Thread.sleep(2000); 
			File scrFile3  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile3, new File("d:\\GAIA\\Automatizacion\\GaboSTG3\\login" + contador + ".png"));
			log.debug("Test Terminado Satisfactoriamente");
		    String expectedTitle = "Administrador Panel principal";
		    String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			
			driver.quit();
		  
	  }@Test
	  
	  public void ordenVenta() throws Exception {
		  
		  	String url = "http://stg3.gabo.gaia.design/app_dev.php/admin/";
		  	ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			ChromeDriver driver = new ChromeDriver(options);
			driver.get(url);
			wait = new WebDriverWait(driver, 7);
		  

			Thread.sleep(2000); 
			incrementarContador();
			log.debug("Iniciando Test ordenVenta ");
			wait.until(ExpectedConditions.visibilityOfElementLocated(btnIniciaGoogle)).click();
			File scrFile  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("d:\\GAIA\\Automatizacion\\GaboSTG3\\ordenVenta" + contador + ".png"));
			wait.until(ExpectedConditions.visibilityOfElementLocated(cuentaGoogle)).sendKeys("angel.sanchez@gaiadesign.com.mx");
			incrementarContador();
			File scrFile1  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile1, new File("d:\\GAIA\\Automatizacion\\GaboSTG3\\ordenVenta" + contador + ".png"));
			wait.until(ExpectedConditions.visibilityOfElementLocated(cuentaGoogle)).sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("doki1010");
			incrementarContador();
			File scrFile2  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile2, new File("d:\\GAIA\\Automatizacion\\GaboSTG3\\ordenVenta" + contador + ".png"));
			wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(Keys.ENTER);
			incrementarContador();
			Thread.sleep(2000); 
			File scrFile3  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile3, new File("d:\\GAIA\\Automatizacion\\GaboSTG3\\ordenVenta" + contador + ".png"));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ecommerce)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(ordenventa)).click();
			incrementarContador();
			File scrFile4  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile4, new File("d:\\GAIA\\Automatizacion\\GaboSTG3\\ordenVenta" + contador + ".png"));
			wait.until(ExpectedConditions.visibilityOfElementLocated(oventa)).click();
			String expectedTitle = "Administrador - Listado de Ordenes de venta";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			log.debug("Test Terminado Satisfactoriamente");
			
			
			//driver.quit();
		  
	  }
  

  @BeforeMethod
  public void beforeMethod() throws Exception  {

    log.debug("Iniciando Automatizacion");
    


  }

  @AfterMethod
  public void afterMethod() {
    System.out.println("Closing the browser session");
    
    
  }
}





