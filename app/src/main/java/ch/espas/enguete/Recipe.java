package ch.espas.enguete;

import android.content.Context;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Recipe {
    Context context;

    private JSONArray getRecipes() {
        File file = new File(context.getFilesDir(), "recipes.json");

        StringBuilder text = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                text.append(line);
                text.append('\n');
            }
        } catch (IOException e) {
            //Error Handling
        }

        JSONArray jsonArray;
        try {
            jsonArray = new JSONArray(text.toString());
        } catch (Exception e) {
            jsonArray = new JSONArray();
        }
        return jsonArray;
    }
}