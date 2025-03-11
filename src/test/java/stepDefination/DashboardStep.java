//package stepDefination;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import pages.Dashboard;
//
//public class DashboardStep {
//    public static WebDriver driver;
//
//    Dashboard dashboard;
//
//    @Given("User is on logIn page to log in")
//    public void logIn(){
//        System.setProperty("WebDriver.chrome.driver", "src/test/resources/chromedriver-win64/chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        driver = new ChromeDriver(options);
//        dashboard = new Dashboard(driver);
//        dashboard.openLoginpage();
//    }
//
//    @And("Write Credentials")
//    public void writeCredentials() {
//        dashboard.writeCredentals();
//    }
//
//    @And("add")
//    public void add() {
//        dashboard.add();
//    }
//
//    @And("bgColor")
//    public void bgcolor() {
//        dashboard.bgColor();
//    }
//}