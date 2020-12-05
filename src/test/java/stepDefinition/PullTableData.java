package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PullTableData {
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.tsrtconline.in/oprs-web/home/aboutus.do");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

//        int rownum=driver.findElements(By.cssSelector("table[class=\"boxborderTd\"]>tbody>tr")).size();
//        System.out.println(rownum);
//
//        int colnum=driver.findElements(By.cssSelector("table[class=\"boxborderTd\"]>tbody>tr:nth-child(1)>td")).size();
//        System.out.println(colnum);


        WebElement mytbl=driver.findElement(By.cssSelector("table[class=\"boxborderTd\"]>tbody"));
        List<WebElement> row_tab= driver.findElements(By.cssSelector("table[class=\"boxborderTd\"]>tbody>tr"));
        int row_cnt = row_tab.size();
        System.out.println("row_cnt is: "+row_cnt);
        for (int row=0;row<row_cnt;row++)
        {
            List<WebElement> col_row=row_tab.get(row).findElements(By.cssSelector("table[class=\"boxborderTd\"]>tbody>tr>td"));
            int col_cnt=col_row.size();
//            System.out.println("no. of cell in row "+row+ " are "+col_cnt);

            for(int col=0; col<col_cnt; col++)
            {
                String celtxt = col_row.get(col).getText();

                if (celtxt.equalsIgnoreCase("Deluxe (2 + 2 Non-AC)"))
                {
                    System.out.println(celtxt);
                }

//                System.out.println("cel val of the row num "+ row +" and col num "+col+ " is "+celtxt);

            }
//            System.out.println("----- end -----");
        }

        driver.close();

    }
}
