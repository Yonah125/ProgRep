package Modele;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Hashtable;


public class PenduImpl extends UnicastRemoteObject implements PenduInter {
	
	public PenduImpl() throws RemoteException {
		super();
	}

	@Override
	public Pendu initPartie() throws RemoteException {

		ArrayList<String> ListeMots = new ArrayList<String>(); 
		ListeMots.add("Chaise");
		ListeMots.add("Table");
		ListeMots.add("Rouge");
		ListeMots.add("Pierre");
		ListeMots.add("Tableau");
		
		
		int rand = (int)(Math.random() * ListeMots.size());
		String Mot = ListeMots.get(rand);	
		Mot = Mot.replaceAll(".(?=.)", "$0 ").trim();
		String MotEnvoye="";
		for(int i=0;i<(Mot.length()/2)+1;i++) {
			MotEnvoye=MotEnvoye+"_ ";
		}
		Pendu P = new Pendu(11,Mot,MotEnvoye);
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
				if(P.getMotEnvoye().charAt(i)!='_') 
					MotE = MotE+P.getMotEnvoye().charAt(i);
				else
					MotE= MotE+"_";
		}
		}
		if(!Find)
			P.setChance(P.getChance()-1);
		P.setMotEnvoye(MotE);
		P.getList().add(c);
		return P;
	}

	@Override
	public boolean winCheck(Pendu P) throws RemoteException {
		if(!P.getMotEnvoye().contains("_"))
			return true;
		return false;
	}
	

}
