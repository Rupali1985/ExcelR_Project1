package com.pages;

import org.openqa.selenium.By;

import com.base.Base;

public class ForgetPassword extends Base{
	public void forgetPassword() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[1]/div/div[2]/input")).sendKeys(prop2.getProperty("username"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[2]")).click();
	    Thread.sleep(3000);
		}

}
