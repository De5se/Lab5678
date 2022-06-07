package Client;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleManager {
    private final ClientCommandManager commandManager;
    private final BufferedReader keyboard;

    public ConsoleManager()  {
        keyboard = new BufferedReader(new InputStreamReader(System.in));
        commandManager = new ClientCommandManager();
    }

    public void StartInteractiveMod(){
        try {
            while (true){
                System.out.println("Введите команду:");
                String[] commandType = keyboard.readLine().split(" ", 2);

                if(commandType[0].equals("clear")){
                    System.out.println("Вам недоступна эта команда");
                    continue;
                }

                if(commandType[0].equals("execute_script")){
                    executeScript(commandType);
                }
                else commandManager.processingCommand(commandType);

            }
        }
        catch (IOException ex){
            System.out.println("Введите help если не знаете комманд");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Введена пустая строка");
            ex.printStackTrace();
        }
    }

    public void executeScript(String[] finalUserCommand){
        try {
            BufferedReader inputStreamReader = new BufferedReader(new InputStreamReader(new FileInputStream(finalUserCommand[1])));
            String fileCommand = inputStreamReader.readLine();
            while (fileCommand!=null){
                String[] finalFileCommand = fileCommand.trim().split(" ",2);
                System.out.println("Обработка комманды" + finalFileCommand[0]);

                if(finalFileCommand[0].equals("execute_script"))
                    System.out.println("Невозможно выполнить комманду");

                commandManager.processingCommand(finalFileCommand);
            }
        }
        catch(IOException ex){
            System.out.println("Проблема при считывании");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("В файле неверная комманда");
        }

    }
}
