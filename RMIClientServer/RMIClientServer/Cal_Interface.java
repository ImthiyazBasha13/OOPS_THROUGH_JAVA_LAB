/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIClientServer;

import java.rmi.Remote;


public interface Cal_Interface extends Remote{
    public int calculate(int x, int y, int choice) throws Exception;
    
}
