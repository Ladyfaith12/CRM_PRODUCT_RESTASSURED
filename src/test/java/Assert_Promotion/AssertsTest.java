package Assert_Promotion;


import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertsTest {

   // @Test
    public  void getAssertsTest(){
        Response response = AssertPromotionEndpoint.getAsserts();
        response.then().log().body();

    }

    //@Test
    public  void getDistrictsTest(){
        Response response = AssertPromotionEndpoint.getDistricts();
        response.then().log().body();

    }
    //@Test
    public  void getRegionsTest(){
        Response response = AssertPromotionEndpoint.getRegions();
        response.then().log().body();

        //assertions
        JsonPath json = response.jsonPath();
        Boolean success = json.getBoolean("sucess");
        Assert.assertEquals(success,true,"expected sucess to be true");

    }
    @Test
    public  void getUpcomingAuctionsTest(){
        Response response = AssertPromotionEndpoint.getRegions();
        response.then().log().body();

        //assertions
        JsonPath json = response.jsonPath();
        Boolean success = json.getBoolean("sucess");
        Assert.assertEquals(success,true,"expected sucess to be true");

    }

}
