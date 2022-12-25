package com.pages;

import org.openqa.selenium.By;

import com.base.Base;

public class LoginPage extends Base{
	public void login(String uname,String pwd) throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
	}
	
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		Thread.sleep(3000);
	}
	
	
}
