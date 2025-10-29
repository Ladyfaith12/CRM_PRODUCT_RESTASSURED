package Login;

import Routes.Routes;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;

public class LoginEndpoint {
    public static Response login(LoginPayload payload) {
        Response response = given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post(Routes.login);
        return response;
    }


}
