package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LogInPage {
    WebDriver driver;
    WebDriverWait wait;

    //Wipro pari(ParkEzy)--
    By username = By.xpath("//input[@id=\"basic_username\"]");
    By pass = By.xpath("//input[@id=\"basic_password\"]");
    By Login = By.xpath("//button[@type=\"submit\"]");

    public LogInPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // This is for explicit waits
    }

    public void openLoginPage() {
        driver.get(" https://carparking.wipropari.com/");
        driver.manage().window().maximize();
    }

    public void writeCredential() throws InterruptedException {

        //WP ParkEZY--
        driver.findElement(username).click();
        driver.findElement(username).sendKeys("1005");
        driver.findElement(pass).click();
        driver.findElement(pass).sendKeys(" Test@1234");
        driver.findElement(Login).click();

        System.out.println(driver.getTitle());

        String expectedTitle = "Wipro PARI-ParkEZY";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

        //driver.quit();
    }
// Dashboard----------

    public void getlogout() {
        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-circle ant-btn-primary gx-size-40 gx-mb-0 gx-mr-1 gx-fs-lg']")).click();
        driver.findElement(By.xpath("//li[text()='Logout']")).click();

    }

    public void createcustomer() {
        try {
            driver.findElement(By.xpath("//span[text()=\"Dashboard\"]")).click();

            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[@class='ant-select index-module__dropdown__selector__hQO9_ ant-select-single ant-select-show-arrow ant-select-show-search'][1]")).click();
            driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][1]")).click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void SelectLocation() {
        try {
            driver.findElement(By.xpath("//span[text()=\"Dashboard\"]")).click();

            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[@class='ant-select index-module__dropdown__selector__hQO9_ ant-select-single ant-select-allow-clear ant-select-show-arrow ant-select-show-search'][1]")).click();
            driver.findElement(By.xpath("//div[@class='ant-select-item-option-content']")).click();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void add() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[text()=\"Dashboard\"]")).click();
            driver.findElement(By.xpath("//span[text()=\"Add Visitor\"]")).click();

            Thread.sleep(1000);
//        driver.findElement(By.xpath("//input[@id=\"register_customer_client_id\"]")).click();
//        driver.findElement(By.xpath("//input[@id=\"register_customer_client_id\"]")).sendKeys("hdfc");
//        driver.findElement(By.xpath("//input[@id=\"register_customer_client_id\"]")).sendKeys(Keys.ENTER);

            //Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id=\"register_key_fob_id\"]")).click();
            driver.findElement(By.xpath("//input[@id=\"register_key_fob_id\"]")).sendKeys("2044 - Sedan - 4,680 mm x 1,850 mm x 1,670 mm");
            driver.findElement(By.xpath("//input[@id=\"register_key_fob_id\"]")).sendKeys(Keys.ENTER);

            //driver.findElement(By.xpath("//input[@name=\"employee_id\"]")).sendKeys("Samsan123");

            driver.findElement(By.xpath("//input[@name=\"mobile_number\"]")).sendKeys("9325745837");
            driver.findElement(By.xpath("//span[text()=\"Verify\"]")).click();

//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@name=\"first_name\"]")).sendKeys("Rutuja");
//
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@name=\"last_name\"]")).sendKeys("Arekar");

            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id=\"register_is_visitor\"]")).click();

            //    Thread.sleep(2000);
            //driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void bgColor() {
        try {
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[text()=\"Dashboard\"]")).click();
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("((//span[contains(@class, 'anticon-fullscreen') and contains(@class, 'index-module__maximize-icon__NPihT')])[2]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("(//div[@class=\"ant-collapse-expand-icon\"])[2]")).click();
            driver.findElement(By.xpath("(//div[@class=\"ant-collapse-expand-icon\"])[3]")).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String expectedColor = "#008000";
        String expWhite = "#ffffff";
        String expYellow = "#f4cc07";
        String expGrey = "";

        int greenCount = 0;
        int whiteCount = 0;
        int yellowCount = 0;
        int greyCount = 0;

        int greenCount1 = 0;
        int whiteCount1 = 0;
        int yellowCount1 = 0;
        int greyCount1 = 0;


        int greenCount2 = 0;
        int whiteCount2 = 0;
        int yellowCount2 = 0;
        int greyCount2 = 0;


        int[] sedan = {2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 40, 44,
                45, 50, 55, 60, 66, 73, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 96, 97, 98,
                120, 122, 133, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 767, 801,
                802, 803, 804, 805, 806, 807, 808, 809, 810, 811, 812, 813, 814, 815, 816, 817, 818,
                819, 820, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010, 1129, 1199, 2001,
                2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2044};

        int[] suv = {65, 1000};

        int[] xuv = {2030, 2031, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2041, 2042, 2043, 2045};

        System.out.println("The total number of allocations for SEDAN are " + sedan.length);
        System.out.println("The total number of allocations for SUV are " + suv.length);
        System.out.println("The total number of allocations for XUV are " + xuv.length);

        System.out.println("The total numbers of allocations are " + (sedan.length + suv.length + xuv.length));

        for (int i : sedan) {
            // Generate dynamic XPath
            List<WebElement> blocks = driver.findElements(By.xpath("//span[text()='" + i + "']"));

            for (WebElement block : blocks) {
                String bgColor = block.getCssValue("background-color");
                String actualColor = Color.fromString(bgColor).asHex();

                if (expectedColor.equals(actualColor)) {
                    greenCount++;
                    System.out.println("The KeyFOB " + i + " is Parked of SEDAN");
                } else if (expYellow.equals(actualColor)) {
                    yellowCount++;
                    System.out.println("The KeyFOB " + i + " is Booked of SEDAN");
                } else if (expWhite.equals(actualColor)) {
                    whiteCount++;
                    System.out.println("The KeyFOB " + i + " is Empty of SEDAN");
                } else {
                    System.out.println("The KeyFOB " + i + " is not Allocate of SEDAN");
                }
            }

        }


        for (int j : suv) {
            // Generate dynamic XPath
            List<WebElement> blocks1 = driver.findElements(By.xpath("//span[text()='" + j + "']"));

            for (WebElement block : blocks1) {
                String bgColor = block.getCssValue("background-color");
                String actualColor = Color.fromString(bgColor).asHex();

                if (expectedColor.equals(actualColor)) {
                    greenCount1++;
                    System.out.println("The KeyFOB " + j + " is Parked of SUV");
                } else if (expYellow.equals(actualColor)) {
                    yellowCount1++;
                    System.out.println("The KeyFOB " + j + " is Booked of SUV");
                } else if (expWhite.equals(actualColor)) {
                    whiteCount1++;
                    System.out.println("The KeyFOB " + j + " is Empty of SUV");
                } else {
                    System.out.println("The KeyFOB " + j + " is not allocate of SUV");
                }
            }
        }

        for (int k : xuv) {
            // Generate dynamic XPath
            List<WebElement> blocks2 = driver.findElements(By.xpath("//span[text()='" + k + "']"));
            for (WebElement block : blocks2) {
                String bgColor = block.getCssValue("background-color");
                String actualColor = Color.fromString(bgColor).asHex();

                if (expectedColor.equals(actualColor)) {
                    greenCount2++;
                    System.out.println("The KeyFOB " + k + " is Parked of XUV");
                } else if (expYellow.equals(actualColor)) {
                    yellowCount2++;
                    System.out.println("The KeyFOB " + k + " is Booked of XUV");
                } else if (expWhite.equals(actualColor)) {
                    whiteCount2++;
                    System.out.println("The KeyFOB " + k + " is Empty of XUV");
                } else {
                    System.out.println("The KeyFOB " + k + " is not allocate of XUV");
                }
            }
        }

        System.out.println("Total Parked (Green): " + (greenCount + greenCount1 + greenCount2));
        System.out.println("Total Booked (Yellow): " + (yellowCount + yellowCount1 + yellowCount2));
        System.out.println("Total Available (White): " + (whiteCount + whiteCount1 + whiteCount2));


//        int parked = 0;
//        Assert.assertEquals(parked,greenCount);
//
//        int empty = 41;
//        Assert.assertEquals(empty,whiteCount);
    }

//  Ongoing Queue----------

    public void addRequests() {

        try {
            //driver.navigate().refresh();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[text()=\"Ongoing Queue\"]")).click();
            //driver.findElement(By.xpath("//span[text()=\"Ongoing Queue\"]")).click();
            driver.findElement(By.xpath("//span[text()=\"Refresh\"]")).click();

            //Add Request--
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[text()=\"Add Request\"]")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id=\"request_type_id\"]")).click();
            driver.findElement(By.xpath("//input[@id=\"request_type_id\"]")).sendKeys("Retrieval");
            driver.findElement(By.xpath("//div[text()=\"Retrieval\"]")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@name=\"keyFOB\"]")).sendKeys("2044");

            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[text()=\"Verify KeyFob\"]")).click();
            //driver.findElement(By.xpath("//span[text()=\"Submit\"]")).click();

            //driver.quit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void cancelRequest() {

        try {
            driver.findElement(By.xpath("//span[text()=\"Ongoing Queue\"]")).click();
            driver.findElement(By.xpath("//span[text()=\"Refresh\"]")).click();

            //Cancel Request--

            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@class=\"ant-input\"]")).sendKeys("Uma");
            driver.findElement(By.xpath("//span[@aria-label=\"search\"]")).click();

            //To cancel perticular request--

            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[text()=\"Cancel\"]")).click();
            //driver.findElement(By.xpath("//span[text()=\"Yes\"]")).click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//  Scheduled List----------

    public void getScheduledList() {
        driver.findElement(By.xpath("//span[text()=\"Scheduled List\"]")).click();

        //Get List of Booking Or Retrieval--

        //Retrieval--
        driver.findElement(By.xpath("//span[text()=\"Retrieval\"]")).click();

        //Booking--
        //driver.findElement(By.xpath("//span[text()=\"Booking\"]")).click();

    }

