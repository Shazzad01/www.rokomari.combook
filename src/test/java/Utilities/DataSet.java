package Utilities;

import org.testng.annotations.DataProvider;

public class DataSet {

    @DataProvider(name = "email")
    public static Object dataset1(){
        Object[][] objects = {
                {"sajjadkhanmd7@gmail.com"},
//
        };
        return objects;
    }

    @DataProvider(name = "Password")
    public static Object dataset2(){
        Object[][] objects = {
                {""}



        };
        return objects;
    }

}
