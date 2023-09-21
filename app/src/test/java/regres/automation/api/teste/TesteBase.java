package regres.automation.api.teste;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

public class TesteBase {


    @BeforeClass
    public static void setup() throws Exception {
        enableLoggingOfRequestAndResponseIfValidationFails();
        baseURI = "https://reqres.in";
        basePath = "/api";

        requestSpecification = new RequestSpecBuilder()
                .setContentType("application/json").build();


        responseSpecification = new ResponseSpecBuilder()
                .expectContentType( ContentType.JSON).build();


    }



}
