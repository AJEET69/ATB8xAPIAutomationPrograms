package com.thetestingacademy;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Get_TestNG {

    @Test
    public void Test_Get_Request(){

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/1")
                .when()
                .get()
                .then().log().all()
                .statusCode(200);


    }







}
