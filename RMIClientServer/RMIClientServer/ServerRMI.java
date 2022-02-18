/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIClientServer;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerRMI {
    public static void main(String[] args) {
        try {
        Registry reg = LocateRegistry.createRegistry(1097);
        //Registry r2 = LocateRegistry.getRegistry();
        Cal_Implement i1 = new Cal_Implement();
        reg.rebind("AddService", i1);
        //r.rebind("rmi://localhost:8080/AddService", i1);
        //r2.rebind("Add", i1);
        //Naming.rebind("rmi://localhost:5000/AddService", i1);
        System.out.println("Server is Ready ");
            
        } catch (Exception e) {
            System.out.println(e);
        }    
    }
    
}
