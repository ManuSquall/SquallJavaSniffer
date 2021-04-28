package org.pretexte.repository;


import org.pretexte.entities.Pretexte;
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

public class PretexteRepository implements IPretexteRepository{

    @Override
    public Pretexte getPretexte()  {
        String url="https://cartosantesen.maps.arcgis.com/apps/dashboards/260c7842a77a48c191bf51c8b0a1d3f6";


        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);


            int timeTaken = 0;
            int TIMEOUT = 30;
            List<WebElement> reportelement;


                do {
                    try {
                    Thread.sleep(1000);

                }catch (Exception e){

                }
                    timeTaken = timeTaken + 1;
                } while (timeTaken < TIMEOUT);
                reportelement = driver.findElements(By.className("div.dock-element"));


            String html = driver.getPageSource();


            for (WebElement element : reportelement) {
                //System.out.println(element);
                //System.out.println("Paragraph text:" + element.getText());
            }



            //System.out.println(html);

            Document doc = Jsoup.parse(html);

            Elements elements = doc.select("text");

            /*System.out.println(elements.get(1).text());
            System.out.println(elements.get(5).text());
            System.out.println(elements.get(9).text());
            System.out.println(elements.get(11).text());
            System.out.println(elements.get(68).text()+" "+elements.get(69).text());
            System.out.println(elements.get(71).text()+" "+elements.get(72).text());*/
            String a = ((elements.get(71).text()+" "+elements.get(72).text()).toString());
            String b = (((elements.get(68).text()+" "+elements.get(69).text()).toString()));

            Pretexte squall = new Pretexte( elements.get(1).text(), elements.get(5).text(), elements.get(7).text(), elements.get(9).text(),elements.get(11).text(),elements.get(13).text(), a, b );
            return squall;



    }
}
