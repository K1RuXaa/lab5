package commandProvider.commands;

import data.DataProvider;
import spaceMarines.SpaceMarine;

import java.util.LinkedList;


import static spaceMarines.MyScanner.Scan;

public class Load { // реализация в DataProvider
    public static LinkedList<SpaceMarine> LoadCommand(DataProvider dp){
        System.out.print("Введите имя файл, который хотите загрузить ");
        return dp.Load(Scan());
    }
}
