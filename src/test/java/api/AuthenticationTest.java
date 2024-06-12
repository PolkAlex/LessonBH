package api;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class AuthenticationTest extends BaseTest {

    @Test
    public void successAuth() {
        given().
                auth().oauth2(getBearerToken()).
        when().
                get("https://api.stripe.com/v1/charges").
        then().
                log().all().
                statusCode(200).
                body("url", equalTo("/v1/charges"));
    }
}
