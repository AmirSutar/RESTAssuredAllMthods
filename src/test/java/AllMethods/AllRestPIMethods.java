package AllMethods;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class AllRestPIMethods {
	int id;

	//---------------------------------------------------------------------------------------
	@Test(priority = 1)
	public void GetUser() {

		given()

				.when().get("https://reqres.in/api/users?page=2")

				.then().body("page", equalTo(2)).statusCode(200).log().all();
	}

	//---------------------------------------------------------------------------------------

	
	
	@Test(priority = 2)
		public void CreateUser() {
		HashMap data = new HashMap();
		data.put("name", "Amir");
		data.put("job", "Lead");

		id = given().contentType("application/json").body(data).header("x-api-key", "reqres-free-v1")

				.when()

				.post("https://reqres.in/api/users").jsonPath().getInt("id");

	}
	//---------------------------------------------------------------------------------------


	@Test(priority = 3, dependsOnMethods = ("CreateUser"))

	public void UpdateUser() {
		HashMap data = new HashMap();
		data.put("name", "Roshni");
		data.put("job", "TL");

		given().contentType("application/json").body(data).header("x-api-key", "reqres-free-v1")

				.when()

				.put("https://reqres.in/api/users/" + id).then().statusCode(200).log().all();

	}
	//---------------------------------------------------------------------------------------
	
	@Test(priority = 4, dependsOnMethods = ("CreateUser"))

	public void 	DeleteUser() {
		
		given().contentType("application/json").header("x-api-key", "reqres-free-v1")

				.when()
				.delete("https://reqres.in/api/users/" + id)

				.then().statusCode(204).log().all();

	}

}
