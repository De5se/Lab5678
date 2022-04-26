package Server;

import Commands.*;

import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;

public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3390);
            Socket client = serverSocket.accept();

            DataInputStream inputStream = new DataInputStream(client.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());
            ObjectInputStream objectInputStream = new ObjectInputStream(client.getInputStream());
            ServerCollectionManager serverCollectionManager = new ServerCollectionManager(System.getenv("JAVA_HOME"));

            System.out.println("Подключился новый пользователь");

            while (!client.isClosed()){
                Command command = (Command) objectInputStream.readObject();

                if (command.getName().equals("exit")){
                    outputStream.writeUTF("Отключение клиента");
                    break;
                }

                outputStream.writeUTF(serverCollectionManager.ExecuteCommand(command));
                outputStream.flush();

                if(client.isClosed()){
                    break;
                }

            }
            objectInputStream.close();
            inputStream.close();
            outputStream.close();
            client.close();

        }
        catch (IOException e) {
            System.out.println("Невозможно создать сервер");

        }
        catch (ClassNotFoundException ex){
            System.out.println("Не удалось найти класс");

        }


    }
}