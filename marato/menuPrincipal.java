package marato;

import java.time.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import marato.*;


public class menuPrincipal {
	
	static Scanner lector = new Scanner(System.in);
	
	//creem un conjunt d'array lists per guardar les dades
	public static ArrayList<Esportista> esportistaList = new ArrayList<Esportista>();
	public static ArrayList<EsportistaNoFederat> esportistaNoFederatList = new ArrayList<EsportistaNoFederat>();
	public static ArrayList<Club> clubList = new ArrayList<Club>();
	public static ArrayList<Prova> provaList = new ArrayList<Prova>();
	public static ArrayList<MarxaPopular> marxaPopularList = new ArrayList<MarxaPopular>();
	public static ArrayList<Marato> maratoList = new ArrayList<Marato>();
	public static ArrayList<Prova1000> prova1000List = new ArrayList<Prova1000>();
	public static ArrayList<Participant> participantList = new ArrayList<Participant>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		menu();
		
	}
	
	/*
	 * menu principal on estaran els diferents menus
	 * 
	 */
	
	public static int menu() {
		
		int opcio=-1;
		String sortir="";
		
		
		while(!sortir.equalsIgnoreCase("Sortir")) {
			
			System.out.print("Vols entrar a Dades(1), Inscripció(2), Proves(3) o Sortir(4)? ");
			opcio=lector.nextInt();
			lector.nextLine();
		
			switch(opcio) {
			
			case 1:
				
				menuDades();
				break;
				
			case 2:
			
				menuInscripcio();
				break;
				
			case 3:
			
				menuProves();
				break;
				
			case 4:
			
				//surt
				sortir="sortir";
				break;
				
			}
			
		}
			
		
		return opcio;
		
	}
	
	/*
	 * menu de les dades con hi estaràn les altes, consultes, modificacions
	 * 
	 */
	
	public static int menuDades() {
		
		int opcio=-1;
		String sortir="";
		
		
		while(!sortir.equalsIgnoreCase("Sortir")) {
			
			System.out.print("Vols entrar a Altes(1), Consultes(2), Modificar(3) o Sortir(4)? ");
			opcio=lector.nextInt();
			lector.nextLine();
		
			switch(opcio) {
			
			case 1:
				
				altaDeportista(); 
				altaClub();
				altaProva();
				break;
				
			case 2:
			
				consultaClub();
				consultaProva();
				consultaEsportista();
				//consultes
				break;
				
			case 3:
				modificacioEsportista();
				modificacioProva();
				//modificació
				break;
				
			case 4:
			
				//surt
				sortir="sortir";
				break;

			
			}
		
		}
		
		return opcio;
		
	}
	
	/*
	 * menu de inscripcio on podrem inscriure, anular i llistar
	 * 
	 */
	
	public static int menuInscripcio() {
		
		int opcio=-1;
		String sortir="";
		
		
		while(!sortir.equalsIgnoreCase("Sortir")) {
			
			System.out.print("Vols entrar a Inscriure(1), Anul·lar Inscripció(2), Llistar Inscripcions(3) o Sortir(4)? ");
			opcio=lector.nextInt();
			lector.nextLine();
		
			switch(opcio) {
			
			case 1:
				
				//incriure
				inscripcioProva();
				break;
				
			case 2:
			
				//anul·lació
				AnulInscripcio();
				break;
				
			case 3:

				//llistarInscripcions
				llistarInscripcions();
				break;
				
			case 4:
			
				//surt
				sortir="sortir";
				break;

			
			}
		
		}
		
		return opcio;
		
	}
	
	/*
	 * menu proves on podrem entrar el temps, posar l'arribada dels participants i veure les diferents classificacions
	 * 
	 */
	
	public static int menuProves() {
		
		int opcio=-1;
		String sortir="";
		
		
		while(!sortir.equalsIgnoreCase("Sortir")) {
			
			System.out.print("Vols entrar a Entrada Temps(1), Entrada Arribada Participants(2), Classificació Total(3), Classificació Sexe(4), Classificació categoria(5) o Sortir(6)? ");
			opcio=lector.nextInt();
			lector.nextLine();
		
			switch(opcio) {
			
			case 1:
				
				//entrada temps
				entradaTemps();
				break;
				
			case 2:
			
				//arribadaParticipants
				arribadaParticipants();
				break;
				
			case 3:

				//classificacioTotal
				classTotal();
				break;
				
			case 4:

				//classificacioSexe
				classSexe();
				break;
				
			case 5:

				//classificacioCategoria
				classCategoria();
				break;
				
			case 6:
			
				//surt
				sortir="sortir";
				break;

			
			}
		
		}
		
		return opcio;
		
	}
	
	
	//demanem les dades
	
	public static void altaDeportista() {
		
		System.out.print("Pots escriure el teu nom? ");
		String nom=lector.nextLine();
		
		System.out.print("Escriure el teu primer i segon cognom. ");
		String cognom1=lector.nextLine();
		String cognom2=lector.nextLine();
		
		System.out.print("Quin es teu sexe? (H o D) ");
		String sexe=lector.nextLine();
		
		System.out.print("Escriu la teva data de naixament. ");
		System.out.print("Escriu el dia. ");
		int d=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu el mes. ");
		int m=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu l'any. ");
		int a=lector.nextInt();
		lector.nextLine();
		
		LocalDate any = LocalDate.of(d,m,a); //ho guardem tot en el localdate
		
		System.out.print("Pots escriure el teu dni? ");
		String dni=lector.nextLine();
		
		System.out.print("Pots el codi Federat? ");
		int codiF=lector.nextInt();
		lector.nextLine();
		
		System.out.print("Pots escriure el codi del Club ");
		int codiClub=lector.nextInt();		
		
		Club newClub = validarCodiClub(codiClub);
		
		Esportista  newEsportista = new Esportista(nom, cognom1, cognom2, sexe.charAt(0), any, dni, newClub, codiF); 
		
		esportistaList.add(newEsportista); //creem l'objecte i el posem a l'arraylist
		
	}
	
	//demanem les dades
	
	public static void altaClub() {
		
		
		System.out.print("Pots escriure el nom del club? ");
		String nom=lector.nextLine();
		
		System.out.print("Pots escriure el codi postal? ");
		int cp=lector.nextInt();
		lector.nextLine();
		
		System.out.print("Pots escriure l'any de fundació? ");
		int anyFundacio=lector.nextInt();
		lector.nextLine();
		
		System.out.print("Pots escriure el codi del club? ");
		int codi=lector.nextInt();
		lector.nextLine();	
		
		Club clubb = validarCodiClub(codi);
		
		Club newClub = new Club(nom, cp, anyFundacio, codi);

		clubList.add(newClub); //creem l'objecte i el posem a l'arraylist
		
	}
	
	public static void altaProva() {
		
		System.out.print("Pots escriure el nom de la prova? ");
		String nom=lector.nextLine();
		
		System.out.print("Pots escriure l'any? ");
		int any=lector.nextInt();
		lector.nextLine();
		
		System.out.print("T'assignarem el codi de la prova. ");
		int codiProva = Prova.generarCodiProva();  //genera el codi de la prova
		
		Prova newProva = new Prova(nom, any, codiProva);
		
		provaList.add(newProva); //creem l'objecte i el posem a l'arraylist

	}
	
	//validem el club a partir del club
	
	public static Club validarCodiClub(int codiClub) {
		
		for(int i=0;i<clubList.size();i++) {
			
			if(clubList.get(i).getCodi()==codiClub) {
				
				
				return clubList.get(i);
				
				
			}	

		}
		
		return null;

	}
	
	
	//llistar
	
	//als diferents consultar farem que llistin els clubs, les proves, i els esportistes
	
	public static void consultaClub() {
		
		String mostrar="";
		
		for(int i=0;i<clubList.size();i++) {
			
			System.out.print("Llistar Clubs");
			mostrar = mostrar + clubList.get(i).mostrarDadesClub(); //fem que ens mostrin les dades
			
		}
		
		System.out.print(mostrar);
		
	}
	
	
	public static void consultaProva() {
		
		String mostrar="";
		for(int i=0;i<provaList.size();i++) {
			
			System.out.print("Llistar Prova");
			mostrar = mostrar + provaList.get(i).mostrarDadesProva(); //fem que ens mostrin les dades
			
		}		
		
		System.out.print(mostrar);
		

	}
	
	
	public static void consultaEsportista() {
		
		String mostrar="";
		for(int i=0;i<esportistaList.size();i++) {
			
			System.out.print("Llistar Esportista");
			mostrar = mostrar + esportistaList.get(i).mostrarDadesEsportista(); //fem que ens mostrin les dades
			
		}		
		
		System.out.print(mostrar);
		

	}
	
	//modifiquem les diferents dades
	
	public static void modificacioEsportista() {
		
		String dni="";
		
		System.out.print("Quin es el teu dni? ");
		dni = lector.nextLine();
		
		System.out.print("Pots escriure el teu nom? ");
		String nom=lector.nextLine();
		
		System.out.print("Escriure el teu primer i segon cognom. ");
		String cognom1=lector.nextLine();
		String cognom2=lector.nextLine();
		
		System.out.print("Quin es teu sexe? (H o D) ");
		String sexe=lector.nextLine();
		
		System.out.print("Escriu la teva data de naixament. ");
		System.out.print("Escriu el dia. ");
		int d=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu el mes. ");
		int m=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu l'any. ");
		int a=lector.nextInt();
		lector.nextLine();
		
		LocalDate any = LocalDate.of(d,m,a);
		
		System.out.print("Pots el codi Federat? ");
		int codiF=lector.nextInt();
		lector.nextLine();
		
		System.out.print("Pots escriure el codi del Club ");
		int codiClub=lector.nextInt();	
		
		Club newClub = validarCodiClub(codiClub);
		
		//quan acabem de preguntar guardem les dades, amb el dni
		
		for(int i=0;i<esportistaList.size();i++) {
			
			if(esportistaList.get(i).getDni().equalsIgnoreCase(dni)) {
				
				esportistaList.get(i).modificarEsportista(nom, cognom1, cognom2, sexe.charAt(0), any, dni, newClub, codiF);
				
			}
			
		}
		
	}
	
	public static void modificacioClub() {
		
		int codi=0;
		
			System.out.print("Quin es el codi? ");
			codi = lector.nextInt();
			lector.nextLine();
			
			System.out.print("Pots escriure el nom del club? ");
			String nom=lector.nextLine();
			
			System.out.print("Pots escriure el codi postal? ");
			int cp=lector.nextInt();
			lector.nextLine();
			
			System.out.print("Pots escriure l'any de fundació? ");
			int Afundacio=lector.nextInt();
			lector.nextLine();
			
			System.out.print("Pots escriure el codi del club? ");
			int codiC=lector.nextInt();
			lector.nextLine();	

			//quan acabem de preguntar guardem les dades, a partir del codi
		
		for(int i=0;i<clubList.size();i++) {
			
			if(clubList.get(i).getCodi()==codi) {
				
				clubList.get(i).modificarClub(nom, cp, Afundacio, codiC);
				
			}
			
		}
		
	}
	
	//modificar les diferents proves
	
	public static int modificacioProva() {
		
		
		int opcio=-1;
		String sortir="";
		
		while(!sortir.equalsIgnoreCase("Sortir")) {
			
			System.out.print("Vols entrar a modificar marató(1), marxa popular(2), prova1000(3) o Sortir(4)? ");
			opcio=lector.nextInt();
			lector.nextLine();
		
			switch(opcio) {
			
			case 1:
				
				modificacioMarato();
				break;
				
			case 2:
			
				modificacioMarxaPopular();
				break;
				
			case 3:

				modificacioProva1000();
				break;
				
			case 4:

				sortir="sortir";
				break;

			
				}
		

			}
		
			return opcio;
		
		}	
		
		
	//modificar
	
	public static void modificacioMarato() {
		
		int codi=0;
		
		System.out.print("Quin es el codi? ");
		codi = lector.nextInt();
		lector.nextLine();
		
		System.out.print("Quin es el codi de la Marató? ");
		int codiMarato = lector.nextInt();
		lector.nextLine();
		
		System.out.print("Escriu la data. ");
		System.out.print("Escriu el dia. ");
		int d=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu el mes. ");
		int m=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu l'any. ");
		int a=lector.nextInt();
		lector.nextLine();
		
		LocalDate data = LocalDate.of(d,m,a);
		
		System.out.print("Escriu la hora de sortida. ");
		System.out.print("Escriu la hora. ");
		int h=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu els minuts. ");
		int min=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu els segons. ");
		int s=lector.nextInt();
		lector.nextLine();
		
		LocalTime horaSortida = LocalTime.of(h,min,s);
		
		//preguntem per modificar les dades de la marato i les guardem
	
		for(int i=0;i<maratoList.size();i++) {
			
			if(maratoList.get(i).getCodiMarato()==codi) {
				
				maratoList.get(i).modificarMarato(codiMarato, data, horaSortida);
	
			}
			
			
		}
		
	}
	
	
	public static void modificacioMarxaPopular() {
		
		
		int codi=0;
		
		System.out.print("Quin es el codi? ");
		codi = lector.nextInt();
		lector.nextLine();
		
		System.out.print("Quin es el codi de la mmarxa popular? ");
		int codiMarxa = lector.nextInt();
		lector.nextLine();
		
		System.out.print("Quina es la ubicació? ");
		String ubicacio = lector.nextLine();
		
		System.out.print("Escriu la data. ");
		System.out.print("Escriu el dia. ");
		int d=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu el mes. ");
		int m=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu l'any. ");
		int a=lector.nextInt();
		lector.nextLine();
		
		LocalDate data = LocalDate.of(d,m,a);
		
		System.out.print("Escriu la hora de sortida. ");
		System.out.print("Escriu la hora. ");
		int h=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu els minuts. ");
		int min=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu els segons. ");
		int s=lector.nextInt();
		lector.nextLine();
		
		LocalTime horaSortida = LocalTime.of(h,min,s);
		
		//preguntem per modificar les dades de marx popular i les guardem
		
		for(int i=0;i<marxaPopularList.size();i++) {
			
			if(marxaPopularList.get(i).getCodiMarxa()==codi) {
				
				marxaPopularList.get(i).modificarMarxaPopular(codiMarxa, ubicacio, data, horaSortida);
	
			}
			
			
		}
		
		
	}
	
	
	public static void modificacioProva1000() {
		
		int codi=0;
		
		System.out.print("Quin es el codi? ");
		codi = lector.nextInt();
		lector.nextLine();
		
		System.out.print("Quin es el codi? ");
		int codiProva1000 = lector.nextInt();
		lector.nextLine();
		
		System.out.print("Quin es el teu club anfitrió? ");
		String clubAnfitrio = lector.nextLine();
		
		System.out.print("Quina es la ubicació? ");
		String ubicacio = lector.nextLine();
		
		System.out.print("Escriu la data. ");
		System.out.print("Escriu el dia. ");
		int d=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu el mes. ");
		int m=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu l'any. ");
		int a=lector.nextInt();
		lector.nextLine();
		
		LocalDate data = LocalDate.of(d,m,a);
		
		System.out.print("Escriu la hora de sortida. ");
		System.out.print("Escriu la hora. ");
		int h=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu els minuts. ");
		int min=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu els segons. ");
		int s=lector.nextInt();
		lector.nextLine();
		
		LocalTime horaSortida = LocalTime.of(h,min,s);
		
		//preguntem per modificar les dades de prova1000 i les guardem
		
		for(int i=0;i<prova1000List.size();i++) {
			
			if(prova1000List.get(i).getCodiProva1000()==codi) {
				
				prova1000List.get(i).modificarProva1000(codiProva1000, clubAnfitrio, ubicacio, data, horaSortida);
	
			}
			
			
		}
		
	}
	
	//ens inscriurem a les diferentes proves
	
	public static int inscripcioProva() {
		
		int opcio=-1;
		String sortir="";
		
		while(!sortir.equalsIgnoreCase("Sortir")) {
			
			System.out.print("Vols entrar a marató(1), prova1000(2), marxa popular(3) o Sortir(4)? ");
			opcio=lector.nextInt();
			lector.nextLine();
		
			switch(opcio) {
			
			case 1:
				
				marato();
				break;
				
			case 2:
			
				prova1000();
				break;
				
			case 3:

				marxaPopular();
				break;
				
			case 4:

				sortir="sortir";
				break;

			
			}
		

		}
		
		return opcio;
		
	}
	
	//ens inscrivim a la marató
	
	public static void marato() {
		
		int codi=0;
		
		System.out.print("Quin es el codi? ");
		codi = lector.nextInt();
		lector.nextLine();
		
		System.out.print("Pots escriure el teu nom? ");
		String nom=lector.nextLine();
		
		System.out.print("Escriure el teu primer i segon cognom. ");
		String cognom1=lector.nextLine();
		String cognom2=lector.nextLine();
		
		System.out.print("Quin es teu sexe? (H o D) ");
		String sexe=lector.nextLine();
		
		System.out.print("Escriu la teva data de naixament. ");
		System.out.print("Escriu el dia. ");
		int d=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu el mes. ");
		int m=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu l'any. ");
		int a=lector.nextInt();
		lector.nextLine();
		
		LocalDate any = LocalDate.of(d,m,a);

		System.out.print("Pots escriure el codi del Club ");
		int codiClub=lector.nextInt();	

		Club newClub = validarCodiClub(codiClub);
		
		LocalTime tempsProva = LocalTime.of(00, 00, 00);
		
		Participant  newParticipant = new Participant(nom, cognom1, cognom2, any , sexe.charAt(0), newClub, tempsProva);

		participantList.add(newParticipant);
		
		//afegim un participant i el posem a l'array de la marató
		
		for(int i=0;i<maratoList.size();i++) {
			
			if(maratoList.get(i).getCodiMarato()==codi) {
				
				maratoList.get(i).afegirParticipantMarato(newParticipant);
	
			}
			
			
		}
		
	}
	
	public static void prova1000() {
		
		int codi=0;
		
		System.out.print("Quin es el codi? ");
		codi = lector.nextInt();
		lector.nextLine();
		
		System.out.print("Pots escriure el teu nom? ");
		String nom=lector.nextLine();
		
		System.out.print("Escriure el teu primer i segon cognom. ");
		String cognom1=lector.nextLine();
		String cognom2=lector.nextLine();
		
		System.out.print("Quin es teu sexe? (H o D) ");
		String sexe=lector.nextLine();
		
		System.out.print("Escriu la teva data de naixament. ");
		System.out.print("Escriu el dia. ");
		int d=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu el mes. ");
		int m=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu l'any. ");
		int a=lector.nextInt();
		lector.nextLine();
		
		LocalDate any = LocalDate.of(d,m,a);

		System.out.print("Pots escriure el codi del Club ");
		int codiClub=lector.nextInt();	

		Club newClub = validarCodiClub(codiClub);
		
		LocalTime tempsProva = LocalTime.of(00, 00, 00);
		
		Participant  newParticipant = new Participant(nom, cognom1, cognom2, any , sexe.charAt(0), newClub, tempsProva);

		participantList.add(newParticipant);
		
		//afegim un participant i el posem a l'array de la prova1000
		
		for(int i=0;i<prova1000List.size();i++) {
			
			if(prova1000List.get(i).getCodiProva1000()==codi) {
				
				prova1000List.get(i).afegirParticipantProva1000(newParticipant);
	
			}
			
			
		}
		
	}
	
	public static void marxaPopular() {
		
		int codi=0;
		
		System.out.print("Quin es el codi? ");
		codi = lector.nextInt();
		lector.nextLine();
		
		System.out.print("Pots escriure el teu nom? ");
		String nom=lector.nextLine();
		
		System.out.print("Escriure el teu primer i segon cognom. ");
		String cognom1=lector.nextLine();
		String cognom2=lector.nextLine();
		
		System.out.print("Quin es teu sexe? (H o D) ");
		String sexe=lector.nextLine();
		
		System.out.print("Escriu la teva data de naixament. ");
		System.out.print("Escriu el dia. ");
		int d=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu el mes. ");
		int m=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu l'any. ");
		int a=lector.nextInt();
		lector.nextLine();
		
		LocalDate any = LocalDate.of(d,m,a);

		System.out.print("Pots escriure el codi del Club ");
		int codiClub=lector.nextInt();	

		Club newClub = validarCodiClub(codiClub);
		
		LocalTime tempsProva = LocalTime.of(00, 00, 00);
		
		Participant  newParticipant = new Participant(nom, cognom1, cognom2, any , sexe.charAt(0), newClub, tempsProva);

		participantList.add(newParticipant);
		
		//afegim un participant i el posem a l'array de la marxa popular
		
		for(int i=0;i<marxaPopularList.size();i++) {
			
			if(marxaPopularList.get(i).getCodiMarxa()==codi) {
				
				marxaPopularList.get(i).afegirParticipantMarxaPopular(newParticipant);
	
			}
			
			
		}
		
	}
		
	//anul·lem les diferentes proves
	
	public static int AnulInscripcio() {
		
		int opcio=-1;
		String sortir="";
		
		while(!sortir.equalsIgnoreCase("Sortir")) {
			
			System.out.print("Vols entrar a anul·lar marató(1), marxa popular(2), prova1000(3) o Sortir(4)? ");
			opcio=lector.nextInt();
			lector.nextLine();
		
			switch(opcio) {
			
			case 1:
				
				anulMarato();
				break;
				
			case 2:
			
				anulMarxaPopular();
				break;
				
			case 3:

				anulProva1000();
				break;
				
			case 4:

				sortir="sortir";
				break;

			
				}
		

			}
		
			return opcio;
		
		}	
		
		
	//anul·lem a partir del dorsal
	
	public static void anulMarato() {
		
		int dorsal=0;
		
		System.out.print("Escriu el dorsal del participant");
		dorsal=lector.nextInt();
		lector.nextLine();
		
		for(int i=0;i<maratoList.size();i++) {
			
			for(int j=0;j<maratoList.get(i).getllistatParticipants().size();j++) {
			
				if(maratoList.get(i).getllistatParticipants().get(j).getDorsal()==dorsal) {
				
					
					maratoList.get(i).getllistatParticipants().remove(j); //el remove per borrar mirant el dorsal, participant a la marató
					
				}
				
			}
			
		}
		
	}
	
	public static void anulMarxaPopular() {
		
		int dorsal=0;
		
		System.out.print("Escriu el dorsal del participant");
		dorsal=lector.nextInt();
		lector.nextLine();
		
		for(int i=0;i<marxaPopularList.size();i++) {
			
			for(int j=0;j<marxaPopularList.get(i).getllistatParticipants().size();j++) {
			
				if(marxaPopularList.get(i).getllistatParticipants().get(j).getDorsal()==dorsal) {
				
					
					marxaPopularList.get(i).getllistatParticipants().remove(j); //el remove per borrar mirant el dorsal, participant a la marxa popular
					
				}
				
			}
			
		}
		
	}
	
	public static void anulProva1000() {
		
		int dorsal=0;
		
		System.out.print("Escriu el dorsal del participant");
		dorsal=lector.nextInt();
		lector.nextLine();
		
		for(int i=0;i<prova1000List.size();i++) {
			
			for(int j=0;j<prova1000List.get(i).getllistatParticipants().size();j++) {
			
				if(prova1000List.get(i).getllistatParticipants().get(j).getDorsal()==dorsal) {
				
					
					prova1000List.get(i).getllistatParticipants().remove(j); //el remove per borrar mirant el dorsal, participant a la prova1000
					
				}
				
			}
			
		}
		
		
	}
	
	//listarem les incripcions de les proves
	
	public static int llistarInscripcions() {
		
		int opcio=-1;
		String sortir="";
		
		while(!sortir.equalsIgnoreCase("Sortir")) {
			
			System.out.print("Vols entrar a marató(1), prova1000(2), marxa popular(3) o Sortir(4)? ");
			opcio=lector.nextInt();
			lector.nextLine();
		
			switch(opcio) {
			
			case 1:
				
				String mostrar="";
				
				for(int i=0;i<maratoList.size();i++) {
					
					System.out.print("Llistar Marato");
					mostrar = mostrar + maratoList.get(i).mostrarDadesMarato(); //ho mostrem
					
				}
				
				System.out.print(mostrar);
				
				break;
				
			case 2:
			
				String mostrarp="";
				
				for(int i=0;i<prova1000List.size();i++) {
					
					System.out.print("Llistar Prova1000");
					mostrarp = mostrarp + prova1000List.get(i).mostrarDadesProva1000(); //ho mostrem
					
				}
				
				System.out.print(mostrarp);
				
				break;
				
			case 3:

				String mostrarMarxa="";
				
				for(int i=0;i<marxaPopularList.size();i++) {
					
					System.out.print("Llistar Marxa Popular");
					mostrarMarxa = mostrarMarxa + marxaPopularList.get(i).mostrarDadesMarxaPopular(); //ho mostrem
					
				}
				
				System.out.print(mostrarMarxa);
				
				break;
				
			case 4:

				
				sortir="sortir";
				break;

			
			}
		

		}
		
		return opcio;
		
	}
	

	/*
	 * fem que ens entrin el temps a partir del codi de la prova
	 * 
	 */
	
	public static int entradaTemps() {
		
		int opcio=-1;
		String sortir="";
		
		while(!sortir.equalsIgnoreCase("Sortir")) {
			
			System.out.print("Vols entrar a entrar temps marató(1), marxa popular(2), prova1000(3) o Sortir(4)? ");
			opcio=lector.nextInt();
			lector.nextLine();
		
			switch(opcio) {
			
			case 1:
				
				entradaTempsMarato();
				break;
				
			case 2:
			
				entradaTempsMarxaPopular();
				break;
				
			case 3:

				entradaTempsProva1000();
				break;
				
			case 4:

				sortir="sortir";
				break;

			
				}
		

			}
		
			return opcio;

	}
	
	//farem que s'entri el temps de la marxa popular
	
	public static void entradaTempsMarxaPopular() {
		
		int codiMarxa=0;
		
		System.out.println("Pots escriure el codi de la prova? ");
		codiMarxa=lector.nextInt();
		lector.nextLine();
		
		System.out.print("Escriu el temps d'inici. ");
		System.out.print("Escriu la hora. ");
		int h=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu els minuts. ");
		int min=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu els segons. ");
		int s=lector.nextInt();
		lector.nextLine();
		
		LocalTime tempsInici = LocalTime.of(h,min,s);
		
		for(int i=0;i<marxaPopularList.size();i++) {
			
			if(marxaPopularList.get(i).getCodiMarxa()==codiMarxa) {
				
				marxaPopularList.get(i).tempsMarxaPopular(tempsInici);
	
			}
			
			
		}
		
	}
	
	//farem que s'entri el temps de la marató
	
	public static void entradaTempsMarato() {
		
		int codiMarato=0;
		
		System.out.println("Pots escriure el codi de la prova? ");
		codiMarato=lector.nextInt();
		lector.nextLine();
		
		System.out.print("Escriu el temps d'inici. ");
		System.out.print("Escriu la hora. ");
		int h=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu els minuts. ");
		int min=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu els segons. ");
		int s=lector.nextInt();
		lector.nextLine();
		
		LocalTime tempsInici = LocalTime.of(h,min,s);
		
		for(int i=0;i<maratoList.size();i++) {
			
			if(maratoList.get(i).getCodiMarato()==codiMarato) {
				
				maratoList.get(i).tempsMarato(tempsInici);
	
			}
			
			
		}
		
	}
	
	//farem que s'entri el temps de la prova1000
	
	public static void entradaTempsProva1000() {
		
		int codiProva=0;
		
		System.out.println("Pots escriure el codi de la prova? ");
		codiProva=lector.nextInt();
		lector.nextLine();
		
		System.out.print("Escriu el temps d'inici. ");
		System.out.print("Escriu la hora. ");
		int h=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu els minuts. ");
		int min=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu els segons. ");
		int s=lector.nextInt();
		lector.nextLine();
		
		LocalTime tempsInici = LocalTime.of(h,min,s);
		
		for(int i=0;i<prova1000List.size();i++) {
			
			if(prova1000List.get(i).getCodiProva1000()==codiProva) {
				
				prova1000List.get(i).tempsProva1000(tempsInici);
	
			}
			
			
		}
		
	}
	
	
	
	
	
	/*
	 * demanarà el codi de la prova i el codi del participant i afegirem el temps de la prova
	 * 
	 */
	
	public static int arribadaParticipants() {

		int opcio=-1;
		String sortir="";
		
		while(!sortir.equalsIgnoreCase("Sortir")) {
			
			System.out.print("Vols entrar a entrar temps Participants marató(1), marxa popular(2), prova1000(3) o Sortir(4)? ");
			opcio=lector.nextInt();
			lector.nextLine();
		
			switch(opcio) {
			
			case 1:
				
				entradaTempsArribadaMarato();
				break;
				
			case 2:
			
				entradaTempsArribadaMarxaPopular();
				break;
				
			case 3:

				entradaTempsArribadaProva1000();
				break;
				
			case 4:

				sortir="sortir";
				break;

			
				}
		

			}
		
			return opcio;
		
		
	}
	
	//entrarem el temps d'arribada de la marxa popular demanant el codi de la marxa i el dorsal
	
	public static void entradaTempsArribadaMarxaPopular() {
		
		int codiMarxa=0;
		int codiParticipant=0;
		
		System.out.println("Pots escriure el codi de la prova? ");
		codiMarxa=lector.nextInt();
		lector.nextLine();
		
		System.out.println("Pots escriure el codi del participant? ");
		codiParticipant=lector.nextInt();
		lector.nextLine();
		
		System.out.print("Escriu el temps d'inici. ");
		System.out.print("Escriu la hora. ");
		int h=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu els minuts. ");
		int min=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu els segons. ");
		int s=lector.nextInt();
		lector.nextLine();
		
		LocalTime tempsInici = LocalTime.of(h,min,s);
		
			
			for(int i=0;i<marxaPopularList.size();i++) {
				
				if(codiMarxa == marxaPopularList.get(i).getCodiMarxa()) {
				
					for(int j=0;j<marxaPopularList.get(i).getllistatParticipants().size();j++) {
					
						if(marxaPopularList.get(i).getllistatParticipants().get(j).getDorsal()==codiParticipant) {
						
							marxaPopularList.get(i).getllistatParticipants().get(j).setTempsProva(tempsInici); //ho assignem a temps prova
							
						}
						
					}
					
				}
			
			}
			
		}
	
	//entrarem el temps d'arribada de la marató demanant el codi de la marató i el dorsal
	
	public static void entradaTempsArribadaMarato() {
		
		int codiMarato=0;
		int codiParticipant=0;
		
		System.out.println("Pots escriure el codi de la prova? ");
		codiMarato=lector.nextInt();
		lector.nextLine();
		
		System.out.println("Pots escriure el codi del participant? ");
		codiParticipant=lector.nextInt();
		lector.nextLine();
		
		System.out.print("Escriu el temps d'inici. ");
		System.out.print("Escriu la hora. ");
		int h=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu els minuts. ");
		int min=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu els segons. ");
		int s=lector.nextInt();
		lector.nextLine();
		
		LocalTime tempsInici = LocalTime.of(h,min,s);
		
			
			for(int i=0;i<maratoList.size();i++) {
				
				if(codiMarato == maratoList.get(i).getCodiMarato()) {
				
					for(int j=0;j<maratoList.get(i).getllistatParticipants().size();j++) {
					
						if(maratoList.get(i).getllistatParticipants().get(j).getDorsal()==codiParticipant) {
						
							maratoList.get(i).getllistatParticipants().get(j).setTempsProva(tempsInici); //ho assignem a temps prova
							
						}
						
					}
					
				}
			
			}
			
		}
	
	//entrarem el temps d'arribada de la prova1000 demanant el codi de la prova1000 i el dorsal
	
	public static void entradaTempsArribadaProva1000() {
		
		int codiProva1000=0;
		int codiParticipant=0;
		
		System.out.println("Pots escriure el codi de la prova? ");
		codiProva1000=lector.nextInt();
		lector.nextLine();
		
		System.out.println("Pots escriure el codi del participant? ");
		codiParticipant=lector.nextInt();
		lector.nextLine();
		
		System.out.print("Escriu el temps d'inici. ");
		System.out.print("Escriu la hora. ");
		int h=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu els minuts. ");
		int min=lector.nextInt();
		lector.nextLine();
		System.out.print("Escriu els segons. ");
		int s=lector.nextInt();
		lector.nextLine();
		
		LocalTime tempsInici = LocalTime.of(h,min,s);
		
			
			for(int i=0;i<prova1000List.size();i++) {
				
				if(codiProva1000 == prova1000List.get(i).getCodiProva1000()) {
				
					for(int j=0;j<prova1000List.get(i).getllistatParticipants().size();j++) {
					
						if(prova1000List.get(i).getllistatParticipants().get(j).getDorsal()==codiParticipant) {
						
							prova1000List.get(i).getllistatParticipants().get(j).setTempsProva(tempsInici); //ho assignem a temps prova
							
						}
						
					}
					
				}
			
			}
			
		}
	

	//classificacions
	
	/*
	 * classificarem a partir del codi de la prova, una classificació total
	 * 
	 */
	
	public static void classTotal() {

		int codiProva=0;
		
		System.out.println("Pots escriure el codi de la prova? ");
		codiProva=lector.nextInt();
		lector.nextLine();
		
		for(int i=0;i<maratoList.size();i++) {
			
			if(maratoList.get(i).getCodiMarato()==codiProva) {
				
				Collections.sort(maratoList.get(i).getllistatParticipants(), new Participant.compararTempsClassificacio()); //compararem els temps del participants
				
				for(int j=0;j<maratoList.size();i++) {
					
					maratoList.get(i).getllistatParticipants().get(j).mostrarDadesParticipant();
					
				}

			}
			
		}
		
	}
	
	/*
	 * classificarem a partir del codi de la prova, una classificació per sexe, homes i dones
	 * 
	 */
	
	public static void classSexe() {

		int codiProva=0;
		
		System.out.println("Pots escriure el codi de la prova? ");
		codiProva=lector.nextInt();
		lector.nextLine();
		
		for(int i=0;i<provaList.size();i++) {
			
			if(provaList.get(i).getcodiProva()==codiProva) {
				
				if(participantList.get(i).getSexe()== 'D') {
				
				Collections.sort(provaList.get(i).getllistatParticipants(), new Participant.compararTempsClassificacio()); //compararem igual per temps però abans filtrem per dones
				
					for(int j=0;j<provaList.size();i++) {
					
						provaList.get(i).getllistatParticipants().get(j).mostrarDadesParticipant();
					
					}
				
				}
				
			}
			
		}
		
		for(int i=0;i<provaList.size();i++) {
			
			if(provaList.get(i).getcodiProva()==codiProva) {
				
				if(participantList.get(i).getSexe()=='H') {
				
				Collections.sort(provaList.get(i).getllistatParticipants(), new Participant.compararTempsClassificacio()); //compararem igual per temps però abans filtrem per homes
				
					for(int j=0;j<provaList.size();i++) {
					
						provaList.get(i).getllistatParticipants().get(j).mostrarDadesParticipant();
					
						}
				
				}
				
			}
			
		}
		
	}
	
	/*
	 * classificarem a partir del codi de la prova, una classificació per les categories
	 * 
	 */
	
	public static void classCategoria() {

		int codiProva=0;
		
		System.out.println("Pots escriure el codi de la prova? ");
		codiProva=lector.nextInt();
		lector.nextLine();
		
		for(int i=0;i<provaList.size();i++) {
			
			if(provaList.get(i).getcodiProva()==codiProva) {
				
				Collections.sort(provaList.get(i).getllistatParticipants(), new Participant.compararTempsClassificacio());
				
					for(int j=0;j<provaList.size();i++) {
					
						provaList.get(i).getllistatParticipants().get(j).mostrarDadesParticipant();
					
				}
				
			}
			
		}
		
		
	}
	

}
