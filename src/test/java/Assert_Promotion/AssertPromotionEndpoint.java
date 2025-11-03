package Assert_Promotion;

import Routes.Routes;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


import static Login.LoginTest.accessToken;
import static Login.LoginTest.employeeID;
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
    public static Response getRegions() {
        Response response = given()
                .contentType(ContentType.JSON)
                .header("Authorization","Bearer "+ accessToken)
                .when()
                .get(Routes.getRegions);
        return response;
    }
    public static Response getUpcomingAuctions() {
        Response response = given()
                .contentType(ContentType.JSON)
                .header("Authorization","Bearer "+ accessToken)
                .when()
                .get(Routes.getUpcomingAuctions);
        return response;
    }
    public static Response getEmployeeInfo() {
        Response response = given()
                .contentType(ContentType.JSON)
                .pathParams("employee_Id",employeeID)
                .header("Authorization","Bearer "+ accessToken)
                .when()
                .get(Routes.getEmployeeInfo);
        return response;
    }

}
