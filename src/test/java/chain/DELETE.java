package chain;

import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class DELETE {

		@Test

		public void DeleteReq(ITestContext context) {
			
			String id= (String) context.getAttribute("user_id");

			given().contentType("application/json")
			.pathParam("id", id)

					.when()
					.delete("http://localhost:3000/students/{id}")

					.then().statusCode(200).log().all();
		}
	}

