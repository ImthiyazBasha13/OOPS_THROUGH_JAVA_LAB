import java.rmi.*;
import java.rmi.Naming.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.net.*;
import java.util.*;


public class mathServer extends UnicastRemoteObject implements
        mathInterface
{
    public mathServer() throws RemoteException
    {
        System.out.println("Initializing Server");
    }
    public int add(int a,int b)
    {
        return(a+b);
    }
    public int subt(int a,int b)
    {
        return(a-b);
    }
    public int mult(int a,int b)
    {
        return(a*b);
    }
    public int div(int a,int b)
    {
        return(a/b);
    }
    public static void main(String args[])
    {System.setProperty("java.rmi.server.hostname","192.168.1.2");


        try
        {
            mathServer ms=new mathServer();
            java.rmi.Naming.rebind("MathServ",ms);
            System.out.println("Server Ready");
        }
        catch(RemoteException | MalformedURLException RE){}

    }
}
