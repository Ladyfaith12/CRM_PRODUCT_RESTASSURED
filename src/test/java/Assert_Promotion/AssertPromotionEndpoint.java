package Assert_Promotion;

import Routes.Routes;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AssertPromotionEndpoint {
    public static Response getAsserts() {
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(Routes.baseUrlQA);
        return response;
    }
}
