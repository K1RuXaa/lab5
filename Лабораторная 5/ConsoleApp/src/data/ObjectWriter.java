package data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import spaceMarines.SpaceMarine;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class ObjectWriter {
    public static void parseToJson(LinkedList<SpaceMarine> collection,String fileName){
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
        mapper.setDateFormat(new StdDateFormat().withColonInTimeZone(true));


        try {
            // Преобразуем коллекцию в JSON и записываем в файл

            // Java object to JSON file
            mapper.writeValue(new File(fileName), collection);

            System.out.println("Объект успешно записан в файл " + fileName);
        } catch (IOException e) {
            // Обработка исключения, если что-то пошло не так при записи
            System.out.println("Ошибка в названии файла");
        }
    }
}
