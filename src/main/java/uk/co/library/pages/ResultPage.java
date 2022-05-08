package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {

    @FindBy(xpath = "//h1[@class=\"search-header__title\"]")
    WebElement resultText;

    public void verifyTheResults(String expected){
        String actualText = getTextFromElement(resultText);
        Assert.assertEquals(expected,actualText,"Search Text is not Matching");
    }
}
