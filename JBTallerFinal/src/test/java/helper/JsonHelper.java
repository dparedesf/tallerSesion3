
package helper;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonHelper {

    public static JSONObject convertToJSON(String json) throws JSONException {
        JSONObject jsonObject= new JSONObject(json);
        return jsonObject;
    }

    public static String getJSONValue(JSONObject json,String property) throws JSONException {
        String value=json.get(property).toString();
        return value;
    }

}
