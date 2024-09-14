package Service;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Service {


    public Response get(String url){
        return  given()
                .header("Accept", "Aplication/json")
                .when()
                .get(url)
                .then().extract().response();

    }

    public Response post(String url, String payload){

        return given()
                .header("Accept", "Application/json")
                .when()
                .body(payload)
                .post()
                .then().extract().response();

    }

    public Response put(String url, String payload){
        return given()
                .header("Accept", "Application/json")
                .when()
                .body(payload)
                .put(url)
                .then().extract().response();

    }
    public Response delete(String url, String body){


        return null;
    }

}
