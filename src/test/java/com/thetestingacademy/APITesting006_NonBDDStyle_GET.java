package com.thetestingacademy;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting006_NonBDDStyle_GET {

   static RequestSpecification r = RestAssured.given();

    @Severity(SeverityLevel.CRITICAL)
    @Description("TC1 - NonBDDStyleGet- Positive TestCase")
    @Test
    public void Test_NonBDDStyle_Positive(){
        //RequestSpecification r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/388620");
        r.when().log().all().get();
        r.then().log().all().statusCode(200);
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("TC2 - NonBDDStyleGet - Negative TestCase")
    @Test
    public void Test_NonBDDStyle_Negative() {
       // RequestSpecification r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/-1");
        r.when().log().all().get();
        r.then().log().all().statusCode(404);
    }
}
