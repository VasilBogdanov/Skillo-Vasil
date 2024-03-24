import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class ParametersTests {
    @Parameters ({"user-name"})
    @Test
    public void testParameters(String name) {
    System.out.println("This is " + name);

    }
}
