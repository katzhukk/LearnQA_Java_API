import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class Exercise7 {

    @Test
    public void testLongRedirect() {

        String locationHeader;
        String url = "https://playground.learnqa.ru/api/long_redirect";
        int statusCode = 0;

        while(statusCode != 200)
        {
            Response response = RestAssured
                    .given()
                    .redirects()
                    .follow(false)
                    .when()
                    .get(url)
                    .andReturn();

            locationHeader = response.getHeader("Location");
            System.out.println(locationHeader);
            url = locationHeader;
            statusCode = response.getStatusCode();
            System.out.println(statusCode);
        }
    }
}
