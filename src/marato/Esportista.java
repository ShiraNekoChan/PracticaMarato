package marato;

import java.time.LocalDate;
import java.util.Random;

public class Esportista {
	
	/*
	 * Crearem la clase Esportista que tindrà el nom, els dos cognoms, el sexe, la seva data de naixament, dni, el club i el codi federat.
	 * 
	 */
	
	//atributs
	private String nom="";
	private String cognom1="";
	private String cognom2="";
	private char sexe=' ';
	private LocalDate dataNaix=LocalDate.now(); 
	private String dni="";
	private Club club;
	private int codi=0;
	
	//limitat a 1000 persones
	
	static private int num = 1000;
	
	/*
	 * Creearem el constructor esportista que tingui el nom, els dos cognoms, el sexe, la data de naixament, el dni, 
	 * el nom del club i el codi de federat, a més està limitat a 1000 esportistes
	 * 
	 */
	
	//constructor
	public Esportista(String nom, String cognom1, String cognom2, char sexe, LocalDate dataNaix, String dni, Club club, int codi) {
		
		this.setNom(nom);
		this.setCognom1(cognom1);
		this.setCognom2(cognom2);
		this.setSexe(sexe);
		this.setDataNaix(dataNaix);
		this.setDni(dni);
		this.setClub(club);
		this.setCodi(codi);
		
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
	
	
	
	//classificarem la categoria en absolut i veterà depenent la data de naixament.
	
	public static String Asigncategoria(LocalDate dataNaix) {
		
		String catego = " ";
		String[] categories = {"Absolut","Vetera"};
		LocalDate dataCategos = LocalDate.of(1969, 12, 31);
		
		if(dataCategos.isBefore(dataNaix)) { //si es abans
			
			catego = categories[0];
			
		}
		
		else if(dataCategos.isAfter(dataNaix)) { //si es després
			
			catego=categories[1];
		}
		
		return catego;
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
	

	public Club getClub() {
		
		return club;
		
	}
	
	public void setClub(Club club) {
		
		this.club = club;
		
	}
	
	public int getCodi() {
		
		return codi;
		
	}
	
	public void setCodi(int codi) {
		
		this.codi = codi;
		
	}
	
	/*
	 * fem el metode de modificar esportista on podrem canviar el nom, els cognoms, sexe, la data de naixament, el dni, el club i el codi
	 * 
	 */
	
	public void modificarEsportista(String nom, String cognom1, String cognom2, char sexe, LocalDate dataNaix, String dni, Club club, int codi) {
		
		setNom(nom);
		setCognom1(cognom1);
		setCognom2(cognom2);
		setSexe(sexe);
		setDataNaix(dataNaix);
		setDni(dni);
		setClub(club);
		setCodi(codi);
		
	}
	
	/*
	 * mostrarem les dades de l'esportista
	 * 
	 */
	
	public String mostrarDadesEsportista() {
		
		String text="";
		
		text= text + "nom: " + this.getNom() + "\n";
		text= text + "cognoms: " + this.getCognom1() + " "+ this.getCognom2() + "\n"; 
		text= text + "sexe: " + this.getSexe() + "\n"; 
		text= text + "dni: " + this.getDni() + "\n";
		text= text + "club: " + this.getClub() + "\n"; 
		text= text + "codi: " + this.getCodi() + "\n";
		text= text + "-----------------------------";
		
		return text; //retornem el text
		
		
	}
	

}
