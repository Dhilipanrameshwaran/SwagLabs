package SeleniumOwnPratice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Swag {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\programfiles\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		TakesScreenshot T1 = (TakesScreenshot) driver;
		File D1 = T1.getScreenshotAs(OutputType.FILE);
		File S1 = new File("F:\\programfiles\\eclipse-workspace\\SeleniumJavaPratice\\screenshot1\\SL1.png");
		FileUtils.copyFile(D1, S1);

		driver.get("https://www.saucedemo.com/");
		TakesScreenshot T2 = (TakesScreenshot) driver;
		File D2 = T2.getScreenshotAs(OutputType.FILE);
		File S2 = new File("F:\\programfiles\\eclipse-workspace\\SeleniumJavaPratice\\screenshot1\\SL2.png");
		FileUtils.copyFile(D2, S2);
		Thread.sleep(2000);

		System.out.println("Step1:The Browser has been launched");
		WebElement idname = driver.findElement(By.xpath("//input[@id='user-name']"));
		idname.sendKeys("standard_user");
		System.out.println("Step2:User Name Has been entered");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("secret_sauce");
		System.out.println("Step3:PassWord Has been entered");
		Thread.sleep(2000);
		TakesScreenshot T3 = (TakesScreenshot) driver;
		File D3 = T3.getScreenshotAs(OutputType.FILE);
		File S3 = new File("F:\\programfiles\\eclipse-workspace\\SeleniumJavaPratice\\screenshot1\\SL3.png");
		FileUtils.copyFile(D3, S3);
		WebElement Login = driver.findElement(By.xpath("//input[@type='submit']"));
		Login.click();
		System.out.println("Step4:Login Has been Clicked");
		Thread.sleep(2000);

		WebElement Cart1 = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		Cart1.click();
		TakesScreenshot T4 = (TakesScreenshot) driver;
		File D4 = T4.getScreenshotAs(OutputType.FILE);
		File S4 = new File("F:\\programfiles\\eclipse-workspace\\SeleniumJavaPratice\\screenshot1\\SL4.png");
		FileUtils.copyFile(D4, S4);
		System.out.println("Step5:Cart Has been Clicked");
		Thread.sleep(2000);

		WebElement Continue_shopping = driver.findElement(By.xpath("//button[@id='continue-shopping']"));
		Continue_shopping.click();
		TakesScreenshot T5 = (TakesScreenshot) driver;
		File D5 = T5.getScreenshotAs(OutputType.FILE);
		File S5 = new File("F:\\programfiles\\eclipse-workspace\\SeleniumJavaPratice\\screenshot1\\SL5.png");
		FileUtils.copyFile(D5, S5);
		System.out.println("Step 6 :The continue shopping page has been clicked");
		Thread.sleep(2000);

		WebElement add2cart1 = driver.findElement(By.xpath("(//button[contains(text(),'Add to cart')])[1]"));
		if (add2cart1.isDisplayed() && add2cart1.isEnabled()) {
			add2cart1.click();
		}
		TakesScreenshot T6 = (TakesScreenshot) driver;
		File D6 = T6.getScreenshotAs(OutputType.FILE);
		File S6 = new File("F:\\programfiles\\eclipse-workspace\\SeleniumJavaPratice\\screenshot1\\SL6.png");
		FileUtils.copyFile(D6, S6);
		System.out.println("Step 7:Product has been added to cart");
		Thread.sleep(2000);

		WebElement Cart2 = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		if (Cart2.isDisplayed() && Cart2.isEnabled()) {
			Cart2.click();
		}

		TakesScreenshot T7 = (TakesScreenshot) driver;
		File D7 = T7.getScreenshotAs(OutputType.FILE);
		File S7 = new File("F:\\programfiles\\eclipse-workspace\\SeleniumJavaPratice\\screenshot1\\SL7.png");
		FileUtils.copyFile(D7, S7);
		Thread.sleep(2000);
		System.out.println("Step 8: cart has been clicked");

		Actions act = new Actions(driver);
		WebElement Cart2Menu = driver.findElement(By.xpath("//button[text()='Open Menu']"));
		act.moveToElement(Cart2Menu).click().perform();
		TakesScreenshot T8 = (TakesScreenshot) driver;
		File D8 = T8.getScreenshotAs(OutputType.FILE);
		File S8 = new File("F:\\programfiles\\eclipse-workspace\\SeleniumJavaPratice\\screenshot1\\SL8.png");
		FileUtils.copyFile(D8, S8);
		Thread.sleep(2000);
		System.out.println("Step 9:After moving to cart clicking the menu icon");

		driver.findElement(By.id("inventory_sidebar_link")).click();

		WebElement addcart2 = driver.findElement(By.xpath("(//button[text()='Add to cart'])[3]"));
		addcart2.click();
		TakesScreenshot T9 = (TakesScreenshot) driver;
		File D9 = T9.getScreenshotAs(OutputType.FILE);
		File S9 = new File("F:\\programfiles\\eclipse-workspace\\SeleniumJavaPratice\\screenshot1\\SL9.png");
		FileUtils.copyFile(D9, S9);
		Thread.sleep(2000);
		System.out.println("Step 10: Adding multiple element to the cart");

		WebElement addcart3 = driver.findElement(By.xpath("(//button[text()='Add to cart'])[4]"));
		addcart3.click();
		Thread.sleep(2000);
		System.out.println("Step 11: Adding multiple element to the cart");

		WebElement addcart4 = driver.findElement(By.xpath("(//button[text()='Add to cart'])[2]"));
		addcart4.click();
		TakesScreenshot T10 = (TakesScreenshot) driver;
		File D10 = T10.getScreenshotAs(OutputType.FILE);
		File S10 = new File("F:\\programfiles\\eclipse-workspace\\SeleniumJavaPratice\\screenshot1\\SL10.png");
		FileUtils.copyFile(D10, S10);
		Thread.sleep(2000);
		System.out.println("Step 12: Adding multiple element to the cart");

		WebElement remove = driver.findElement(By.xpath("(//button[text()='Remove'])[4]"));
		remove.click();
		TakesScreenshot T11 = (TakesScreenshot) driver;
		File D11 = T11.getScreenshotAs(OutputType.FILE);
		File S11 = new File("F:\\programfiles\\eclipse-workspace\\SeleniumJavaPratice\\screenshot1\\SL11.png");
		FileUtils.copyFile(D11, S11);
		Thread.sleep(2000);
		System.out.println("Step 13:Remove element has  been clicked");

		WebElement Cart3 = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		Cart3.click();
		TakesScreenshot T12 = (TakesScreenshot) driver;
		File D12 = T12.getScreenshotAs(OutputType.FILE);
		File S12 = new File("F:\\programfiles\\eclipse-workspace\\SeleniumJavaPratice\\screenshot1\\SL12.png");
		FileUtils.copyFile(D12, S12);
		Thread.sleep(2000);
		System.out.println("Step 14:Returning back to cart");

		WebElement Checkout = driver.findElement(By.xpath("//button[text()='Checkout']"));
		Checkout.click();
		TakesScreenshot T13 = (TakesScreenshot) driver;
		File D13 = T13.getScreenshotAs(OutputType.FILE);
		File S13 = new File("F:\\programfiles\\eclipse-workspace\\SeleniumJavaPratice\\screenshot1\\SL13.png");
		FileUtils.copyFile(D13, S13);
		Thread.sleep(2000);
		System.out.println("Step 15:Clicking the checkout page in cart");

		WebElement cancel = driver.findElement(By.name("cancel"));
		cancel.click();
		TakesScreenshot T14 = (TakesScreenshot) driver;
		File D14 = T14.getScreenshotAs(OutputType.FILE);
		File S14 = new File("F:\\programfiles\\eclipse-workspace\\SeleniumJavaPratice\\screenshot1\\SL14.png");
		FileUtils.copyFile(D14, S14);
		System.out.println("Step 16:Clicking the cancel icon from checkout");

		WebElement Menu2 = driver.findElement(By.xpath("//button[text()='Open Menu']"));
		act.moveToElement(Menu2).click().perform();
		Thread.sleep(2000);
		System.out.println("Step 16:Menu icon has been clicked");

		WebElement Restapp = driver.findElement(By.xpath("//a[text()='Reset App State']"));
		Restapp.click();
		TakesScreenshot T15 = (TakesScreenshot) driver;
		File D15 = T15.getScreenshotAs(OutputType.FILE);
		File S15 = new File("F:\\programfiles\\eclipse-workspace\\SeleniumJavaPratice\\screenshot1\\SL15.png");
		FileUtils.copyFile(D15, S15);
		Thread.sleep(2000);
		System.out.println("Step 17:The App has beeN Reset");

		WebElement Menu3 = driver.findElement(By.xpath("//button[text()='Open Menu']"));
		act.moveToElement(Menu3).click().perform();
		Thread.sleep(2000);
		System.out.println("Step 18:Menu page has been clicked");

		WebElement About = driver.findElement(By.xpath("//a[text()='About']"));
		act.moveToElement(About).click().perform();
		TakesScreenshot T16 = (TakesScreenshot) driver;
		File D16 = T16.getScreenshotAs(OutputType.FILE);
		File S16 = new File("F:\\programfiles\\eclipse-workspace\\SeleniumJavaPratice\\screenshot1\\SL16.png");
		FileUtils.copyFile(D16, S16);
		Thread.sleep(2000);
		System.out.println("Step 19:About us page has been clicked");
		driver.navigate().back();
		Thread.sleep(2000);

		WebElement Menu4 = driver.findElement(By.xpath("//button[text()='Open Menu']"));
		act.moveToElement(Menu4).click().perform();
		Thread.sleep(2000);
		System.out.println("Step 20:Menu page has been clicked");

		WebElement Logout = driver.findElement(By.id("logout_sidebar_link"));
		Logout.click();
		TakesScreenshot T17 = (TakesScreenshot) driver;
		File D17 = T17.getScreenshotAs(OutputType.FILE);
		File S17 = new File("F:\\programfiles\\eclipse-workspace\\SeleniumJavaPratice\\screenshot1\\SL17.png");
		FileUtils.copyFile(D17, S17);
		Thread.sleep(2000);
		System.out.println("Step 20:User has logged out");

	}

}
