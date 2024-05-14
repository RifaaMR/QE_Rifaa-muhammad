package starter.hooks;

import io.cucumber.java.Before;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class BeforeRegisterHook {
    @Before(value = "@Register")
    public static void beforeTest() {
        String email = "eve.holt@reqres.in";
        String password = "pistol";

        JSONObject requestBody = new JSONObject();

        requestBody.put("email", email);
        requestBody.put("password", password);

        String filePath = "src/test/resources/sample/user.json";

        try {
            String jsonString = requestBody.toString();

            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(jsonString);
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
