package marato;

import java.time.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Participant { // ha de ser fill de Esportista no federat
	
	/*
	 * Crearem la clase participant que tindrà el Nom, els cognoms, les data de naixament, el sexe, el club i tempsprova
	 */
	
	//atributs
	private String nom="";
	private String cognom1="";
	private String cognom2="";
	private LocalDate dataNaix;
	private char sexe=' ';
	private Club club;
	private int dorsal=0;
	private LocalTime tempsProva;
	private ArrayList<Participant> participantList;
	
	
	
	//constructor
	public Participant(String nom, String cognom1, String cognom2, LocalDate dataNaix, char sexe, Club club, LocalTime tempsProva) {
		
		this.setNom(nom);
		this.setCognom1(cognom1);
		this.setCognom2(cognom2);
		this.setDataNaix(dataNaix);
		this.setClub(club);
		this.setSexe(sexe);
		this.setDorsal(participantList);
		this.setTempsProva(tempsProva);
		
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
	
	public String Asigncategoria(LocalDate dataNaix) {
		
		String catego = " ";
		String[] categories = {"Absolut","Vetera"};
		LocalDate dataCategos = LocalDate.of(1969, 12, 31);
		
		if(dataCategos.isBefore(dataNaix)) {
			
			catego = categories[0];
			
		}
		
		else if(dataCategos.isAfter(dataNaix)) {
			
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
	
	public int getDorsal() {
		
		return dorsal;
		
	}
	
	/*
	 * assignarem el dorsal als participants amb un random
	 * 
	 */
	
	public void setDorsal(ArrayList<Participant> participantList) {
		
		boolean correcte = true;
		int nouDorsal = 0;
		
		do {
			
			nouDorsal = new Random().nextInt(1000);
			
			for(int i = 0; i<participantList.size(); i++) {
				
				if(participantList.get(i).getDorsal() == nouDorsal) {
					
					correcte = false;
					
				} 
				
				else {
					
					correcte = true;
				}
			}
		} 
		
		while (!correcte);
		
		this.dorsal = nouDorsal;
	}
	
	
	public LocalTime getTempsProva() {
		
		return tempsProva;
		
	}
	
	public void setTempsProva(LocalTime tempsProva) {
		
		this.tempsProva = tempsProva;
		
	}
	

	public Club getClub() {
		
		return club;
		
	}
	
	public void setClub(Club club) {
		
		this.club = club;
		
	}
	
	
	/*
	 * compara els temps dels participants per després saber qui es classifica
	 */
	
	public static class compararTempsClassificacio implements Comparator<Participant> {

	    public int compare(Participant participant1, Participant participant2) {
	    	
	        return  participant1.getTempsProva().compareTo(participant2.getTempsProva());
	        
	    }

	}
	
	/*
	 * mostrem les dades de participant
	 * 
	 */
	
	
	public String mostrarDadesParticipant() {
		
		String text="";
		
		text= text + "nom: " + this.getNom() + "\n";
		text= text + "cognoms: " + this.getCognom1() + " "+ this.getCognom2() + "\n"; 
		text= text + "sexe: " + this.getSexe() + "\n";
		text= text + "club: " + this.getClub() + "\n"; 
		text= text + "classificacio: " + this.Asigncategoria(dataNaix) + "\n"; 
		text= text + "dorsal: " + this.getDorsal() + "\n";  
		text= text + "temps prova: " + this.getTempsProva() + "\n"; 
		text= text + "-----------------------------";
		
		return text;
		
		
	}

}
