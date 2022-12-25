package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base;

public class AddRecruitment extends Base{
public void addRecruitment() throws AWTException, InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input")).sendKeys(prop5.getProperty("firstname"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[2]/div[2]/input")).sendKeys(prop5.getProperty("middlename"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[3]/div[2]/input")).sendKeys(prop5.getProperty("lastname"));
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[1]")).click();
		List <WebElement> items=driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div[2]/div"));
		for(int i=0;i<items.size();i++)
		{
			if(items.get(i).getText().equals("Software Engineer"))
            {
            	items.get(i).click();
            }

		}
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")).sendKeys(prop5.getProperty("email"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")).sendKeys(prop5.getProperty("mob"));
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/div/div[1]")).click();
		Robot rb=new Robot();
		
		StringSelection path = new StringSelection(prop5.getProperty("document"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		
		rb.setAutoDelay(5000);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		
		rb.setAutoDelay(7000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.setAutoDelay(7000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[1]/div/div[2]/input")).sendKeys(prop5.getProperty("keywords"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[6]/div/div/div/div[2]/textarea")).sendKeys(prop5.getProperty("notes"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[7]/div/div/div/div[2]/div/label/span/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]")).click();
		Thread.sleep(3000);
     }
}
