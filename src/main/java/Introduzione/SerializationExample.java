package Introduzione;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class SerializationExample {
    public static void main(String[] args) {
        Persona person = new Persona("Simone", "D'Amato", 20);

        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter("persona.json")){
            //Serializza l'oggetto in formato JSON e
            // lo scrive in un file "persona.json"
            gson.toJson(person, writer);
            System.out.println("Serializzazione JSON completata.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
