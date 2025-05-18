package chain;

import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import net.minidev.json.JSONObject;

public class POST {

	@Test
	public void POSTReq(ITestContext context) {

		JSONObject data = new JSONObject();

		data.put("name", "AbdulRazzak");
		data.put("active", "AbdulRazzak");
		int arr[] = { 80, 90, 100 };
		data.put("grades", arr);
		data.put("yearsOld", "65");
		data.put("colour", "pink");
		
		//int id = 0;
		
		
		String id = given()
		           .body(data)
		           .contentType("application/json")
		
	           	.when()
		        .post("http://localhost:3000/students")
		        .jsonPath().getString("id");
		
		//.then()
	//	.statusCode(201)
	//	.log().all();
		 System.out.println("ID IS---> " + id);
	    	context.setAttribute("user_id", id);
	    	System.out.println("ID IS---> " + id);
	    	
		

	}

}
