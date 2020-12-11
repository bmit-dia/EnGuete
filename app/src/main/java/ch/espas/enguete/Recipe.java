package ch.espas.enguete;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;

import org.json.JSONArray;

public class Recipe {
    long id;
    String cookTime;
    String description;
    String[] ingredients;
    String[] instructions;

    public void apiRequest() {
        AndroidNetworking.get("https://api.cookbutler.com/")
                .addPathParameter("pageNumber", "0")
                .addQueryParameter("limit", "3")
                .addHeaders("token", "1234")
                .setTag("test")
                .setPriority(Priority.LOW)
                .build()
                .getAsJSONArray(new JSONArrayRequestListener() {
                    @Override
                    public void onResponse(JSONArray response) {
                        //cooktime = response.;
                    }
                    @Override
                    public void onError(ANError error) {
                        // handle error
                    }
                });
    }
}
