package Assert_Promotion;

import Routes.Routes;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


import static Login.LoginTest.accessToken;
import static io.restassured.RestAssured.given;

public class AssertPromotionEndpoint {
    public static Response getAsserts() {
        Response response = given()
                .contentType(ContentType.JSON)
                .header("Authorization","Bearer "+ accessToken)
                .when()
                .get(Routes.getAllAssets);
        return response;
    }
    public static Response getDistricts() {
    Response response = given()
            .contentType(ContentType.JSON)
            .header("Authorization","Bearer "+ accessToken)
            .when()
            .get(Routes.getDistricts);
        return response;
}

}
