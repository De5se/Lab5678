package Commands;

import CollectionClasses.LabWork;

import java.util.HashSet;

public class Help extends Command {
    Command[] commands;

    public Help(Command[] commands) {
        super("help", "вывести справку по доступным командам");
        this.commands = commands;
    }

    public String execute(HashSet<LabWork> labWorks)
    {
        StringBuilder answer = new StringBuilder(this.toString() + '\n');

        for (Command command : commands) {
            answer.append(command.toString()).append('\n');
        }

        return answer.toString();
    }
}
