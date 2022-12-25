package com.pages;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import com.base.Base;

public class AddEmp extends Base{
        public void addEmp() throws AWTException, InterruptedException {
		
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")).sendKeys(prop2.getProperty("firstname"));
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input")).sendKeys(prop2.getProperty("middlename"));
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")).sendKeys(prop2.getProperty("lastname"));
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys(prop2.getProperty("id"));
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button/i")).click();
	
    Robot rb = new Robot();
	
	StringSelection path = new StringSelection(prop2.getProperty("image"));
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
	
	rb.setAutoDelay(3000);
	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	
	
	rb.setAutoDelay(5000);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	
	rb.setAutoDelay(5000);
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")).click();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys(prop2.getProperty("username"));
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys(prop2.getProperty("password"));
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys(prop2.getProperty("cpassword"));
	Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	Thread.sleep(5000);

}

}
