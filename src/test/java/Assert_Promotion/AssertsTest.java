package Assert_Promotion;


import io.restassured.response.Response;
import org.testng.annotations.Test;

public class AssertsTest {

    //@Test
    public  void getAssertsTest(){
        Response response = AssertPromotionEndpoint.getAsserts();
        response.then().log().body();

    }

    @Test
    public  void getDistrictsTest(){
        Response response = AssertPromotionEndpoint.getDistricts();
        response.then().log().body();

    }
}
