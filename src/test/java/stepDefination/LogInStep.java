package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LogInPage;

public class LogInStep {
    public static WebDriver driver;

    LogInPage logInPage;

    @Given("User is on logIn page")
    public void login_user() {
        System.setProperty("WebDriver.chrome.driver", "src/test/resources/chromedriver-win64/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        logInPage = new LogInPage(driver);
        logInPage.openLoginPage();
    }

    @And("Write Credential")
    public void writeCredential() throws InterruptedException {
        logInPage.writeCredential();
    }

    @And("GetLogOut")
    public void getLogOut() {
        logInPage.getlogout();
    }

    @And("Select Customer")
    public void selectCustomer() {
        logInPage.createcustomer();
    }

    @And("Select Location")
    public void selectLocation() {
        logInPage.SelectLocation();
    }

    @And("add")
    public void add() {
        logInPage.add();
    }

    @And("bgColor")
    public void bgcolor() {
        logInPage.bgColor();
    }

    @And("addRequests")
    public void addrequests() {
        logInPage.addRequests();

    }

    @And("cancelRequest")
    public void cancelrequest() {
        logInPage.cancelRequest();
    }

    @And("getScheduledList")
    public void getscheduledlist() {
        logInPage.getScheduledList();
    }

    @And("concurrent Request")
    public void concurrentRequest() {
        logInPage.concurrentRequest();
    }

    @And("retrievalHistory")
    public void retrievalhistory() {
        logInPage.retrievalHistory();
    }

    @And("bookingHistory")
    public void bookinghistory() {
        logInPage.bookingHistory();
    }

    @And("webUsers")
    public void webusers() {
        logInPage.webUsers();
    }

    @And("mobileUsers")
    public void mobileusers() {
        logInPage.mobileUsers();
    }

    @And("visitorUsers")
    public void visitorusers() {
        logInPage.visitorUsers();

    }


    @And("storage")
    public void storage() {
        logInPage.storage();
    }

    @And("locationType")
    public void locationtype() {
        logInPage.locationType();
    }

    @And("siteMap")
    public void sitemap() {
        logInPage.siteMap();
    }

    @And("customerMaster")
    public void customermaster() {
        logInPage.customerMaster();
    }

    @And("customerLocation")
    public void customerlocation() {
        logInPage.customerLocation();
    }

    @And("customerClientMaster")
    public void customerclientmaster() {
        logInPage.customerClientMaster();
    }

    @And("customerClientMasterAdd")
    public void customerclientmasteradd() {
        logInPage.customerClientMasterAdd();
    }

    @And("customerClientMasterUpdate")
    public void customerclientmasterupdate() {
        logInPage.customerClientMasterUpdate();
    }

    @And("keyFobMaster")
    public void keyfobmaster() {
        logInPage.keyFobMaster();
    }

    @And("keyFobAllocation")
    public void keyfoballocation() {
        logInPage.keyFobAllocation();
    }

    @And("pricingMaster")
    public void pricingmaster() {
        logInPage.pricingMaster();
    }


    @And("AddMessages")
    public void addmessages() {
        logInPage.addMessages();
    }

}