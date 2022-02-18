import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws UnknownHostException, IOException{
        System.out.println("Connecting to server...");
        Socket sock = new Socket("127.0.0.1",999);
        System.out.println("connected to Server");
        System.out.println("Enter product name");
        Scanner scanner= new Scanner(System.in);
        String product = scanner.nextLine();
        InputStream in=sock.getInputStream();
        OutputStream out=sock.getOutputStream();
        System.out.println("sending info ");
        out.write(product.getBytes(StandardCharsets.UTF_8));
        byte[] response = new byte[10];
        in.read(response);
        String strResponse = new String(response).trim();
        System.out.println("obtained response "+strResponse);
        sock.close();
    }
}
