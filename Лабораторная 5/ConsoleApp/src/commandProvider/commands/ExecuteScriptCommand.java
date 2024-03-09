package commandProvider.commands;

import commandProvider.CommandManager;
import data.DataProvider;

import java.util.LinkedList;
/**
 * execute script
 * <p>
 * read and execute the script from the specified file. The script contains commands in the same form in which the user enters them interactively.
 *  */

public class ExecuteScriptCommand {
    public static void ExecuteScript(String fileName, DataProvider dp){
        LinkedList<String> lines = dp.LoadScript(fileName);
        CommandManager cm = new CommandManager();

        for(String s: lines){
            cm.CommandChecker(s);
        }
    }
}
