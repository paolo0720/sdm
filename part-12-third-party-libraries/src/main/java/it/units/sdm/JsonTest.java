package it.units.sdm;

import org.json.JSONObject;

public class JsonTest {
    static void main() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("pi", 3.14);
        jsonObject.put("a", new int[] {1, 2, 3});
        IO.println(jsonObject.toString());
    }
}
