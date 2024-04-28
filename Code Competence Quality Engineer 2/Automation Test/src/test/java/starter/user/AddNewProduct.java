package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class AddNewProduct {

    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for add new product")
    public String setApiAddNewProduct(){
        return url + "products";
    }

    @Step("I send request to add new product with valid credential \\({string}, price = {double} , {string}, {string}, {string})")
    public void sendRequestAddNewProduct(String title, double price, String description, String image, String category){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", title);
        requestBody.put("price", price);
        requestBody.put("description", description);
        requestBody.put("image", image);
        requestBody.put("category", category);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer ")
                .body(requestBody.toString())
                .post(setApiAddNewProduct());
    }

    @Step("I receive valid data for created new product with id 21")
    public void receiveNewProduct(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.ADD_NEW_PRODUCT_SCHEMA);
        restAssuredThat(response -> response.body("id",equalTo(21)));
        restAssuredThat(response -> response.body("title",equalTo("test product")));
        restAssuredThat(response -> response.body("title",equalTo("test product")));
        restAssuredThat(response -> response.body("price",equalTo(13.5f)));
        restAssuredThat(response -> response.body("description",equalTo("lorem ipsum set")));
        restAssuredThat(response -> response.body("image",equalTo("https://i.pravatar.cc")));
        restAssuredThat(response -> response.body("category",equalTo("electronic")));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }


}
