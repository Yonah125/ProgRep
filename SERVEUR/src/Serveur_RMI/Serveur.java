package Serveur_RMI;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

import Modele.PenduImpl;

public class Serveur {
	 public static void main(String[] argv) {
		  try {
		   int port = 8000;
		   LocateRegistry.createRegistry(port);
		   Naming.rebind("rmi://localhost:8000/Jeux", new PenduImpl());
		   System.out.println("Server pret !.");
		  } catch (Exception e) {
		   System.out.println(" Server echec" + e);
		  }
		 }
	}
