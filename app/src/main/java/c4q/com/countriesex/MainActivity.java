package c4q.com.countriesex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "This Is A Country";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSONObject countryObjects = new JSONObject();

        try {
            countryObjects.put("Countries", new JSONArray()

                    .put(new JSONObject()
                            .put("BD", "Bangleadesh"))

                    .put(new JSONObject()
                            .put("BE", "Belgium"))

                    .put(new JSONObject()
                            .put("BF", "Burkina Faso"))

                    .put(new JSONObject()
                            .put("BG", "Bulgaria"))

                    .put(new JSONObject()
                            .put("BA", "Bosnia"))

                    .put(new JSONObject()
                            .put("BB", "Barbados"))

                    .put(new JSONObject()
                            .put("WF", "Wallis and Futana"))

                    .put(new JSONObject()
                            .put("BL", "Saint Bartelemyh"))

                    .put(new JSONObject()
                            .put("BM", "Bermuda"))
                    .put(new JSONObject()
                    .put("BN", "Brunei"))

                    .put(new JSONObject()
                    .put("BO","Bolivia"))

            );
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
