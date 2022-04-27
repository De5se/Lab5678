package Client;

import Commands.Command;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class SendCommand {
    private Socket socket;
    private DataInputStream inputStream;
    private DataOutputStream outputStream;
    private ObjectOutputStream objectOutputStream;

    public SendCommand() {
        try {
            socket = new Socket("localhost",1090);

            inputStream = new DataInputStream(socket.getInputStream());
            outputStream = new DataOutputStream(socket.getOutputStream());
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        }
        catch (UnknownHostException ex){
            System.out.println("Неверное значение порта");
        }
        catch (IOException ex){
            System.out.println("Сервер закрыт, попробуйте позже");
            System.exit(1);
        }

    }

    public void Sender(Command command){
        try {
            objectOutputStream.writeObject(command);
            objectOutputStream.flush();

            System.out.println(inputStream.readUTF());
        }
        catch (SocketException ex){
            System.out.println("Сервер отключен");
        }
        catch (IOException ex){
            System.out.println("Невозможна отправка");
        }
    }
}
