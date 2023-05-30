package crudtest;

import org.junit.Test;
import testbase.TestBase;

import static io.restassured.RestAssured.given;

public class DeleteTest extends TestBase {
    @Test
    public void test001() {
        given().
                baseUri("https://restful-booker.herokuapp.com").
                contentType("application/json").
              //  header("Cookie", "token=" + new GetToken().getToken).
                log().all().
                when().
                delete("/booking/10").then().log().all().statusCode(201);
    }

}


