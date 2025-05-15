package AllMethods;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostMethod {

	@Test
	public void Test01() {

		JSONObject data = new JSONObject();
		data.put("name", "morpheus");
		data.put("job", "leader");

		baseURI = "https://reqres.in/api/users";
		RestAssured.given().header("Content-Type", "application/json").contentType(ContentType.JSON)
				.body(data.toJSONString()).when().post().then().statusCode(201);

	}

}
