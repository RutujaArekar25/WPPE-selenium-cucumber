//package pages;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.Color;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//public class Dashboard {
//    WebDriver driver;
//    WebDriverWait wait;
//
//    //Wipro pari(ParkEzy)--
//    By username = By.xpath("//input[@id=\"basic_username\"]");
//    By pass = By.xpath("//input[@id=\"basic_password\"]");
//    By Login = By.xpath("//button[@type=\"submit\"]");
//
//    public Dashboard(WebDriver driver) {
//        this.driver = driver;
//        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Adjust the timeout value as per your requirement
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // This is for explicit waits
//
//    }
//
//    public void openLoginpage() {
//        driver.get(" https://carparking.wipropari.com/");
//        driver.manage().window().maximize();
//    }
//
//    public void writeCredentals() {
//        //WP ParkEZY--
//        driver.findElement(username).click();
//        driver.findElement(username).sendKeys("1005");
//        driver.findElement(pass).click();
//        driver.findElement(pass).sendKeys(" Test@1234");
//        driver.findElement(Login).click();
//
//        System.out.println(driver.getTitle());
//
//        String expectedTitle = "Wipro PARI-ParkEZY";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle);
//
//    }
//
//    public void add() {
//        try {
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//span[text()=\"Dashboard\"]")).click();
//            driver.findElement(By.xpath("//span[text()=\"Add Visitor\"]")).click();
//
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//input[@id=\"register_customer_client_id\"]")).click();
//            driver.findElement(By.xpath("//input[@id=\"register_customer_client_id\"]")).sendKeys("hdfc");
//            driver.findElement(By.xpath("//div[text()=\"hdfc\"]")).click();
//
//            //driver.navigate().refresh();
//            //Thread.sleep(2000);
//            driver.findElement(By.xpath("//input[@id=\"register_key_fob_id\"]")).click();
//            //driver.findElement(By.xpath("//input[@id=\"register_key_fob_id\"]")).sendKeys("3008 - Sedan - 4,680 mm x 1,850 mm x 1,670 mm");
//            //driver.findElement(By.xpath("//div[text()=\"3008 - Sedan - 4,680 mm x 1,850 mm x 1,670 mm\"]")).click();
//            driver.findElement(By.xpath("//input[@id=\"register_key_fob_id\"]")).sendKeys("3007 - Sedan - 4,680 mm x 1,850 mm x 1,670 mm");
//            driver.findElement(By.xpath("//div[text()=\"3007 - Sedan - 4,680 mm x 1,850 mm x 1,670 mm")).click();
//
//            driver.findElement(By.xpath("//input[@name=\"employee_id\"]")).sendKeys("Samsan123");
//
//            //driver.navigate().refresh();
//            driver.findElement(By.xpath("//input[@name=\"mobile_number\"]")).sendKeys("9325745837");
//            driver.findElement(By.xpath("//span[text()=\"Verify\"]")).click();
//
////        Thread.sleep(2000);
////        driver.findElement(By.xpath("//input[@name=\"first_name\"]")).sendKeys("Rutuja");
////
////            Thread.sleep(2000);
////        driver.findElement(By.xpath("//input[@name=\"last_name\"]")).sendKeys("Arekar");
//
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//input[@id=\"register_is_visitor\"]")).click();
//
//            //    Thread.sleep(2000);
//            //driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void bgColor() {
//        int greenCount = 0;
//        int whiteCount=0;
//        int yellowCount=0;
//        int greyCount=0;
//
//        String expectedColor = "#008000";
//        String expWhite ="#FFFFFF";
//        String expYellow="#f4cc07";
//        String expGrey="";
//
//        // Loop through numbers --
//        for (int i =2; i <= 66; i++) {
//            // Generate dynamic XPath
//            List<WebElement> blocks = driver.findElements(By.xpath("//span[text()='" + i + "']"));
//            //List<WebElement> blocks = driver.findElements(By.xpath("//span[text()=\"14\"]"));
//
//            // Check each block for the green color
//            for (WebElement block : blocks) {
//                String bgColor = block.getCssValue("background-color");
//                String actualColor = Color.fromString(bgColor).asHex();
//
//                //System.out.println(actualColor);
//
//                if (expectedColor.equals(actualColor)) {
//                    greenCount++;
//                    System.out.println("The KeyFOB " + i + " is Parked");
//                } else if (expYellow.equals(actualColor)) {
//                    yellowCount++;
//                    System.out.println("The KeyFOB " + i + " is Booked");
//                } else{
//                    whiteCount++;
//                }
//            }
//
//        }
//
//        int greenCount1 = 0;
//        int whiteCount1=0;
//        int yellowCount1=0;
//        int greyCount1=0;
//
//        for (int i =67; i <= 100; i++) {
//            // Generate dynamic XPath
//            List<WebElement> blocks = driver.findElements(By.xpath("//span[text()='" + i + "']"));
//            //List<WebElement> blocks = driver.findElements(By.xpath("//span[text()=\"14\"]"));
//
//            // Check each block for the green color
//            for (WebElement block : blocks) {
//                String bgColor = block.getCssValue("background-color");
//                String actualColor = Color.fromString(bgColor).asHex();
//
//                //System.out.println(actualColor);
//
//                if (expectedColor.equals(actualColor)) {
//                    greenCount1++;
//                    System.out.println("The KeyFOB " + i + " is Parked");
//                } else if (expYellow.equals(actualColor)) {
//                    yellowCount1++;
//                    System.out.println("The KeyFOB " + i + " is Booked");
//                } else{
//                    whiteCount1++;
//                }
//            }
//
//        }
//
//        System.out.println("The Total no of Parked are " + greenCount);
//        System.out.println("The Total no of Empty are " +  whiteCount);
//        System.out.println("The Total no of Booked are " +  yellowCount);
//
//        System.out.println("The Total no of Parked are " + greenCount1);
//        System.out.println("The Total no of Empty are " +  whiteCount1);
//        System.out.println("The Total no of Booked are " +  yellowCount1);
//
////        int parked = 0;
////        Assert.assertEquals(parked,greenCount);
////
////        int empty = 41;
////        Assert.assertEquals(empty,whiteCount);
//
//
//    }
//}