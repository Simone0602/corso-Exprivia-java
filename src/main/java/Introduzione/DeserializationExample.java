package Introduzione;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class DeserializationExample {
    public static void main(String[] args) {
        Gson gson = new Gson();

        try(FileReader reader = new FileReader("persona.json")){
            //Deserializza l'oggetto da JSON
            // e lo riscostruisce come un oggetto Java
            Persona person = gson.fromJson(reader, Persona.class);

            System.out.println("Deserializzazione JSON completata.");
            System.out.println("Nome: " + person.getNome());
            System.out.println("Cognome: " + person.getCognome());
            System.out.println("Età: " + person.getEta());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
