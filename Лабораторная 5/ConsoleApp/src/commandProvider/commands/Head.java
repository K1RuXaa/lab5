package commandProvider.commands;

import spaceMarines.SpaceMarine;

import java.util.LinkedList;
/**
 * show the first element of the collection
 *
 * @param collection collection where we store SpaceMarine objects
 * */
public class Head {
    public static void HeadCommand(LinkedList<SpaceMarine> collection){
        for (SpaceMarine sp : collection){
            System.out.println(sp);
        }
    }
}
