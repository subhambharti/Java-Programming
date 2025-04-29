// 89.	Write a program to implement a simple chat application using sockets.

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("Server started. Waiting for client...");
        Socket socket = serverSocket.accept();
        System.out.println("Client connected.");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        String message;
        while (true) {
            message = in.readLine();
            if (message.equalsIgnoreCase("bye")) break;
            System.out.println("Client: " + message);

            System.out.print("You: ");
            String reply = keyboard.readLine();
            out.println(reply);
            if (reply.equalsIgnoreCase("bye")) break;
        }

        socket.close();
        serverSocket.close();
        System.out.println("Chat ended.");
    }
}
