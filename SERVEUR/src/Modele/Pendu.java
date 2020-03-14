package Modele;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Pendu implements Serializable {
	int Chance;
	String Mot;
	List<Character> list = new ArrayList<Character>();
	String MotEnvoye;
	
	public Pendu(int chance, String mot, String motEnvoye) {
		super();
		this.Chance = chance;
		this.Mot = mot;
		this.MotEnvoye = motEnvoye;
	}


	public int getChance() {
		return Chance;
	}
	
	
	public List<Character> getList() {
		return list;
	}


	public void setList(List<Character> list) {
		this.list = list;
	}


	public void setChance(int chance) {
		Chance = chance;
	}

	public String getMot() {
		return Mot;
	}

	public void setMot(String mot) {
		Mot = mot;
	}

	public String getMotEnvoye() {
		return MotEnvoye;
	}

	public void setMotEnvoye(String motEnvoye) {
		MotEnvoye = motEnvoye;
	}
	
	
	
	
	
	

}
