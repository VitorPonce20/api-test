package Service;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Service {
    RestAssured restAssured = new RestAssured();

    public void get(String url){
        Response response = (Response) given()
                .header("Accept", "Aplication/json")
                .when()
                .get(url)
                .then().extract().response();

    }

    public void post(String url, String payload){

        Response response = given()
                .header("Accept", "Application/json")
                .when()
                .body(payload)
                .post()
                .then().extract().response();

    }

    public void put(String url, String payload){
        Response response = given()
                .header("Accept", "Application/json")
                .when()
                .body(payload)
                .put(url)
                .then().extract().response();

    }
    public void delete(String url, String body){

    }

}
