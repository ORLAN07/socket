package com.rnx;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    private static int PORT = 9000;

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(PORT);
        Socket socket = null;

        DataInputStream dataInputStream = null;
        DataOutputStream dataOutputStream = null;

        while(true){

            socket = serverSocket.accept();
            System.out.println("listen to client 1");

            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());

            System.out.println("in put: " + dataInputStream.readUTF());
            dataOutputStream.writeUTF("Server Orlando on Port 9000");
            socket.close();
        }
    }
}
