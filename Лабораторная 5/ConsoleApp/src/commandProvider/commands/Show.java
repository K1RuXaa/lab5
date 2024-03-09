package commandProvider.commands;

import java.util.LinkedList;


public class Show {
    public static void ShowCommand(LinkedList collection){
        for (Object o : collection) {
            System.out.println(o);
            System.out.println();
        }
    }
}
