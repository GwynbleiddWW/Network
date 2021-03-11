package ru.netology;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8080);
        Socket clientSocket = serverSocket.accept(); //
        PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        System.out.println("New connection accepted");
        final String name = reader.readLine();
        writer.println(String.format("Hi, %s, your port is %d!", name, clientSocket.getPort()));
    }
}
