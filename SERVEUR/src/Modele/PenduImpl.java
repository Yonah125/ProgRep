package Modele;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable;


public class PenduImpl extends UnicastRemoteObject implements PenduInter {
	
	public PenduImpl() throws RemoteException {
		super();
	}

	@Override
	public Pendu initPartie() throws RemoteException {
		String Mot = "Test";
		String MotEnvoye="";
		for(int i=0;i<Mot.length();i++) {
			MotEnvoye=MotEnvoye+"_";
		}
		Pendu P = new Pendu(10,Mot,MotEnvoye);
		return P;
		
		
	}
	@Override
	public Pendu lettreFind(Pendu P, char c) throws RemoteException {
		String Mot = P.getMot();
		String MotE="";
		boolean Find = false;
		for(int i=0; i<Mot.length();i++) {
			if(Character.toUpperCase(c)==Character.toUpperCase(Mot.charAt(i))) {
				MotE = MotE+c;
				Find = true;}
			else {
				if(P.getMotEnvoyé().charAt(i)!='_') 
					MotE = MotE+P.getMotEnvoyé().charAt(i);
				else
					MotE= MotE+'_';
		}
		}
		if (Find == false)
			P.setChance(P.getChance()-1);
		P.setMotEnvoyé(MotE);
		return P;
	}

	@Override
	public boolean winCheck(Pendu P) throws RemoteException {
		if(!P.getMotEnvoyé().contains("_"))
			return true;
		return false;
	}
	

}
