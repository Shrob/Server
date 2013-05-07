/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Shrob
 */
public class CalculServeur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
        if (System.getSecurityManager() == null) { 
System.setSecurityManager(new RMISecurityManager()); 
} 
        LocateRegistry.createRegistry(1099);
calculImpl obj = new calculImpl();
Naming.rebind("rmi://localhost:1099/Mycalcul", obj);
System.out.println("Attente des clients");


    }
}
