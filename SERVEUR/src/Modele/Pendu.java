package Modele;

import java.io.Serializable;
public class Pendu implements Serializable {
	int Chance;
	String Mot;
	String MotEnvoyé;
	
	public Pendu(int chance, String mot, String motEnvoyé) {
		super();
		this.Chance = chance;
		this.Mot = mot;
		this.MotEnvoyé = motEnvoyé;
	}


	public int getChance() {
		return Chance;
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

	public String getMotEnvoyé() {
		return MotEnvoyé;
	}

	public void setMotEnvoyé(String motEnvoyé) {
		MotEnvoyé = motEnvoyé;
	}
	
	
	
	
	
	

}
