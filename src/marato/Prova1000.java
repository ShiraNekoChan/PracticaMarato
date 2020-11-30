package marato;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Prova1000 {//ha de ser fill de prova

	/*
	 * Crearem la clase prova1000 que tindrà el codi de la prova, club anfitrio, ubicacio, la data i la hora de sortida
	 * 
	 */
	
	//atributs
	private int codiProva1000=0;// els atributs no s'han d'inicialitzar amb cap valor, això ho fa el constructor.
	protected ArrayList<Participant> participant;
	private String clubAnfitrio="";
	private String ubicacio="";
	private LocalDate data;
	private LocalTime horaSortida;
	
	//constructor
	public Prova1000(int codiProva1000, String clubAnfitrio, String ubicacio, LocalDate data, LocalTime horaSortida) {
		
		this.setCodiProva1000(codiProva1000);
		this.setllistatParticipants(participant);
		this.setUbicacio(ubicacio);
		this.setClubAnfitrio(clubAnfitrio);
		this.setData(data);
		this.setHoraSortida(horaSortida);

	}
	
	public int getCodiProva1000() {
		
		return codiProva1000;
		
	}
	
	public void setCodiProva1000(int codiProva1000) {
		
		this.codiProva1000 = codiProva1000;
		
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
	
	public String getClubAnfitrio() {
		
		return clubAnfitrio;
		
	}
	
	public void setClubAnfitrio(String clubAnfitrio) {
		
		this.clubAnfitrio = clubAnfitrio;
		
	}
	
	public String getUbicacio() {
		
		return ubicacio;
		
	}
	
	public void setUbicacio(String ubicacio) {
		
		this.ubicacio = ubicacio;
		
	}
	
	/*
	 * afegim els participants a la prova fins a 50
	 * 
	 */
	
	public void afegirParticipantProva1000(Participant participant) {
		
		if(!(this.participant.size() > 50)) {
			
			this.participant.add(participant);
			
		}
		
		else {
			
			System.out.print("Ja hi son tots els participants");
			
		}
		
	}
	
	/*
	 * modifiquem les dades de la prova1000
	 * 
	 */
	
	public void modificarProva1000(int codiProva1000, String clubAnfitrio, String ubicacio, LocalDate data, LocalTime horaSortida) {
		
		setCodiProva1000(codiProva1000);
		setllistatParticipants(participant);
		setUbicacio(ubicacio);
		setClubAnfitrio(clubAnfitrio);
		setData(data);
		setHoraSortida(horaSortida);
		
	}
	
	public void tempsProva1000(LocalTime horaSortida) {
		
		setHoraSortida(horaSortida);
		
	}
	
	/*
	 * mostrem les dades de la prova1000
	 * 
	 */
	
	public String mostrarDadesProva1000() {
		
		String text="";
		
		text= text + "codi prova1000: " + this.getCodiProva1000() + "\n";
		text= text + "participants: " + this.getllistatParticipants() + "\n"; 
		text= text + "club anfitrio: " + this.getClubAnfitrio() + "\n";
		text= text + "ubicacio: " + this.getUbicacio() + "\n"; 
		text= text + "data: " + this.getData() + "\n"; 
		text= text + "hora sortida: " + this.getHoraSortida() + "\n";
		text= text + "-----------------------------";
		
		return text;
		
		
	}
	
}
