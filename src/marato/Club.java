package marato;

import java.time.LocalDate;

public class Club {
	
	/*
	 * Crearem la clase club que tindr� el nom, poblaci�, codi Postal, any de fundaci�, codi Club (no es pot repetir) 
	 * i el programa est� limitat a 100 clubs.
	 * 
	 */	
	
	//atributs
	
	private String nom=""; // els atributs no s'han d'inicialitzar amb cap valor, aix� ho fa el constructor.
	private int cp=0;
	private int Afundacio=0;
	private int codi=0;
	
	//est� limitat a 100
	
	
	//crearem el nostre constructor club que tingui el nom, el codi postal, l'any de fundaci� i el codi del club
	
	public Club(String nom, int cp, int Afundacio, int codi) {
		
		this.setNom(nom); // no �s del tot correcte, est�s cridant una funci� per assignar valor a un atribut, a m�s la clausula this es fa servir quan el nom de l'atribut i el nom del par�metre de la funci� s�n el mateix en el cas que fas servir seria "this.nom=nom;"
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
	 * modificarem les dades del club com el nom, el codi postal, l'any de fundaci� i el codi
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
		text= text + "any fundaci�: " + this.getAnyFundacio() + "\n"; 
		text= text + "codi club: " + this.getCodi() + "\n";
		text= text + "-----------------------------";
		
		return text;
		
		
	}
	

}
