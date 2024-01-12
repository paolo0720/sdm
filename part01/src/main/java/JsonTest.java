import org.json.JSONObject;

public class JsonTest {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("pi", 3.14);
        jsonObject.put("a", new int[] {1, 2, 3});
        System.out.println(jsonObject.toString());
    }
}
