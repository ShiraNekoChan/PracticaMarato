package marato;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class MarxaPopular {
	
	/*
	 * Crearem la clase marxaPopular que tindrà el codi de la marxa, la ubicacio, la data i la hora de sortida
	 */

	//atributs
	private int codiMarxa=0;
	protected ArrayList<Participant> participant;
	private String ubicacio="";
	private LocalDate data;
	private LocalTime horaSortida;
	
	//constructor
	public MarxaPopular(int codiMarxa, String ubicacio, LocalDate data, LocalTime horaSortida) {
		
		this.setCodiMarxa(codiMarxa);
		this.setUbicacio(ubicacio);
		this.setllistatParticipants(participant);
		this.setData(data);
		this.setHoraSortida(horaSortida);

	}
	
	//getters i setters
	
	public int getCodiMarxa() {
		
		return codiMarxa;
		
	}
	
	public void setCodiMarxa(int codiMarxa) {
		
		this.codiMarxa = codiMarxa;
		
	}
	

	
	public LocalDate getData() {
		
		return data;
		
	}
	
	public void setData(LocalDate data) {
		
		this.data = data;
		
	}
	
	public ArrayList<Participant> getllistatParticipants() {
		
		return participant;
		
	}
	
	public void setllistatParticipants(ArrayList<Participant> participant) {
		
		this.participant = participant;
		
	}
	
	public LocalTime getHoraSortida() {
		
		return horaSortida;
		
	}
	
	public void setHoraSortida(LocalTime horaSortida) {
		
		this.horaSortida = horaSortida;
		
	}
	
	
	public String getUbicacio() {
		
		return ubicacio;
		
	}
	
	public void setUbicacio(String ubicacio) {
		
		this.ubicacio = ubicacio;
		
	}
	
	
	/*
	 * afegim els participants mirant el club
	 * 
	 */
	
	public void afegirParticipantMarxaPopular(Participant participant) {
		
		if(!(participant.getClub().equals(null))) {
			
			this.participant.addAll(this.participant);
			
		}
		
	}
	
	/*
	 * modifiquem les dades de la marxa popular com el codi, ubicacio, data, hora de sortida
	 * 
	 */
	
	public void modificarMarxaPopular(int codiMarxa, String ubicacio, LocalDate data, LocalTime horaSortida) {
		
		setCodiMarxa(codiMarxa);
		setUbicacio(ubicacio);
		setllistatParticipants(participant);
		setData(data);
		setHoraSortida(horaSortida);
		
	}
	
	public void tempsMarxaPopular(LocalTime horaSortida) {
		
		setHoraSortida(horaSortida);
		
	}
	
	
	/*
	 * mostrarem les dades de la marxa popular
	 * 	
	 */
	
	public String mostrarDadesMarxaPopular() {
		
		String text="";
		
		text= text + "codi marxa popular: " + this.getCodiMarxa() + "\n";
		text= text + "Esportistes no Federats: " + this.getllistatParticipants() + "\n"; 
		text= text + "ubicacio: " + this.getUbicacio() + "\n"; 
		text= text + "data: " + this.getData() + "\n"; 
		text= text + "hora sortida: " + this.getHoraSortida() + "\n";
		text= text + "-----------------------------";
		
		return text;
		
		
	}

}
