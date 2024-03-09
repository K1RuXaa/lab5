package commandProvider.commands;

import spaceMarines.SpaceMarine;

import java.util.LinkedList;

import static spaceMarines.MyScanner.Scan;

public class Save { //реализация будет в DataProvider тут парсер надо
    public static String SaveCommand(){
        System.out.println("Введите название файла");
        String fileName = Scan();
        fileName.replaceAll(" ", "");
        return fileName;

    }
}
