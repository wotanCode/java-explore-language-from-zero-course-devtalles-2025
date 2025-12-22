package com.wotancode.jsonpractice;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (
                FileReader jsonReader = new FileReader("person.json");
                FileReader schemaReader = new FileReader("person-schema.json")
        ) {
            // 🔹 Leer el JSON como una lista de objetos `Person`
            Type personListType = new TypeToken<List<Person>>() {}.getType();
            List<Person> people = gson.fromJson(jsonReader, personListType);

            // 🔹 Convertir la lista de objetos `Person` a JSON en String
            String peopleJson = gson.toJson(people);

            // 🔹 Cargar el esquema JSON como JSONObject
            JSONObject schemaObject = new JSONObject(new JSONTokener(schemaReader));

            // 🔹 Cargar el esquema desde el JSONObject
            Schema schema = SchemaLoader.load(schemaObject);

            // 🔹 Convertir el JSON String de la lista a JSONArray
            JSONArray peopleJsonArray = new JSONArray(peopleJson);

            // 🔹 Validar el JSONArray contra el esquema
            schema.validate(peopleJsonArray);

            System.out.println("✅ JSON válido según el esquema.");
        } catch (Exception e) {
            System.out.println("❌ JSON inválido: " + e.getMessage());
        }
    }
}
