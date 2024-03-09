package commandProvider;

import data.DataProvider;
import spaceMarines.SpaceMarine;

import java.util.LinkedList;

import static commandProvider.commands.Clear.ClearCommand;
import static commandProvider.commands.ExecuteScriptCommand.ExecuteScript;
import static commandProvider.commands.Head.HeadCommand;
import static commandProvider.commands.Help.HelpCommand;
import static commandProvider.commands.Add.AddCommand;
import static commandProvider.commands.History.HistoryCommand;
import static commandProvider.commands.Info.InfoCommand;
import static commandProvider.commands.Load.LoadCommand;
import static commandProvider.commands.MaxLoyal.MaxByLoyal;
import static commandProvider.commands.PrintDescending.DescendingCommand;
import static commandProvider.commands.Remove.RemoveCommand;
import static commandProvider.commands.Show.ShowCommand;
import static commandProvider.commands.UniqueWeapon.WeaponCommand;
import static commandProvider.commands.Update.UpdateCommand;
import static commandProvider.commands.Save.SaveCommand;
import static data.ObjectReader.BackParseToJson;
import static data.ObjectWriter.parseToJson;
import static spaceMarines.MyScanner.Scan;

public class CommandManager {
    private DataProvider dp = new DataProvider();
    private LinkedList<SpaceMarine> collection = new LinkedList<SpaceMarine>();
    LinkedList commandList = new LinkedList();
    CompareSpaceMarine CSM = new CompareSpaceMarine();
    public void CommandChecker(String userString){
        String[] commandToWords = userString.split(" ");
        String command = commandToWords[0];
        command.replaceAll(" ","");
        if (command.equals("help") && commandToWords.length == 1){
            HelpCommand();
            addCommand(command);
        } else if (command.equals("info") && commandToWords.length == 1) {
            InfoCommand(collection);
            addCommand(command);
        }else if (command.equals("add") && commandToWords.length == 1){
            AddCommand(collection,CSM);
            addCommand(command);
        } else if (command.equals("update") && commandToWords.length == 3) {
            UpdateCommand(collection,commandToWords);
            addCommand(command);
        } else if (command.equals("show") && commandToWords.length == 1) {
            ShowCommand(collection);
            addCommand(command);
        } else if (command.equals("clear") && commandToWords.length == 1) {
            ClearCommand(collection);
            addCommand(command);
        } else if (command.equals("remove_by_id") && commandToWords.length == 2) {
            RemoveCommand(collection,commandToWords);
            addCommand(command);
            
        } else if (command.equals("save") && commandToWords.length == 1) {
           // dp.Save(collection,SaveCommand(collection));
            parseToJson(collection,SaveCommand());
            addCommand(command);
        } else if (command.equals("load") && commandToWords.length == 1) {
            System.out.println("Введите название файла json -> SpaceMarine");
            BackParseToJson(Scan());
            addCommand(command);

        } else if (command.equals("history") && commandToWords.length == 1) {
            HistoryCommand(commandList);
            addCommand(command);
        } else if (command.equals("cls") && commandToWords.length == 1) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        } else if (command.equals("exit") && commandToWords.length == 1) {
            System.exit(0);
            addCommand(command);
        } else if (command.equals("max_by_loyal") && commandToWords.length == 1) {
            MaxByLoyal(collection);
            addCommand(command);
        } else if (command.equals("head") && commandToWords.length == 1) {
            HeadCommand(collection);
            addCommand(command);
        } else if (command.equals("print_descending") && commandToWords.length == 1) {
            DescendingCommand(collection);
            addCommand(command);

        } else if (command.equals("print_unique_weapon_type") && commandToWords.length == 1) {
            WeaponCommand(collection);
            addCommand(command);
        } else if (command.equals("execute_script") && commandToWords.length==2){
            ExecuteScript(commandToWords[1], dp);
            addCommand(command);
        } else {
            System.out.println("Такой команды нет в списке");
        }
    }


    private void addCommand(String command){
        if (commandList.size() == 7){
            commandList.removeFirst();
        }
        commandList.addLast(command);
    }
}
