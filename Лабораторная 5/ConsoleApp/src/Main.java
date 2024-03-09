import commandProvider.CommandManager;

import static commandProvider.commands.Help.HelpCommand;
import static spaceMarines.MyScanner.Scan;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CommandManager server = new CommandManager();
        HelpCommand();
        while (true){
            server.CommandChecker(Scan());
        }

    }
}