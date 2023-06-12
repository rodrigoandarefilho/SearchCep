package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Adress;

import java.io.FileWriter;
import java.io.IOException;

public class File {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public void saveInJson(Adress newAdress) throws IOException {
        FileWriter fileWriter = new FileWriter(newAdress.getZipCode() + ".json");
        gson.toJson(newAdress, fileWriter);
        fileWriter.close();
    }
}
