import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    public static void main (String [] args) throws IOException, UnknownHostException {
        Socket socket= new Socket("127.0.0.1",9999);
        System.out.println("Connected");

        InputStream in =socket.getInputStream();
        OutputStream out = socket.getOutputStream();

        System.out.println("Type text");
        Scanner scanner = new Scanner(System.in);
        String Text = scanner.nextLine();

        out.write(Text.getBytes(StandardCharsets.UTF_8));
        byte[] response = new byte[1024];
        in.read(response);
        System.out.println("Recieved from Server"+new String(response).trim());
        socket.close();

    }
}
