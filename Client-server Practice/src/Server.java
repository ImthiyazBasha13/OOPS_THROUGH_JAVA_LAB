import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Server connectetd");
        Socket socket = serverSocket.accept();
        System.out.println("Client connectetd");
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
         byte buffer[]= new byte[1024];
         in.read(buffer);
         System.out.println("Recieved from Client"+new String(buffer).trim());
        System.out.println("Type text");
        Scanner scanner = new Scanner(System.in);
        String Text = scanner.nextLine();

        out.write(Text.getBytes(StandardCharsets.UTF_8));
         socket.close();
         serverSocket.close();

    }
}
