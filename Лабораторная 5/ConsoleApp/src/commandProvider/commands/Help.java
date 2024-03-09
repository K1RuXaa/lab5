package commandProvider.commands;
/**
 * display help on available commands
 * */
public class Help {
    public static void HelpCommand(){
        System.out.println("\n====================\n");

        System.out.println("help - доступные команды");
        System.out.println("info - информация о коллекции");
        System.out.println("show - вывод всей коллекции");
        System.out.println("add - добавить новый элемент в коллекцию");
        System.out.println("update id {element} - обновить значение элемента по id");
        System.out.println("remove_by_id id - удалить элемент из коллекции по его id");
        System.out.println("clear - очистить коллекцию");
        System.out.println("save - сохранить коллекцию в файл");
        System.out.println("execute_script file_name - считать и исполнить скрипт"); // LAST
        System.out.println("exit - завершить программу (без сохранения в файл)");
        System.out.println("head - вывести первый элемент коллекции"); // можно еще по дате сделать кстати
        System.out.println("remove_lower {element} - удалить из коллекции все элементы, меньшие, чем заданный");
        System.out.println("history - вывести последние 7 команд");
        System.out.println("max_by_loyal - вывести любой объект из коллекции, значение поля loyal которого является максимальным");
        System.out.println("print_descending - вывести элементы коллекции в порядке убывания"); // надо определиться по какому параметру сравнивать
        System.out.println("print_unique_weapon_type - вывести уникальные значения поля weaponType всех элементов в коллекции");
        System.out.println("load - загрузить файл");
        System.out.println("cls - очистка консоли");
        System.out.println("\n====================\n");
    }
}
