package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class UpdateProductData {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for update product data")
    public String setApiUpdateProductData() {
        return url + "products/7";
    }

    @Step("I send request to update product data with valid credential")
    public void sendUpdateProductData() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "test product");
        requestBody.put("price", 13.5);
        requestBody.put("description", "lorem ipsum set");
        requestBody.put("image", "https://i.pravatar.cc");
        requestBody.put("category", "electronic");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(setApiUpdateProductData());

    }

    @Step("I receive valid data for updated product in cart")
    public void receiveValidUpdatedProduct() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_PRODUCT_DATA_CART);
        restAssuredThat(response -> response.body("title",is("test product")));
        restAssuredThat(response -> response.body("price",is(13.5f)));
        restAssuredThat(response -> response.body("description",is("lorem ipsum set")));
        restAssuredThat(response -> response.body("image",is("https://i.pravatar.cc")));
        restAssuredThat(response -> response.body("category",is("electronic")));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
