import java.rmi.Remote;
import java.rmi.RemoteException;

interface mathInterface extends Remote
{
    public int add(int a,int b) throws RemoteException;
    public int subt(int a,int b) throws RemoteException;
    public int mult(int a,int b) throws RemoteException;
    public int div(int a,int b) throws RemoteException;
}
