package chain;


import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import net.minidev.json.JSONObject;


public class PUT {
	
	@Test
	
	public void PUTReq(ITestContext context) {
		
		String id= (String) context.getAttribute("user_id");


		JSONObject data = new JSONObject();

		data.put("nanme", "KadirAhmad");
		data.put("active", "AbdulRazzak");
		int arr[] = { 60, 70, 80 };
		data.put("grades", arr);
		data.put("yearsOld", "60");
		data.put("colour", "red");
		
		given()
		.body(data)
		.contentType("application/json")
		.pathParam("id", id)
		
		.when()
		.put("http://localhost:3000/students/{id}")
		
		.then()
		.statusCode(200)
		.log().all();
	}

}
