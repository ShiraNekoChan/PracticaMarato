package marato;

import java.time.LocalDate;
import java.util.ArrayList;

public class Prova {
	
	/*
	 * Crearem la clase prova que tindrà el Nom, any, participants (llistat de participants),
	 * Codi Prova (amb el format AAAAPPPP on A és l’any i P és un nombre assignat seqüencialment exemple: 20200001 )
	 */
	
	//atributs
	
	private String nom="";
	private int any=0; 
	protected ArrayList<Participant> participant;
	private int codiProva=0;
	
	
	public Prova(String nom, int any, int codiProva) {
		
		this.setNom(nom);
		this.setAny(any);
		this.setllistatParticipants(participant);
		this.setcodiProva(codiProva);
		
		
	}
	
	public String getNom() {
		
		return nom;
		
	}
	
	public void setNom(String nom) {
		
		this.nom = nom;
		
	}
	
	public int getAny() {
		
		return any;
		
	}
	
	public void setAny(int any) {
		
		this.any = any;
		
	}
	//utilitzarem l'array de participants
	
	public ArrayList<Participant> getllistatParticipants() {
		
		return participant;
		
	}
	
	public void setllistatParticipants(ArrayList<Participant> participant) {
		
		this.participant = participant;
		
	}
	
	public int getcodiProva() {
		
		return codiProva;
		
	}
	
	public void setcodiProva(int codiProva) {
		
		this.codiProva = codiProva;
		
	}
	
	/*
	 * generarem el codi de la prova que sigui sequencialment amb l'any i sumant el num 
	 * 
	 */
	
	static int generarCodiProva() {
		
		String sequenciaStr = "";
		int any = LocalDate.now().getYear();
		int sequencia = 1;
		
		if (sequencia > 1000) {
			
			sequenciaStr = sequencia + "";
			
		} 
		
		else if(sequencia > 100) {
			
			sequenciaStr = "0" + sequencia;
			
		}
		
		else if(sequencia > 10) {
			
			sequenciaStr = "00" + sequencia;
			
		}
		
		else if(sequencia > 0) {
			
			sequenciaStr = "000" + sequencia;
		}
			
		String codiProvaStr = "" + any + Integer.parseInt(sequenciaStr);
		
		int codiProva = Integer.parseInt(codiProvaStr);
		
		return codiProva;
		
	}
	
	/*
	 * mostrarem les dades de la prova
	 * 
	 */
	
	public String mostrarDadesProva() {
		
		String text="";
		
		text= text + "nom: " + this.getNom() + "\n";
		text= text + "any: " + this.getAny() + "\n"; 
		text= text + "llistat participants: " + this.getllistatParticipants() + "\n"; 
		text= text + "codi prova: " + this.getcodiProva() + "\n";
		text= text + "-----------------------------";
		
		return text;
		
		
	}
	

}
