package AllMethods;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class QuerryPathParameter {
	
	
	@Test
	

	void QueryPath()

	{	
	//https://reqres.in/api/users?page=2
		given()
		.pathParam("mypath", "users")
		.queryParam("page","2")
		
		.when()
		.get("https://reqres.in/api/{mypath}")
		
		.then()
		.statusCode(200)
		.log().all();		
		
	}

}
