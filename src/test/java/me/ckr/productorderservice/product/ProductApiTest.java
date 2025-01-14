package me.ckr.productorderservice.product;

import io.restassured.RestAssured;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import me.ckr.productorderservice.ApiTest;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * packageName : me.ckr.productorderservice.product
 * fileName    : ProductServiceTest
 * author      : ckr
 * date        : 25. 1. 9.
 * description :
 */

class ProductApiTest extends ApiTest {

    @Test
    void 상품등록() {
        final AddProductRequest request = 상품등록요청_생성();
        final ExtractableResponse<Response> response = 상품등록요청(request);

        assertEquals(HttpStatus.CREATED.value(), response.statusCode());
    }

    private static ExtractableResponse<Response> 상품등록요청(final AddProductRequest request) {
        return RestAssured.given().log().all()
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .body(request)
            .when()
            .post("/products")
            .then()
            .log().all().extract();
    }

    private static AddProductRequest 상품등록요청_생성() {
        final String name = "상품명";
        final int price = 1000;
        final DiscountPolicy discountPolicy = DiscountPolicy.NONE;
        return new AddProductRequest(name, price, discountPolicy);
    }
}
