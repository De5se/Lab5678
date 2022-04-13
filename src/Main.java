import Commands.CommandManager;

public class Main {

    private static CommandManager commandManager = new CommandManager();

    public static void main(String[] args) {
        String fileName;

        if (args.length == 0){
            fileName = "";
        }
        else{
            fileName = args[0];
        }
        commandManager.startProggram(fileName);
    }
}
