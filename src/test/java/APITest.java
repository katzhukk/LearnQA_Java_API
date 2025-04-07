import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class APITest {

    @Test
    public void testGetRequest(){
        Response response = RestAssured
                .get("https://playground.learnqa.ru/api/get_text")
                .andReturn();
        response.prettyPrint();
    }
}
