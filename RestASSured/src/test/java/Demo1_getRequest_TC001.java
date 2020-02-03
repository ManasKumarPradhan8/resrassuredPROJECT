import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1_getRequest_TC001 {
@Test
	void getwhetherDetails()
	{
	System.out.println("manas");
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httprequest=RestAssured.given();
		Response response=httprequest.request(Method.GET,"/Hyerabad");
		 String responseBody=response.getBody().asString();
		 System.out.println("Response Body is"+responseBody); 
		 int  statuscode=response.getStatusCode();
		 System.out.println("status code is"+statuscode); 
		 Assert.assertEquals(statuscode,200);
		 
		 
	}
}
