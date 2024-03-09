package commandProvider.commands;

import spaceMarines.SpaceMarine;

import java.util.LinkedList;


public class Update {
    public static void UpdateCommand(LinkedList<SpaceMarine> collection, String[] commandToWords){

            try {
                boolean isId = true;
                int cmId = Integer.parseInt(commandToWords[2]);
                for (SpaceMarine obj : collection){
                    if (cmId == obj.getId()){
                        obj.setId();
                        System.out.println("Значение обновлено! Новое значение: " + String.valueOf(obj.getId()));
                        isId = false;
                    }
                }
                if (isId == true){
                    System.out.println("Значения с таким id нет");
                }
            }catch (NumberFormatException e){
                System.out.println("Ошибка ввода id");
            }
        }
    }
