package marato;

import java.time.*;
import java.util.ArrayList;

public class Marato {//ha de ser fill de prova
	
	/*
	 * Crearem la clase marato que tindrà el codi de la marato, la data i la hora de sortida
	 */
	
	//atributs
	private int codiMarato=0; // els atributs no s'han d'inicialitzar amb cap valor, això ho fa el constructor.
	protected ArrayList<Participant> participant;
	private LocalDate data;
	private LocalTime horaSortida;
	
	//contructor
	public Marato(int codiMarato, LocalDate data, LocalTime horaSortida) {
		
		this.setCodiMarato(codiMarato);
		this.setllistatParticipants(participant);
		this.setData(data);
		this.setHoraSortida(horaSortida);

	}
	
	//setters i getters
	public int getCodiMarato() {
		
		return codiMarato;
		
	}
	
	public void setCodiMarato(int codiMarato) {
		
		this.codiMarato = codiMarato;
		
	}
	
	public ArrayList<Participant> getllistatParticipants() {
		
		return participant;
		
	}
	
	public void setllistatParticipants(ArrayList<Participant> participant) {
		
		this.participant = participant;
		
	}
	
	public LocalDate getData() {
		
		return data;
		
	}
	
	public void setData(LocalDate data) {
		
		this.data = data;
		
	}
	
	public LocalTime getHoraSortida() {
		
		return horaSortida;
		
	}
	
	public void setHoraSortida(LocalTime horaSortida) {
		
		this.horaSortida = horaSortida;
		
	}
	
	/*
	 * afegim els participants a la marató fins a 150
	 * 
	 */
	public void afegirParticipantMarato(Participant participant) {
		
		if(!(this.participant.size() > 150)) {
			
			this.participant.add(participant);
			
		}
		
		else {
			
			System.out.print("Ja hi son tots els participants");
			
		}
		
	}
	
	/*
	 * modifiquem les dades de la marató
	 * 
	 */
	
	public void modificarMarato(int codiMarato, LocalDate data, LocalTime horaSortida) {
		
		setCodiMarato(codiMarato);
		setllistatParticipants(participant);
		setData(data);
		setHoraSortida(horaSortida);
		
	}
	
	public void tempsMarato(LocalTime horaSortida) {
		
		setHoraSortida(horaSortida);
		
	}
	
	/*
	 * mostrem les dades de la marato
	 * 
	 */
	
	public String mostrarDadesMarato() {
		
		String text="";
		
		text= text + "codi marató: " + this.getCodiMarato() + "\n";
		text= text + "participants: " + this.getllistatParticipants() + "\n"; 
		text= text + "data: " + this.getData() + "\n"; 
		text= text + "hora sortida: " + this.getHoraSortida() + "\n";
		text= text + "-----------------------------";
		
		return text;
		
		
	}
	

}
