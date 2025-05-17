package AllMethods;

public class API_Chaining {
	
	
	/*✅ Interview Answer: What is API Chaining?
			API Chaining refers to the practice of using the output (response) of one API request as the input (request data) for another API. It is commonly used in automated REST API testing or real-world API workflows where multiple dependent calls are needed to complete a transaction or flow.

			🧠 Why is API Chaining Important?
			Simulates real-world workflows (like login → get profile → update profile).

			Ensures data dependencies between API calls are correctly handled.

			Helps validate end-to-end integration between API layers.

			🔄 Example Scenario:
			Let’s say we’re testing a student management API.

			POST /students → Create a student and get the student ID.

			GET /students/{id} → Use the ID to retrieve the student details.

			DELETE /students/{id} → Use the same ID to delete the student.

			Here, the ID from the first request is chained into the second and third requests.

			🧪 Example using RestAssured (Java):
			java
			Copy
			Edit
			@Test
			void testAPIChaining() {
			    // Step 1: Create student
			    JSONObject data = new JSONObject();
			    data.put("name", "Amir");
			    data.put("age", 24);

			    Response response = given()
			        .contentType("application/json")
			        .body(data.toString())
			    .when()
			        .post("http://localhost:3000/students")
			    .then()
			        .statusCode(201)
			        .extract().response();

			    // Step 2: Extract student ID from response
			    int id = response.path("id");

			    // Step 3: Use ID in a GET request
			    given()
			    .when()
			        .get("http://localhost:3000/students/" + id)
			    .then()
			        .statusCode(200)
			        .body("name", equalTo("Amir"));

			    // Step 4: Use ID to delete the student
			    given()
			    .when()
			        .delete("http://localhost:3000/students/" + id)
			    .then()
			        .statusCode(200);
			}
			📌 In Summary:
			API Chaining is when the response from one API is used as input for another.

			It is critical for realistic test flows, especially in end-to-end testing.

			Common in tools like RestAssured, Postman, and JMeter.*/



}
