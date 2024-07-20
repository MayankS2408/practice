package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sorting {

	public static void main(String args[]) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");

		List<WebElement> list = driver.findElements(By.xpath("//a[@class='nav-a  ']"));
		for (WebElement link : list) {

			System.out.println(link.getText()); // Printing the
		}

		List<String> Sort = list.stream().map(item -> item.getText()).sorted().collect(Collectors.toList());
		System.out.println(Sort);
		if (Sort.equals(list)) {
			System.out.println("This is incorrect");
		} else {
			System.out.println("This is correct");
		}
	}
} 
