
package RMIClientServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Cal_Implement extends UnicastRemoteObject implements Cal_Interface{

    public Cal_Implement() throws RemoteException {
        super();
    }
    
    @Override
    public int calculate(int a, int b, int choice) throws Exception {
        int result = 0;
        switch (choice) {
            case 0:
                result = a + b;
                break;
            case 1:
                result = a * b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a / b;
                break;
            default:
                System.out.println("Please Select Valid Number 1-4");
        }
        return result;
    }
    
}
