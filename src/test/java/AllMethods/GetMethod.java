package AllMethods;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class GetMethod {

	@Test(priority = 1)

	public void Test01() {

		given()

				.when().get("https://reqres.in/api/users?page=2")

				.then().body("page", equalTo(2)).statusCode(200).log().all();
	}

	@Test(priority = 2)

	public void CreateUser() {
		HashMap data = new HashMap();
		data.put("name", "Amir");
		data.put("job", "Lead");

		given().contentType("application/json").body(data).header("x-api-key", "reqres-free-v1")

				.when()

				.post("https://reqres.in/api/users")

				.then().statusCode(201).log().all();

	}
}
