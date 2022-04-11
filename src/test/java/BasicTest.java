import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTest {

    @Test(description = "Successful test")
    @Owner("Oleg")
    @Description("first simple test with allure")
    public void successfulTest() {
        Assert.assertEquals(2,2);

    }


}
