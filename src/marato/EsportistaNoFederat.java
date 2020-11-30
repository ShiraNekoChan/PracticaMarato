package marato;

import java.time.LocalDate;

public class EsportistaNoFederat {
	
	/*
	 * Crearem la clase EsportistaNoFederat que tindrà el nom, els dos cognoms, el sexe, la seva data de naixament i el dni.
	 * 
	 */
	
	//atributs
	private String nom="";// els atributs no s'han d'inicialitzar amb cap valor, això ho fa el constructor.
	private String cognom1="";
	private String cognom2="";
	private char sexe=' ';
	private LocalDate dataNaix=LocalDate.now(); 
	private String dni="";
	
	//limitat a 1000 persones
	
	
	/*
	 * Creearem el constructor EsportistaNoFederat que tingui el nom, els dos cognoms, el sexe, la data de naixament, el dni
	 * i a més està limitat a 1000 esportistes no federats
	 * 
	 */
	
	//constructor
	public EsportistaNoFederat(String nom, String cognom1, String cognom2, char sexe, LocalDate dataNaix, String dni) {
		
		this.setNom(nom);
		this.setCognom1(cognom1);
		this.setCognom2(cognom2);
		this.setSexe(sexe);
		this.setDataNaix(dataNaix);
		this.setDni(dni);
		
	}
	
	//getters i setters
	
	public String getNom() {
		
		return nom;
		
	}
	
	public void setNom(String nom) {
		
		this.nom = nom;
		
	}
	
	public String getCognom1() {
		
		return cognom1;
		
	}
	
	public void setCognom1(String cognom1) {
		
		this.cognom1 = cognom1;
		
	}
	
	public String getCognom2() {
		
		return cognom2;
		
	}
	
	public void setCognom2(String cognom2) {
		
		this.cognom2 = cognom2;
		
	}
	
	public char getSexe() {
		
		return sexe;
		
	}
	
	
	public void setSexe(char sexe) {
		
		this.sexe = sexe;
		
	}
	
	/*
	 * El retornar sexe el que farà serà  que si es H és home, si es D és dona
	 * i si es qualsevol altre cosa ens sortirà desconegut.
	 * 
	 */
	
	public String retornarSexe() {
		
		String sexeS="";
		
		if(sexe=='H') { //si es h=home
			
			sexeS = "Home";
			
		}
		
		else if(sexe=='D') { //si es d=dona 
			
			sexeS = "Dona";
			
		}
		
		else {
			
			sexeS = "Desconegut";
			
		}
		
		return sexeS;

	}
	
	public LocalDate getDataNaix() {
		
		return dataNaix;
		
	}
	
	
	public void setDataNaix(LocalDate dataNaix) {
		
		this.dataNaix = dataNaix;
		
	}
	
	public String getDni() {
		
		return dni;
		
	}
	
	public void setDni(String dni) {
		
		this.dni = dni;
		
	}
	
	/*
	 * mostrem les dades de l'esportista no federat
	 * 
	 */
	
	public String mostrarDadesEsportistaNoFederat() {
		
		String text="";
		
		text= text + "nom: " + this.getNom() + "\n";
		text= text + "cognoms: " + this.getCognom1() + " "+ this.getCognom2() + "\n"; 
		text= text + "sexe: " + this.getSexe() + "\n"; 
		text= text + "dni: " + this.getDni() + "\n";
		text= text + "data: " + this.getDataNaix() + "\n"; 
		text= text + "-----------------------------";
		
		return text;
		
		
	}
	
	
}