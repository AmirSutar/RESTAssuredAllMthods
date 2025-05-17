package AllMethods;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HeadersTest {
	
	
@Test

	void Heades()

	{	
	// This should fail as everytime coockies will be diffrent
		given()
		
		.when()
		.get("https://www.google.com/")
		
		.then()
		.header("Content-Type", "text/html; charset=ISO-8859-1")
		.header("server", "gws")
		.header("Content-Encoding", "gzip")
		//.cookie("AEC", "AVcja2deFpwDjgk4ZppRKQwr_X79NDIeBIm42FPvnc1I85R9GSj-79jXoEQ")
		.log().all();
	}

@Test

void PrintHeder()

{	

	Response res = given()
	
	.when()
	.get("https://www.google.com/");
	
	String Val_Cont_Type = res.getHeader("Content-Type");
	System.out.println("Content type is -- >" + Val_Cont_Type );
}

@Test

void PrintAllHeder()

{	

	Response res = given()
	
	.when()
	.get("https://www.google.com/");
	
	Headers All_Headers = res.getHeaders();
	
	for(Header hd : All_Headers)
	{
		System.out.println(hd.getName() + "--->" + hd.getValue());
	}
	
}
	
	


}