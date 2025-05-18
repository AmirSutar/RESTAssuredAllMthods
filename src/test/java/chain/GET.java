package chain;

import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class GET {

	@Test

	public void GETReq(ITestContext context)  {
		String id= (String) context.getAttribute("user_id");
		System.out.println("GET received ID: " + id);
		
		given().contentType("application/json")
		        .pathParam("id", id)
				
				.when()
				.get("http://localhost:3000/students/{id}")

				.then().statusCode(200).log().all();
	}

}
