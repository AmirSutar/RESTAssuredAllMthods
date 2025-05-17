package AllMethods;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CookiesTest {
	
	
	
@Test

	void Cookies()

	{	
	// This should fail as everytime coockies will be diffrent
		given()
		
		
		.when()
		.get("https://www.google.com/")
		
		.then()
		.cookie("AEC", "AVcja2deFpwDjgk4ZppRKQwr_X79NDIeBIm42FPvnc1I85R9GSj-79jXoEQ")
		.log().all();
	}
@Test

void GetCookies()

{	
// This should return response
	Response res = given()
	
	
	.when()
	.get("https://www.google.com/");
	
	System.out.println("Capturing specific coockie : ");
	String Coockie_value = res.getCookie("AEC");
	System.out.println("AEC--> " + Coockie_value);
	
	
	System.out.println("Capturing All coockie : ");
	
	Map<String, String> All_Coockeis=  res.getCookies();	
	
	for (String k : All_Coockeis.keySet())
	{
		String  Cookie_value = res.getCookie(k);
		System.out.println(k + "--> " + Cookie_value);
	}
	
	
	
}
}
