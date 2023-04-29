package ru.netology.postman;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class MobileBankApiTestV1 {
    @Test
    void shouldReturnEcho() {
        // Given - When - Then
        // Предусловия
        given()
            .baseUri("https://postman-echo.com")
            .body("Hello") // отправляемые данные (заголовки и query можно выставлять аналогично)
        // Выполняемые действия
        .when()
            .post("/post")
        // Проверки
        .then()
            .statusCode(200)
                .body("data", equalTo("Hello"))
        ;
    }
}
