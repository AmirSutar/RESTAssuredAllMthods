package AllMethods;

public class AuthenticationAuthorization {
	
	
/*
	 * Authentication and authorization are two fundamental concepts in REST API security, and although they sound similar, they serve different purposes.

Authentication is the process of verifying the identity of the client or user making the API request. It answers the question: “Who are you?”
In REST API testing, authentication ensures that the request is coming from a trusted source. Common methods include Basic Authentication, Bearer Tokens, API keys, and OAuth 2.0.

Authorization, on the other hand, determines whether the authenticated user has permission to perform a specific action or access a particular resource. It answers: “What are you allowed to do?”
For example, a user may be authenticated but still not authorized to access admin-level APIs or delete records.

🧠 Key Differences:
Feature	Authentication	Authorization
Purpose	Verifies identity	Grants access to resources
Question Answered	"Who are you?"	"What can you do?"
Comes First?	Yes	After authentication
Failure Code	401 Unauthorized	403 Forbidden

🔍 Example in REST Assured:
java
Copy
Edit
// Authentication
given()
    .header("Authorization", "Bearer " + token)
.when()
    .get("/users/123")
.then()
    .statusCode(200); // If authorized
If the token is missing or invalid → 401 Unauthorized

If the token is valid but access is restricted → 403 Forbidden
	 */

}
