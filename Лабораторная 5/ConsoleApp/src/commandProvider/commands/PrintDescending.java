package commandProvider.commands;

import spaceMarines.SpaceMarine;

import java.util.Collections;
import java.util.LinkedList;

import static commandProvider.commands.Show.ShowCommand;
/**
 * changes the sorting algorithm in descending order
 * */
public class PrintDescending {
    public static void DescendingCommand(LinkedList<SpaceMarine> collection){
        Collections.reverse(collection);
        ShowCommand(collection);
    }
}
