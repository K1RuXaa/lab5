package commandProvider.commands;

import spaceMarines.SpaceMarine;


import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.LinkedList;

/**
 * display information
 * <p>
 * display information about the collection to standard output
 *
 * @param collection collection where we store SpaceMarine objects
 * */
public class Info {
    private ZonedDateTime Date;
    public static void InfoCommand(LinkedList<SpaceMarine> collection){
        System.out.println("Коллекция LinkedList<SpaceMarine>");
        System.out.println("Размер коллекции: "+ String.valueOf(collection.size()));
     /*   if(collection.size()>0) {
            LocalDateTime maxDate = collection.get(0).getCreationDate();

            for (SpaceMarine sp : collection) {
                if (maxDate.isBefore(sp.getCreationDate())) {
                    maxDate = sp.getCreationDate();
                }
            }
            System.out.println("Дата последнего изменения коллекции: "+maxDate);
        }

        System.out.println("Кол-во элементов: "+collection.size());
*/
    }
}
