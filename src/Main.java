import Commands.CommandManager;

public class Main {

    private static CommandManager commandManager = new CommandManager();

    public static void main(String[] args) {
        String fileName = "C:\\Users\\VID\\IdeaProjects\\5lab\\collection.csv";
        commandManager.startProggram(fileName);
    }
}
