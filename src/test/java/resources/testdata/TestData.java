package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "jobSearch")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"Tester","Harrow","up to 5 miles","30000","50000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
                {"Graphic Designer","London","up to 7 miles","5000","7000","Per month","Contract","Contract Graphic Designer jobs in London"},
                {"Qa Tester","Wembley, Greater London","up to 25 miles","300","500","Per day","Temporary","Temporary Qa Tester jobs in Wembley"},
                {"Sales Assistant","London","up to 5 miles","3000","5000","Per month","Temporary","Temporary Sales Assistant jobs in London"},
                {"Qa Manager","Central London","up to 10 miles","50000","70000","Per annum","Permanent","Permanent Qa Manager jobs in Central London"},

        };
        return data;
    }
}
