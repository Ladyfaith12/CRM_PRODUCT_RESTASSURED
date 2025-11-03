package Login;

import io.github.cdimascio.dotenv.Dotenv;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
    public static String accessToken;

    @Test
    public void loginTest(){
        Dotenv dotenv = Dotenv.configure()
                .directory("/Users/user78/Desktop/CRM_PRODUCT/src")
                .load();

        String username = dotenv.get("username");
        String password = dotenv.get("password");



        //create payload
        LoginPayload payload = new LoginPayload();
        payload.setUsername(username);
        payload.setPassword(password);

        Response response =  LoginEndpoint.login(payload);


        accessToken = response.jsonPath().getString("access_token");
        String token_type = response.jsonPath().getString("token_type");
        String expires_in = response.jsonPath().getString("expires_in");

        //custom assetions
        System.out.println(accessToken);
        Assert.assertEquals(token_type,"bearer", "Token type should be bearer");
        Assert.assertEquals(expires_in,"7200", "Token should expire in 7200 seconds");


    }
}
