package commandProvider.commands;

import spaceMarines.SpaceMarine;

import java.util.LinkedList;
/**
 * show one element which have @param loyal == true
 * */
public class MaxLoyal { // работает, но выводиться только первый элемент, а не любой мб надо доработать
    public static void MaxByLoyal(LinkedList<SpaceMarine> collection) {
        boolean flag = true;
        for (SpaceMarine sp : collection) {
            boolean loyalty = sp.isLoyal();
            if (loyalty) {
                System.out.println(sp);
                flag = false;
                break;
            }
        }if (flag){
            System.out.println("В Космических дозорных нет верных десантников)");
        }
    }
}
