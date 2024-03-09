package commandProvider.commands;

import spaceMarines.SpaceMarine;

import java.util.LinkedList;
/**
 * clear collection
 *
 * @param collection collection where we store SpaceMarine objects
 * */
public class Clear {
    public static void ClearCommand(LinkedList<SpaceMarine> collection){ // мб без <>
        collection.clear();
        System.out.println("Коллекция очищена");
    }
}
