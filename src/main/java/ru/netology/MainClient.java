package ru.netology;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MainClient  {
    public static void main(String[] args) throws IOException {
        String host = "127.0.0.1";
        int port = 8080;
        Socket clientSocket = new Socket(host, port);
        PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));
        writer.println("Dear user");
        String resp = reader.readLine();
        System.out.println(resp);
    }
}
