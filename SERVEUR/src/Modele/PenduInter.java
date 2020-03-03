package Modele;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PenduInter extends Remote {
	Pendu initPartie() throws RemoteException;
	Pendu lettreFind(Pendu P, char c) throws RemoteException;
	boolean winCheck(Pendu P) throws RemoteException;


}
