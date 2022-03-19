package Tesla.TeslaTest;

import org.testng.annotations.DataProvider;

public class Data {

    @DataProvider(name="forLogInVal")
    public Object[][] getData() {
            return new Object[][]{
                    {"Tesla Account | Tesla"}
            };
    }
    @DataProvider(name="negForLogInVal")
    public Object[][] getDataN() {
        return new Object[][]{
                {"Tesla Account | Teslb"}
        };
    }
    @DataProvider(name="forTeslaXVal")
    public Object[][] getData1() {
        return new Object[][]{
                {"https://www.tesla.com/modelx","Model X | Tesla",true},

        };
    }
    @DataProvider(name="negForTeslaXVal")
    public Object[][] getData1N() {
        return new Object[][]{
                {"https://www.tesla.com/modelx","Model X | Tesla",false},
                {"https://www.tesla.com/modelx","Model Y | Tesla",true},
                {"https://www.tesla.com/modele","Model X | Tesla",true},
                {"https://www.tesla.com/modelx","Model Y | Tesla",false},
                {"https://www.tesla.com/modele","Model Y | Tesla",true},
                {"https://www.tesla.com/modele","Model X | Tesla",false},
                {"https://www.tesla.com/modele","Model Y | Tesla",false}
        };
    }
//    @DataProvider(name="forTeslaCompare")
//    public Object[][] getData2() {
//        return new Object[][]{
//                {"https://www.tesla.com/compare","Compare | Tesla",true}
//        };
//    }
@DataProvider(name="forViewSolar")
public Object[][] getData2() {
    return new Object[][]{
            {"https://www.tesla.com/energy/design","Design your Solar + Powerwall system",true},

    };
}
    @DataProvider(name="negForViewSola")
    public Object[][] getData2N() {
        return new Object[][]{

                {"https://www.tesla.com/energy/desiga","Design your Solar + Powerwall system",true},
                {"https://www.tesla.com/energy/design","Design your Solar + Powerwall systen",true},
                {"https://www.tesla.com/energy/design","Design your Solar + Powerwall system",false},
                {"https://www.tesla.com/energy/desige","Design your Solae + Powerwall system",true},
                {"https://www.tesla.com/energy/design","Design your Solae + Powerwall system",false},
                {"https://www.tesla.com/energy/desige","Design your Solar + Powerwall system",false},
                {"https://www.tesla.com/energy/desige","Design your Solar + Powerwale system",false}
        };
    }


    //**********ugur's part begin this line
    @DataProvider(name="ModelSVal")
    public Object[][] modelSval() {
        return new Object[][]{

                {"https://www.tesla.com/models","Model S | Tesla"}
        };
    }
    @DataProvider(name="ModelSNegVal")
    public Object[][] modelSNegval() {
        return new Object[][]{

                {"https://www.tesla.com/models","Model S` | Tesla",true}
        };
    }
    //**********ugurs part end here
}