//  Concurrent request----------

    public void concurrentRequest() {

        driver.findElement(By.xpath("//span[text()=\"Concurrent Request\"]")).click();

        driver.findElement(By.xpath("//input[@id=\"customerId\"]")).click();
        driver.findElement(By.xpath("//div[text()=\"Reality Group\"]")).click();

        driver.findElement(By.xpath("//input[@id=\"locationName\"]")).click();
        driver.findElement(By.xpath("//div[@class='ant-select-item-option-content' and contains(text(), 'Bavdhan Pune')]")).click();

        driver.findElement(By.xpath("//input[@id=\"bookingKeyFobs\"]")).sendKeys("");
        driver.findElement(By.xpath("//input[@id=\"retrievalKeyFobs\"]")).sendKeys("");

        //driver.findElement(By.xpath("//span[text()=\"Submit\"]")).click();

    }

//  Parking History----------

    public void bookingHistory() {
        try {
            driver.findElement(By.xpath("//span[text()=\"Parking History\"]")).click();

            driver.findElement(By.xpath("//span[text()=\"Booking\"]")).click();

            driver.findElement(By.xpath("//input[@ id =\"rc_select_2\"]")).click();
            //driver.findElement(By.xpath("(//div[@class=\"ant-select-item-option-content\"])[1]")).click();
            driver.findElement(By.xpath("//input[@ id =\"rc_select_2\"]")).sendKeys("20 - Sedan");
            driver.findElement(By.xpath("//div[text()=\"20 - Sedan\"]")).click();

            driver.findElement(By.xpath("//div[@class='ant-select-selector' and .//span[text()='Select Request Status']]//input[@type='search']")).click();
            driver.findElement(By.xpath("(//div[@class=\"ant-select-item-option-content\"])[1]")).click();
            //driver.findElement(By.xpath("//div[@class=\"ant-select-item-option-content\" and contains(text(),\"CANCELLED\")]")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[@class='ant-select-selector' and .//span[text()='Select Req ACK Status']]//input[@type='search']")).click();
            driver.findElement(By.xpath("//div[@class='ant-select-selector' and .//span[text()='Select Req ACK Status']]//input[@type='search']"))
                    .sendKeys("5002: Request Cancelled: No confirmation received by user.");

            driver.findElement(By.xpath("//div[@class='ant-select-selector' and .//span[text()='Select Req ACK Status']]//input[@type='search']"))
                    .sendKeys(Keys.ENTER);


            //driver.findElement(By.xpath("//div[@class='ant-select-selector' and .//span[text()='Select Req ACK Status']]//input[@type='search']")).click();

            //driver.findElement(By.xpath("//span[@title=\"5002: Request Cancelled: No confirmation received by user.\"]")).click();

            //Start date--
            //Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@placeholder=\"Start date\"]")).click();
            String aMonth = driver.findElement(By.xpath("//button[@class=\"ant-picker-month-btn\"]")).getText();
            String aYear = driver.findElement(By.xpath("//button[@class=\"ant-picker-month-btn\"]")).getText();

            while (!(aMonth.equals("Jan")) && (aYear.equals("2025"))) {
                driver.findElement(By.xpath("//span[@class=\"ant-picker-next-icon\"]")).click();
                driver.findElement(By.xpath("//span[@class=\"ant-picker-super-next-icon\"]")).click();
            }

            driver.findElement(By.xpath("//td[@title=\"2025-01-03\"]")).click();

            WebElement element = driver.findElement(By.xpath
                    ("//*[@id=\"root\"]/section/section/main/div/div/div[2]/div[1]/div[5]/div/div/div/div[2]/div[1]/div/div/div[2]/div[2]/ul[1]/li[13]"));

            Actions action = new Actions(driver);
            action.moveToElement(element).perform();

//        driver.findElement(By.xpath("")).click();
//        driver.findElement(By.xpath("")).click();

            //End date--
            driver.findElement(By.xpath("//input[@placeholder=\"End date\"]")).click();
            String aMonth1 = driver.findElement(By.xpath("//button[@class=\"ant-picker-month-btn\"]")).getText();
            String aYear1 = driver.findElement(By.xpath("//button[@class=\"ant-picker-month-btn\"]")).getText();

            while (!(aMonth1.equals("Jan")) && (aYear1.equals("2025"))) {
                driver.findElement(By.xpath("//span[@class=\"ant-picker-next-icon\"]")).click();
                driver.findElement(By.xpath("//span[@class=\"ant-picker-super-next-icon\"]")).click();
            }

            driver.findElement(By.xpath("//td[@title=\"2025-01-03\"]")).click();

            WebElement elements = driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/main/div/div/div[2]/div[1]/div[5]/div/div/div/div[2]/div[1]/div/div/div[2]/div[2]/ul[1]/li[13]"));
            Actions actions = new Actions(driver);
            actions.moveToElement(elements).perform();

//        driver.findElement(By.xpath("")).click();
//        driver.findElement(By.xpath("")).click();

            driver.findElement(By.xpath("//span[text()=\"OK\"]")).click();

            driver.findElement(By.xpath("//span[text()=\"Go\"]")).click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void retrievalHistory() {
        try {
            driver.findElement(By.xpath("//span[text()=\"Parking History\"]")).click();

            driver.findElement(By.xpath("//span[text()=\"Retrieval\"]")).click();

            driver.findElement(By.xpath("//input[@ id =\"rc_select_2\"]")).click();
            driver.findElement(By.xpath("//input[@ id =\"rc_select_2\"]")).sendKeys("20 - Sedan");
            driver.findElement(By.xpath("//div[text()=\"20 - Sedan\"]")).click();

            driver.findElement(By.xpath("//div[@class='ant-select-selector' and .//span[text()='Select Request Status']]//input[@type='search']")).click();
            driver.findElement(By.xpath("//div[@class=\"ant-select-item-option-content\" and contains(text(),\"CANCELLED\")]")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[@class='ant-select-selector' and .//span[text()='Select Req ACK Status']]//input[@type='search']")).click();
            driver.findElement(By.xpath("//div[@class='ant-select-selector' and .//span[text()='Select Req ACK Status']]//input[@type='search']"))
                    .sendKeys("5002: Request Cancelled: No confirmation received by user.");

            driver.findElement(By.xpath("//div[@class='ant-select-selector' and .//span[text()='Select Req ACK Status']]//input[@type='search']"))
                    .sendKeys(Keys.ENTER);


            //driver.findElement(By.xpath("//div[@class='ant-select-selector' and .//span[text()='Select Req ACK Status']]//input[@type='search']")).click();

            //driver.findElement(By.xpath("//span[@title=\"5002: Request Cancelled: No confirmation received by user.\"]")).click();

            //Start date--
            //Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@placeholder=\"Start date\"]")).click();
            String aMonth = driver.findElement(By.xpath("//button[@class=\"ant-picker-month-btn\"]")).getText();
            String aYear = driver.findElement(By.xpath("//button[@class=\"ant-picker-month-btn\"]")).getText();

            while (!(aMonth.equals("Jan")) && (aYear.equals("2025"))) {
                driver.findElement(By.xpath("//span[@class=\"ant-picker-next-icon\"]")).click();
                driver.findElement(By.xpath("//span[@class=\"ant-picker-super-next-icon\"]")).click();
            }

            driver.findElement(By.xpath("//td[@title=\"2025-01-03\"]")).click();

            WebElement element = driver.findElement(By.xpath
                    ("//*[@id=\"root\"]/section/section/main/div/div/div[2]/div[1]/div[5]/div/div/div/div[2]/div[1]/div/div/div[2]/div[2]/ul[1]/li[13]"));

            Actions action = new Actions(driver);
            action.moveToElement(element).perform();

//        driver.findElement(By.xpath("")).click();
//        driver.findElement(By.xpath("")).click();

//        //End date--
            driver.findElement(By.xpath("//input[@placeholder=\"End date\"]")).click();
            String aMonth1 = driver.findElement(By.xpath("//button[@class=\"ant-picker-month-btn\"]")).getText();
            String aYear1 = driver.findElement(By.xpath("//button[@class=\"ant-picker-month-btn\"]")).getText();

            while (!(aMonth1.equals("Jan")) && (aYear1.equals("2025"))) {
                driver.findElement(By.xpath("//span[@class=\"ant-picker-next-icon\"]")).click();
                driver.findElement(By.xpath("//span[@class=\"ant-picker-super-next-icon\"]")).click();
            }

            driver.findElement(By.xpath("//td[@title=\"2025-01-03\"]")).click();

            WebElement elements = driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/main/div/div/div[2]/div[1]/div[5]/div/div/div/div[2]/div[1]/div/div/div[2]/div[2]/ul[1]/li[13]"));
            Actions actions = new Actions(driver);
            actions.moveToElement(elements).perform();

//        driver.findElement(By.xpath("")).click();
//        driver.findElement(By.xpath("")).click();

            driver.findElement(By.xpath("//span[text()=\"OK\"]")).click();

            driver.findElement(By.xpath("//span[text()=\"Go\"]")).click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void storage() {
        try {
            driver.findElement(By.xpath("//span[text()=\"Parking History\"]")).click();

            driver.findElement(By.xpath("//span[text()=\"Storage\"]")).click();

            driver.findElement(By.xpath("//input[@ id =\"rc_select_2\"]")).click();
            driver.findElement(By.xpath("//input[@ id =\"rc_select_2\"]")).sendKeys("20 - Sedan");
            driver.findElement(By.xpath("//div[text()=\"20 - Sedan\"]")).click();

            driver.findElement(By.xpath("//div[@class='ant-select-selector' and .//span[text()='Select Request Status']]//input[@type='search']")).click();
            driver.findElement(By.xpath("//div[@class=\"ant-select-item-option-content\" and contains(text(),\"CANCELLED\")]")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[@class='ant-select-selector' and .//span[text()='Select Req ACK Status']]//input[@type='search']")).click();
            driver.findElement(By.xpath("//div[@class='ant-select-selector' and .//span[text()='Select Req ACK Status']]//input[@type='search']"))
                    .sendKeys("5002: Request Cancelled: No confirmation received by user.");

            driver.findElement(By.xpath("//div[@class='ant-select-selector' and .//span[text()='Select Req ACK Status']]//input[@type='search']"))
                    .sendKeys(Keys.ENTER);


            //driver.findElement(By.xpath("//div[@class='ant-select-selector' and .//span[text()='Select Req ACK Status']]//input[@type='search']")).click();

            //driver.findElement(By.xpath("//span[@title=\"5002: Request Cancelled: No confirmation received by user.\"]")).click();

            //Start date--
            //Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@placeholder=\"Start date\"]")).click();
            String aMonth = driver.findElement(By.xpath("//button[@class=\"ant-picker-month-btn\"]")).getText();
            String aYear = driver.findElement(By.xpath("//button[@class=\"ant-picker-month-btn\"]")).getText();

            while (!(aMonth.equals("Jan")) && (aYear.equals("2025"))) {
                driver.findElement(By.xpath("//span[@class=\"ant-picker-next-icon\"]")).click();
                driver.findElement(By.xpath("//span[@class=\"ant-picker-super-next-icon\"]")).click();
            }

            driver.findElement(By.xpath("//td[@title=\"2025-01-03\"]")).click();

            WebElement element = driver.findElement(By.xpath
                    ("//*[@id=\"root\"]/section/section/main/div/div/div[2]/div[1]/div[5]/div/div/div/div[2]/div[1]/div/div/div[2]/div[2]/ul[1]/li[13]"));

            Actions action = new Actions(driver);
            action.moveToElement(element).perform();

//        driver.findElement(By.xpath("")).click();
//        driver.findElement(By.xpath("")).click();

//        //End date--
            driver.findElement(By.xpath("//input[@placeholder=\"End date\"]")).click();
            String aMonth1 = driver.findElement(By.xpath("//button[@class=\"ant-picker-month-btn\"]")).getText();
            String aYear1 = driver.findElement(By.xpath("//button[@class=\"ant-picker-month-btn\"]")).getText();

            while (!(aMonth1.equals("Jan")) && (aYear1.equals("2025"))) {
                driver.findElement(By.xpath("//span[@class=\"ant-picker-next-icon\"]")).click();
                driver.findElement(By.xpath("//span[@class=\"ant-picker-super-next-icon\"]")).click();
            }

            driver.findElement(By.xpath("//td[@title=\"2025-01-03\"]")).click();

            WebElement elements = driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/main/div/div/div[2]/div[1]/div[5]/div/div/div/div[2]/div[1]/div/div/div[2]/div[2]/ul[1]/li[13]"));
            Actions actions = new Actions(driver);
            actions.moveToElement(elements).perform();

//        driver.findElement(By.xpath("")).click();
//        driver.findElement(By.xpath("")).click();

            driver.findElement(By.xpath("//span[text()=\"OK\"]")).click();

            driver.findElement(By.xpath("//span[text()=\"Go\"]")).click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//  User Management------------

    public void webUsers() {

        try {
            //Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@class=\"ant-menu-title-content\" and contains(text(),\"User Management\")]")).click();
            driver.findElement(By.xpath("//div[@class=\"ant-select index-module__select-master-dropdown__yfRF6 ant-select-single ant-select-show-arrow ant-select-show-search\"]")).click();
            driver.findElement(By.xpath("//div[text()=\"Web Users\"]")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).click();
            driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).sendKeys("Mahesh Shitut");
            driver.findElement(By.xpath("//button[@type=\"button\" and @class=\"ant-btn ant-btn-default ant-btn-icon-only ant-input-search-button\"]")).click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void mobileUsers() {
        try {
            //Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@class=\"ant-menu-title-content\" and contains(text(),\"User Management\")]")).click();
            driver.findElement(By.xpath("//div[@class=\"ant-select index-module__select-master-dropdown__yfRF6 ant-select-single ant-select-show-arrow ant-select-show-search\"]")).click();
            driver.findElement(By.xpath("//div[text()=\"Mobile Users\"]")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).click();
            driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).sendKeys("Rutuja Arekar");
            driver.findElement(By.xpath("//button[@type=\"button\" and @class=\"ant-btn ant-btn-default ant-btn-icon-only ant-input-search-button\"]")).click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void visitorUsers() {
        try {
            //Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@class=\"ant-menu-title-content\" and contains(text(),\"User Management\")]")).click();
            driver.findElement(By.xpath("//div[@class=\"ant-select index-module__select-master-dropdown__yfRF6 ant-select-single ant-select-show-arrow ant-select-show-search\"]")).click();
            driver.findElement(By.xpath("//div[text()=\"Visitor Users\"]")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).click();
            driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).sendKeys("PRITI P");
            driver.findElement(By.xpath("//button[@type=\"button\" and @class=\"ant-btn ant-btn-default ant-btn-icon-only ant-input-search-button\"]")).click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

//  Master Management------------

    public void locationType() {

        driver.findElement(By.xpath("//span[text()=\"Master Management\" and @class=\"ant-menu-title-content\"]")).click();

        driver.findElement(By.xpath("//div[@class=\"ant-select index-module__select-master-dropdown__rxobb ant-select-single ant-select-show-arrow ant-select-show-search\"]")).click();
        driver.findElement(By.xpath("//div[text()=\"Location Type Master\"]")).click();

        driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).click();
        driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).sendKeys("Hybrid commmall");

        driver.findElement(By.xpath("//button[@type=\"button\" and @class=\"ant-btn ant-btn-default ant-btn-icon-only ant-input-search-button\"]")).click();

    }


    public void siteMap() {
        try {
            driver.findElement(By.xpath("//span[text()=\"Master Management\" and @class=\"ant-menu-title-content\"]")).click();

            driver.findElement(By.xpath("//div[@class=\"ant-select index-module__select-master-dropdown__rxobb ant-select-single ant-select-show-arrow ant-select-show-search\"]")).click();
            driver.findElement(By.xpath("//div[text()=\"Site Map Type Master\"]")).click();

            driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).click();
            driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).sendKeys("Chess");

            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[@type=\"button\" and @class=\"ant-btn ant-btn-default ant-btn-icon-only ant-input-search-button\"]")).click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void customerMaster() {
        try {
            driver.findElement(By.xpath("//span[text()=\"Master Management\" and @class=\"ant-menu-title-content\"]")).click();

            driver.findElement(By.xpath("//div[@class=\"ant-select index-module__select-master-dropdown__rxobb ant-select-single ant-select-show-arrow ant-select-show-search\"]")).click();
            driver.findElement(By.xpath("//div[text()=\"Customer Master\"]")).click();

            driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).click();
            driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).sendKeys("Amar Patil");

            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[@type=\"button\" and @class=\"ant-btn ant-btn-default ant-btn-icon-only ant-input-search-button\"]")).click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void customerLocation() {
        try {
            driver.findElement(By.xpath("//span[text()=\"Master Management\" and @class=\"ant-menu-title-content\"]")).click();

            driver.findElement(By.xpath("//div[@class=\"ant-select index-module__select-master-dropdown__rxobb ant-select-single ant-select-show-arrow ant-select-show-search\"]")).click();
            driver.findElement(By.xpath("//div[text()=\"Customer Location Master\"]")).click();

            driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).click();
            driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).sendKeys("Amar Patil");

            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[@type=\"button\" and @class=\"ant-btn ant-btn-default ant-btn-icon-only ant-input-search-button\"]")).click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void customerClientMaster() {
        try {
            driver.findElement(By.xpath("//span[text()=\"Master Management\" and @class=\"ant-menu-title-content\"]")).click();

            driver.findElement(By.xpath("//div[@class=\"ant-select index-module__select-master-dropdown__rxobb ant-select-single ant-select-show-arrow ant-select-show-search\"]")).click();
            driver.findElement(By.xpath("//div[text()=\"Customer Client Master\"]")).click();

            driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).click();
            driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).sendKeys("Diya Patel");

            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[@type=\"button\" and @class=\"ant-btn ant-btn-default ant-btn-icon-only ant-input-search-button\"]")).click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void customerClientMasterAdd() {
        try {
            driver.findElement(By.xpath("//span[text()=\"Master Management\" and @class=\"ant-menu-title-content\"]")).click();

            driver.findElement(By.xpath("//div[@class=\"ant-select index-module__select-master-dropdown__rxobb ant-select-single ant-select-show-arrow ant-select-show-search\"]")).click();
            driver.findElement(By.xpath("//div[text()=\"Customer Client Master\"]")).click();

            driver.findElement(By.xpath("//span[text()=\"Add\"]")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id=\"register_client_name\"]")).sendKeys("Samsan Labs");
            driver.findElement(By.xpath("//input[@id=\"register_allocated_parking\"]")).sendKeys("3008");
            driver.findElement(By.xpath("//input[@id=\"register_client_contact\"]")).sendKeys("Rutuja Arekar");
            driver.findElement(By.xpath("//input[@id=\"register_mobile_number\"]")).sendKeys("9325745837");
            driver.findElement(By.xpath("//input[@id=\"register_email_address\"]")).sendKeys("rutujagawade1997@gmail.com");

            //driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void customerClientMasterUpdate() {
        try {
            driver.findElement(By.xpath("//span[text()=\"Master Management\" and @class=\"ant-menu-title-content\"]")).click();

            driver.findElement(By.xpath("//div[@class=\"ant-select index-module__select-master-dropdown__rxobb ant-select-single ant-select-show-arrow ant-select-show-search\"]")).click();
            driver.findElement(By.xpath("//div[text()=\"Customer Client Master\"]")).click();

            driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).click();
            driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).sendKeys("Diya Patel");
            driver.findElement(By.xpath("//button[@type=\"button\" and @class=\"ant-btn ant-btn-default ant-btn-icon-only ant-input-search-button\"]")).click();


            Thread.sleep(1000);
            driver.findElement(By.xpath("//i[@class=\"icon icon-edit  icon-disabled index-module__action-icon__ciGZ7  ant-tooltip-open\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/main/div/div/div/div/div[2]/div[1]/div/div/div/div/div/table/tbody/tr/td[10]/div/div[1]/i")).click();

//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//input[@id=\"register_client_name\"]")).sendKeys("Samsan Labs");
//            driver.findElement(By.xpath("//input[@id=\"register_allocated_parking\"]")).sendKeys("3008");
//            driver.findElement(By.xpath("//input[@id=\"register_client_contact\"]")).sendKeys("Rutuja Arekar");
//            driver.findElement(By.xpath("//input[@id=\"register_mobile_number\"]")).sendKeys("9325745837");
//            driver.findElement(By.xpath("//input[@id=\"register_email_address\"]")).sendKeys("rutujagawade1997@gmail.com");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void keyFobMaster() {
        try {
            driver.findElement(By.xpath("//span[text()=\"Master Management\" and @class=\"ant-menu-title-content\"]")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[@class=\"ant-select index-module__select-master-dropdown__rxobb ant-select-single ant-select-show-arrow ant-select-show-search\"]")).click();
            driver.findElement(By.xpath("//div[text()=\"KeyFob Master\"]")).click();

            driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).click();
            driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).sendKeys("2008");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void keyFobAllocation() {
        try {
            driver.findElement(By.xpath("//span[text()=\"Master Management\" and @class=\"ant-menu-title-content\"]")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[@class=\"ant-select index-module__select-master-dropdown__rxobb ant-select-single ant-select-show-arrow ant-select-show-search\"]")).click();
            driver.findElement(By.xpath("//div[text()=\"KeyFob Allocation Master\"]")).click();

            driver.findElement(By.xpath("//button[@class=\"ant-btn ant-btn-default button-gradiant gx-mb-0 add-button\"]")).click();

            //Add--
            Thread.sleep(1000);
//         driver.findElement(By.xpath("//input[@id=\"register_customer_client_id\"]")).click();
//         driver.findElement(By.xpath("//input[@id=\"register_customer_client_id\"]")).sendKeys("hdfc");
//         driver.findElement(By.xpath("//div[text()=\"hdfc\"]")).click();

            driver.findElement(By.xpath("//input[@id=\"register_key_fob_id\"]")).click();
            driver.findElement(By.xpath("//input[@id=\"register_key_fob_id\"]")).sendKeys("2044 - Sedan - 4,680 mm x 1,850 mm x 1,670 mm");
            driver.findElement(By.xpath("//div[text()=\"2044 - Sedan - 4,680 mm x 1,850 mm x 1,670 mm\"]")).click();

            //driver.findElement(By.xpath("//input[@name=\"employee_id\"]")).sendKeys("Samsan123");

            //driver.navigate().refresh();
            driver.findElement(By.xpath("//input[@name=\"mobile_number\"]")).sendKeys("9325745837");
            driver.findElement(By.xpath("//span[text()=\"Verify\"]")).click();

            // Thread.sleep(1000);
            //driver.findElement(By.xpath("//input[@name=\"first_name\"]")).sendKeys("Rutuja");

            //Thread.sleep(1000);
            //driver.findElement(By.xpath("//input[@name=\"last_name\"]")).sendKeys("Arekar");

            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id=\"register_is_visitor\"]")).click();

            //driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void pricingMaster() {
        try {
            driver.findElement(By.xpath("//span[text()=\"Master Management\" and @class=\"ant-menu-title-content\"]")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[@class=\"ant-select index-module__select-master-dropdown__rxobb ant-select-single ant-select-show-arrow ant-select-show-search\"]")).click();
            driver.findElement(By.xpath("//div[text()=\"Pricing Master\"]")).click();

            driver.findElement(By.xpath("//button[@class=\"ant-btn ant-btn-default button-gradiant gx-mb-0 add-button\"]")).click();

            driver.findElement(By.xpath("//input[@id=\"register_vehicle_type_id\"]")).sendKeys("sedan");
            driver.findElement(By.xpath("//input[@id=\"register_vehicle_type_id\"]")).sendKeys(Keys.ENTER);

            driver.findElement(By.xpath("//input[@id=\"register_price_per_hour\"]")).sendKeys("100");

            //driver.findElement(By.xpath("//span[text()=\"Submit\"]")).click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void addMessages() {
        try {
            driver.findElement(By.xpath("//span[text()=\"Messaging\" and @class=\"ant-menu-title-content\"]")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[text()=\"Add Messaging\"]")).click();

            driver.findElement(By.xpath("//input[@value=\"SMS\"]")).click();
            //driver.findElement(By.xpath("//input[@value=\"PUSH\"]")).click();

            //driver.findElement(By.xpath("//input[@value=\"Web User\"]")).click();
            driver.findElement(By.xpath("//input[@value=\"Mobile User\"]")).click();

            driver.findElement(By.xpath("//textarea[@id=\"mobile_numbers\"]")).sendKeys("9325745837");
            driver.findElement(By.xpath("//textarea[@id=\"mobile_numbers\"]")).sendKeys(Keys.ENTER);

            driver.findElement(By.xpath("//input[@id=\"notification_id\"]")).sendKeys("Other");
            driver.findElement(By.xpath("//input[@id=\"notification_id\"]")).sendKeys(Keys.ENTER);

            //driver.findElement(By.xpath("//textarea[@id=\"notification_message\"]")).click();
            driver.findElement(By.xpath("//textarea[@id=\"notification_message\"]")).sendKeys("Having issue related testing");
            driver.findElement(By.xpath("//textarea[@id=\"notification_message\"]")).sendKeys(Keys.ENTER);

            driver.findElement(By.xpath("//input[@value=\"Now\"]")).click();
            //driver.findElement(By.xpath("//input[@value=\"Later\"]")).click();
            //driver.findElement(By.xpath("//span[text()=\"Publish\"]")).click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}