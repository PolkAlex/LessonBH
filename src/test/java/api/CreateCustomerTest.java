package api;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateCustomerTest extends BaseTest{

    @Test
    public void successCreateCustomer() {
        given().
                auth().oauth2(getBearerToken()).
                header("Content-Type", "application/json").
                body("{\n" +
                        "\t\"name\": \"Jenny Rosen\",\n" +
                        "\t\"email\": \"jennyrosen@example.com\"\n" +
                        "}").
        when().
                post("https://api.stripe.com/v1/customers").
        then().
                log().all().
                statusCode(200);
    }
}
