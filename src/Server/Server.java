package Server;

import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;

public class Server {
    private static final int PORT = 1090;

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");

        try {
            ServerCollectionManager collectionManager = new ServerCollectionManager();
            DatabaseHandler dataBaseHandler = new DatabaseHandler("jdbc:postgresql://localhost:1093/studs","---","---");
            dataBaseHandler.readDataBase(collectionManager.getLabWorks());
            ServerSocket serverSocket=new ServerSocket(PORT);
            new ServerCommands();

            System.out.println("Сервер запущен");

            try {
                while (true){
                    Socket client = serverSocket.accept();
                    System.out.println("Присоединился новый пользователь");
                    System.out.println("Данные нового пользователя " + client.getInetAddress());
                    new AddClient(client, collectionManager.getLabWorks(), dataBaseHandler);
                }
            }
            catch (IOException ex){
                System.out.println("Ошибка присоединения нового пользователя");
            }
            finally {
                serverSocket.close();
            }
        }
        catch (IOException ex){
            System.out.println("Сервер не может быть запущен. Порт занят");
            System.exit(1);
        }

    }
}