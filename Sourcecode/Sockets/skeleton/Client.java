package plain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class Client {
    public final static int PORT = 18201;
    private BufferedReader reader;
    private PrintWriter writer;
    private boolean terminated = false;
    private final int SLEEP_TIME = 1000;

    void start() throws IOException {
        Socket socket = new Socket("localhost", PORT);
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        writer = new PrintWriter(socket.getOutputStream());

        // sender thread
        Thread sender = new Thread(() -> {
            System.out.println(terminated);
            sendMessage(writer, "Hello");
            while (!terminated) {
                try {
                    Thread.sleep(SLEEP_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                sendMessage(writer, String.valueOf(new Random().nextInt()));
            }
        });
        sender.start();

        // receiver thread
        Thread receiver = new Thread(() -> {
            while (!terminated) {
                try {
                    System.out.println(receiveMessage(reader));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        receiver.start();

        /*
            terminate client
         */
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        sendMessage(writer, "END");
        terminated = true;
        scanner.close();
        // socket.close();
        try {
            receiver.join();
            sender.join();
        } catch (InterruptedException e) {
            System.out.println("Could not join threads \n" + e.getMessage());
        }
    }

    public static void sendMessage(PrintWriter writer, String message) {
        System.out.println(message);
        writer.print(message + "\r\n");
        writer.flush();
    }

    public static String receiveMessage(BufferedReader reader) throws IOException {
        return reader.readLine();
    }

    /*
        private methods
     */
    private void terminate() {
        terminated = true;
    }
}
