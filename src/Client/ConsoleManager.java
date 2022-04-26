package Client;

import java.util.Scanner;

public class ConsoleManager {
    private final ClientCommandManager commandManager;

    public ConsoleManager()  {
        commandManager = new ClientCommandManager();
    }

    public void StartInteractiveMod(){
        try {
            System.out.println("Введите команду:");
            Scanner scanner = new Scanner(System.in);

            while (true){
                String commandType = scanner.nextLine();
                String[] finalComamnd = commandType.trim().split(" ",2);

                commandManager.SendCommand(finalComamnd);
            }
        } catch (NullPointerException ex){
            System.out.println("Сервер умер");
        }
    }
}
