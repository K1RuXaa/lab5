package commandProvider.commands;

import commandProvider.CompareSpaceMarine;
import spaceMarines.SpaceMarine;

import java.util.Collections;
import java.util.LinkedList;

/**
 * add a new element to the collection
 *
 * @param collection collection where we store SpaceMarine objects
 * @param CSM Comparator to sort
 * */
public class Add {
    public static void AddCommand(LinkedList collection, CompareSpaceMarine CSM){
        SpaceMarine sp = new SpaceMarine();
        collection.add(sp);
        Collections.sort(collection, CSM);
    }
}
