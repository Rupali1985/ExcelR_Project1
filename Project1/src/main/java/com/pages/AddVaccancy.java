package com.pages;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base;

public class AddVaccancy extends Base{
    public void addVaccancy() throws AWTException, InterruptedException {
	
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/input")).sendKeys(prop6.getProperty("vname"));
		
		List <WebElement> items=driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div[2]/div/div/div[1]"));
		for(int i=0;i<items.size();i++)
		{
			if(items.get(i).getText().equals("Software Engineer"))
            {
            	items.get(i).click();
            }

		}
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div[2]/textarea")).sendKeys(prop6.getProperty("desc"));
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div[1]/div/div[2]/div/div/input")).sendKeys(prop6.getProperty("h_manager"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div[2]/div/div/div/div[2]/input")).sendKeys(prop6.getProperty("no_positions"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[7]/button[2]")).click();
		Thread.sleep(3000);
		
}
}
