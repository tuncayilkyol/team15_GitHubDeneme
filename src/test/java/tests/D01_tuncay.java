package tests;

import org.testng.annotations.Test;
import utilities.Driver;

public class D01_tuncay {

    @Test
    public void test01(){
        Driver.getDriver().get("httpps://www.amazon.com");



    }
}
