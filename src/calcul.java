/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Shrob
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface calcul extends Remote {
double carre(double x) throws RemoteException;
double racine(double x) throws RemoteException;
}
