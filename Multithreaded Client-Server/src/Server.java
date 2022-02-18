import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;


class QuoteService{
     Map<String,String> productinfo=new HashMap<String,String>();
    public QuoteService(){
        productinfo.put("a","100");
        productinfo.put("b","200");

    }
    public  String getQuote(String product){
        return productinfo.get(product);

    }

}
class ServiceThread extends Thread {
    Socket sock;
    public ServiceThread(Socket sock){
        this.sock=sock;

    }
    public void run(){
        try{
            InputStream in = sock.getInputStream();
            OutputStream out = sock.getOutputStream();
            System.out.println("Waiting for product information from Client");
            byte request[] = new byte[10];
            in.read(request);
            String product=new String(request).trim();
            System.out.println("Received product information from server");
            String price = QuoteService.getQuote(product);
            if(price == null){
                price="Invalid Product";

            }out.write(price.getBytes(StandardCharsets.UTF_8));
            System.out.println("Response sent");
            sock.close();


        }
        catch (Exception e){}
}
    public class Server {
        public static void main(String[] args) throws IOException {
            ServerSocket serSocket = new ServerSocket(999);
            System.out.println("Started Listening to 999");
            while (true){
                System.out.println("waiting for client");
                Socket sock = serSocket.accept();
                System.out.println("Starting a thread which services the client");
                new ServiceThread(sock).start();
            }

        }
    }}