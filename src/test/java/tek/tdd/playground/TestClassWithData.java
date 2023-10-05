package tek.tdd.playground;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClassWithData {

    @Test(dataProvider = "names")
    public void testWithMethods(String firstName, String lastName){
        //print first name,
        System.out.println("First Name " + firstName);

        System.out.println("Last Name " + lastName);
    }

    //Data Provider = is a method that return 2D array Object.
    @DataProvider(name = "names")
    private String[][] testData(){
        String[][] data = {
                {"Mohammad", "Karimi"},
                {"John", "Smith"},
                {"Humaira", "Halimi"},
                {"Idrees", "Noori"},
        };
        return data;
    }
}
