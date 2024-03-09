package data;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import spaceMarines.SpaceMarine;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class ObjectReader {
    public static LinkedList<SpaceMarine> BackParseToJson(String fileName){
        LinkedList<SpaceMarine> spaceMarines = new LinkedList<>();
        ObjectMapper mapper = new ObjectMapper();

        try {
             spaceMarines = mapper.readValue(new File(fileName), new TypeReference<LinkedList<SpaceMarine>>() {});
            System.out.println("Загрузка завершена");

        }catch (IOException e){
            System.out.println(e.getMessage());


        }
        return spaceMarines;
    }
}
