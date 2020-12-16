package org.refer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.test.BaseNew;

public class ChildNew extends BaseNew{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver2 = launchBrowser();
		
		findUrl("http://adactinhotelapp.com/");
		
		maxWindow();
		
		WebElement username1 = driver2.findElement(By.id("username"));
		insertText(username1,readExcel(0, 0));
		
		WebElement password = driver2.findElement(By.id("password"));
		insertText(password,readExcel(0, 1));
		
		WebElement log = driver2.findElement(By.id("login"));
		btnClick(log);
		stopSeconds(5000);
		
		WebElement droploc = driver2.findElement(By.id("location"));
		dropDownText(droploc,readExcel(0, 2));
		
		WebElement hotels = driver2.findElement(By.id("hotels"));
		dropDownText(hotels,readExcel(0, 3));
		
		WebElement roomtype = driver2.findElement(By.id("room_type"));
		dropDownText(roomtype,readExcel(0, 4));
		
		WebElement numroom = driver2.findElement(By.id("room_nos"));
		dropDownText(numroom,readExcel(0, 5));
		
		WebElement fromdate = driver2.findElement(By.id("datepick_in"));
		insertText(fromdate,readExcel(0, 6));
		
		WebElement todate = driver2.findElement(By.id("datepick_out"));
		insertText(todate,readExcel(1, 0));
		
		WebElement perroom = driver2.findElement(By.id("adult_room"));
		dropDownText(perroom,readExcel(1, 1));
		
		WebElement childroom = driver2.findElement(By.id("child_room"));
		dropDownText(childroom,readExcel(1, 2));
		
		WebElement search = driver2.findElement(By.id("Submit"));
		btnClick(search);
		
		WebElement radiobtn = driver2.findElement(By.id("radiobutton_0"));
		btnClick(radiobtn);
		
		WebElement btnok = driver2.findElement(By.id("continue"));
		btnClick(btnok);
		stopSeconds(3000);
		
		WebElement fname = driver2.findElement(By.id("first_name"));
		insertText(fname, readExcel(1, 3));
		
		WebElement lname = driver2.findElement(By.id("last_name"));
		insertText(lname, readExcel(1, 4));
		
		WebElement address = driver2.findElement(By.id("address"));
		insertText(address, readExcel(1, 5));
		
		WebElement card = driver2.findElement(By.id("cc_num"));
		insertText(card, readExcel(1, 6));
		
		WebElement type = driver2.findElement(By.id("cc_type"));
		dropDownText(type,readExcel(2, 0));
		
		WebElement month = driver2.findElement(By.id("cc_exp_month"));
		dropDownText(month,readExcel(2, 1));
		
		WebElement year = driver2.findElement(By.id("cc_exp_year"));
		dropDownText(year,readExcel(2, 2));
		
		WebElement cvv = driver2.findElement(By.id("cc_cvv"));
		insertText(cvv,readExcel(2, 3));
		
		WebElement book = driver2.findElement(By.id("book_now"));
		btnClick(book);
		stopSeconds(5000);
		
		WebElement order2 = driver2.findElement(By.id("order_no"));
		stopSeconds(3000);
		
		String s = order2.getAttribute("value");
		System.out.println("Order No : "+s);
		writeExcel(2, 4, s);
		
		
	

}
}

	