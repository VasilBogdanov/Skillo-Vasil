package Demo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Examples {
    public static void main(String[] args){
        //WebDriverManager.chromedriver().setup();
        //WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.edgedriver().setup();
        myTestSelenium();
    }
    public static void myTestSelenium(){
        //ChromeDriver driver = new ChromeDriver();
        EdgeDriver driver = new EdgeDriver();
        driver.get("http://training.skillo-bg.com:4300/posts/all");
        driver.manage().window().maximize();
        driver.close();
    }
}
