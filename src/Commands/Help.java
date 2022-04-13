package Commands;

public class Help extends AbstractCommand {
    AbstractCommand[] commands;


    public Help(AbstractCommand[] commands) {
        super("help", "вывести справку по доступным командам");
        this.commands = commands;
    }

    public void execute()
    {
        System.out.println(this.toString());

        for (AbstractCommand command : commands) {
            System.out.println(command.toString());
        }
    }
}
