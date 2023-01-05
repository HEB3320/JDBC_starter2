package RestPractice;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.containsString;

public class RestApiDemo1 {

    String url = "https://cybertekschool.com/program/";

    /*
        when I send a request to url -> http://cybertekchicago.com/instructor/all
        And I want to make sure that the response format is JSON
        And I want to test that response contains "instructors"
     */

    @Test
    public void instructorsTest() {
//with().accept(ContentType.JSON).
//        when().post(url)
//                .then().statusCode(200).log().all();
    }

}
