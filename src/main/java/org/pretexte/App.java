package org.pretexte;




import java.io.IOException;
import java.util.List;
import java.lang.Thread;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.pretexte.controller.AppController;

/**
 * Hello world!
 *
 */
public class App 
{



    public static void main( String[] args ) throws IOException, InterruptedException {

    AppController squall = new AppController();

    squall.job();


    }

}
