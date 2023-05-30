package crudtest;

import io.restassured.response.Response;
import org.junit.Test;
import testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetToken extends TestBase {
    public String getToken;
    @Test
    public void authToken()
    {
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        Response response = given().
                baseUri("https://restful-booker.herokuapp.com").
                contentType("application/json").
                body(payload).
                when().
                post("/auth").
                then().
                log().all().
                extract().response();
        getToken = response.jsonPath().getString("token");
        System.out.println("Token :" + getToken);
    }
}

