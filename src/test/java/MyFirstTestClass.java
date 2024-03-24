import org.testng.Assert;
import org.testng.annotations.*;
public class MyFirstTestClass {
    @BeforeSuite
    public void testBeforeSuite(){
        System.out.println("Before Suite: Clean all DBs");
    }
    @BeforeTest (alwaysRun = true)
    public void testBeforeTest(){
        System.out.println("Before Test: Open Site URL");
    }
    @BeforeMethod
    public void testBeforeMethod(){
        System.out.println("Before Method: Verify Site is open");
    }

    @Test (groups = "smoke")
    public void testName(){
        System.out.println("My First Check");
    }
    @Test (groups = "testGroup")
    public void testNameSecond(){
        System.out.println("My Second Check");
        Assert.assertFalse(true);
    }
    @AfterMethod (groups = "smoke")
    public void testAfterMethod(){
        System.out.println("My After Method: Verify Check");
    }
    @AfterTest
    public void testAfterTest(){
        System.out.println("My After Test: Close Site");
    }
    @AfterSuite (groups = "test")
    public void testAfterSuite(){
        System.out.println("My After Suite: Check DB");
    }
}
