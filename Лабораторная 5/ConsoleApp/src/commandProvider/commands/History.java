package commandProvider.commands;

import java.util.LinkedList;
/**
 *display last 6 commands
 *
 * @param list collection where we store last 6 commands
 * */
public class History {
    public static void HistoryCommand(LinkedList list){
        for (int i =0; i < list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
