package marato;

import java.time.LocalDate;

public class Club {
	
	/*
	 * Crearem la clase club que tindrà el nom, població, codi Postal, any de fundació, codi Club (no es pot repetir) 
	 * i el programa està limitat a 100 clubs.
	 * 
	 */	
	
	//atributs
	
	private String nom="";
	private int cp=0;
	private int Afundacio=0;
	private int codi=0;
	
	//está limitat a 100
	
	
	//crearem el nostre constructor club que tingui el nom, el codi postal, l'any de fundació i el codi del club
	
	public Club(String nom, int cp, int Afundacio, int codi) {
		
		this.setNom(nom);
		this.setCp(cp);
		this.setAnyFundacio(Afundacio);
		this.setCodi(codi);
		
		
	}
	
	public String getNom() {
		
		return nom;
		
	}
	
	public void setNom(String nom) {
		
		this.nom = nom;
		
	}
	
	public int getCp() {
		
		return cp;
		
	}
	
	public void setCp(int cp) {
		
		this.cp = cp;
		
	}
	
	public int getAnyFundacio() {
		
		return Afundacio;
		
	}
	
	public void setAnyFundacio(int Afundacio) {
		
		this.Afundacio = Afundacio;
		
	}
	
	public int getCodi() {
		
		return codi;
		
	}
	
	public void setCodi(int codi) {
		
		this.codi = codi;
		
	}
	
	/*
	 * modificarem les dades del club com el nom, el codi postal, l'any de fundació i el codi
	 * 
	 */
	
	public void modificarClub(String nom, int cp, int Afundacio, int codi) {
		
		setNom(nom);
		setCp(cp);
		setAnyFundacio(Afundacio);
		setCodi(codi);
		
	}
	
	/*
	 * mostrem les dades del club
	 * 
	 */
	
	public String mostrarDadesClub() {
		
		String text="";
		
		text= text + "nom: " + this.getNom() + "\n";
		text= text + "codi postal: " + this.getCp() + "\n"; 
		text= text + "any fundació: " + this.getAnyFundacio() + "\n"; 
		text= text + "codi club: " + this.getCodi() + "\n";
		text= text + "-----------------------------";
		
		return text;
		
		
	}
	

}
