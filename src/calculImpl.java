/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class calculImpl extends UnicastRemoteObject implements calcul {
private int result;
// Constructeur
public calculImpl() throws RemoteException { }

// ImplÃ©mentation des mÃ©thodes distantes
public double carre(double x) throws RemoteException {
return 
Math.pow(x,2);}
public double racine(double x) throws RemoteException {
return Math.pow(x,0.5);
}
}
