package ttn.com.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonParser {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("name", "Shekhar");
            jsonObject.put("designation", "Software Engineer");
            JSONArray jsonArray = new JSONArray();
            jsonArray.put(15);
            jsonArray.put(20);
            jsonArray.put(30);
            jsonArray.put(50);
            jsonObject.put("listInteger", jsonArray);
            try(FileWriter fileWriter = new FileWriter("/home/sam/Desktop/Java-Bootcamps/XML/src/main/resources/test.json")) {
                fileWriter.write(jsonObject.toString());
                fileWriter.flush();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
