package marato;

import java.time.LocalDate;
import java.time.LocalTime;

import marato.*;

public class entrarDades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static void entrarDades() {

		EsportistaNoFederat p1 = new EsportistaNoFederat("nom1", "cognom11", "cognom21", 'H', LocalDate.of(1975, 2, 28), "45540001Y");

		EsportistaNoFederat p2 = new EsportistaNoFederat("nom2", "cognom12", "cognom22", 'D', LocalDate.of(1985, 2, 28), "45540002Y");

		EsportistaNoFederat p3 = new EsportistaNoFederat("nom3", "cognom13", "cognom23", 'H', LocalDate.of(1995, 2, 28), "45540003Y");

		EsportistaNoFederat p4 = new EsportistaNoFederat("nom4", "cognom14", "cognom24", 'D', LocalDate.of(1996, 2, 28), "45540004Y");

		EsportistaNoFederat p5 = new EsportistaNoFederat("nom5", "cognom15", "cognom25", 'H', LocalDate.of(1997, 2, 28), "45540005Y");

		EsportistaNoFederat p6 = new EsportistaNoFederat("nom6", "cognom16", "cognom26", 'D', LocalDate.of(1998, 2, 28), "45540006Y");

		EsportistaNoFederat p7 = new EsportistaNoFederat("nom7", "cognom17", "cognom27", 'H', LocalDate.of(1999, 2, 28), "45540007Y");

		EsportistaNoFederat p8 = new EsportistaNoFederat("nom8", "cognom18", "cognom28", 'D', LocalDate.of(1963, 2, 28), "85540008Y");

		EsportistaNoFederat p9 = new EsportistaNoFederat("nom9", "cognom19", "cognom29", 'H', LocalDate.of(1940, 2, 28), "45540009Y");

		EsportistaNoFederat p10 = new EsportistaNoFederat("nom10", "cognom110", "cognom210", 'D', LocalDate.of(1935, 2, 28), "45540010Y");

		EsportistaNoFederat p11 = new EsportistaNoFederat("nom11", "cognom111", "cognom211", 'H', LocalDate.of(1979, 2, 28), "45540011Y");

		EsportistaNoFederat p12 = new EsportistaNoFederat("nom12", "cognom112", "cognom212", 'D', LocalDate.of(2005, 2, 28), "45540012Y");

		/*
		EsportistaNoFederat.add(p1);

		EsportistaNoFederat.add(p2);

		EsportistaNoFederat.add(p3);

		EsportistaNoFederat.add(p4);

		EsportistaNoFederat.add(p5);

		EsportistaNoFederat.add(p6);

		EsportistaNoFederat.add(p7);

		EsportistaNoFederat.add(p8);

		EsportistaNoFederat.add(p9);

		EsportistaNoFederat.add(p10);

		EsportistaNoFederat.add(p11);

		EsportistaNoFederat.add(p12);

		*/

		Club c1 = new Club("Palamós", 17230, 1995, 1);

		Club c2 = new Club("Blanes", 17300, 1990, 2);

		Club c3 = new Club("Olot", 17100, 1985, 3);

		
		/*
		 
		Club.add(c1);

		Club.add(c2);

		Club.add(c3);

		*/

		Esportista e1 = new Esportista("nome1", "cognome11", "cognome21", 'H', LocalDate.of(1975, 2, 13),

				"75540001Y", c1, 1001);

		Esportista e2 = new Esportista("nome2", "cognome12", "cognome22", 'D', LocalDate.of(1985, 2, 13),

				"75540002Y", c2, 1002);

		Esportista e3 = new Esportista("nome3", "cognome13", "cognome23", 'H', LocalDate.of(1995, 2, 13),

				"75540003Y", c3, 1003);

		Esportista e4 = new Esportista("nome4", "cognome14", "cognome24", 'D', LocalDate.of(1996, 2, 13),

				"75540004Y", c1, 1004);

		Esportista e5 = new Esportista("nome5", "cognome15", "cognome25", 'H', LocalDate.of(1997, 2, 13),

				"75540005Y", c2, 1005);

		Esportista e6 = new Esportista("nome6", "cognome16", "cognome26", 'D', LocalDate.of(1998, 2, 13),

				"75540006Y", c3, 1006);

		Esportista e7 = new Esportista("nome7", "cognome17", "cognome27", 'H', LocalDate.of(1999, 2, 13),

				"75540007Y", c1, 1007);

		Esportista e8 = new Esportista("nome8", "cognome18", "cognome28", 'D', LocalDate.of(1963, 2, 13),

				"75540008Y", c2, 1008);

		Esportista e9 = new Esportista("nome9", "cognome19", "cognome29", 'H', LocalDate.of(1940, 2, 13),

				"75540009Y", c3, 1009);

		Esportista e10 = new Esportista("nome10", "cognome110", "cognome210", 'D',

				LocalDate.of(1935, 2, 13), "75540010Y", c1, 1010);

		Esportista e11 = new Esportista("nome11", "cognome111", "cognome211", 'H',

				LocalDate.of(1979, 2, 13), "75540011Y", c2, 1011);

		Esportista e12 = new Esportista("nome12", "cognome112", "cognome212", 'D',

				LocalDate.of(2005, 2, 13), "75540012Y", c3, 1012);

		/*

		Esportista.add(e1);

		Esportista.add(e2);

		Esportista.add(e3);

		Esportista.add(e4);

		Esportista.add(e5);

		Esportista.add(e6);

		Esportista.add(e7);

		Esportista.add(e8);

		Esportista.add(e9);

		Esportista.add(e10);

		Esportista.add(e11);

		Esportista.add(e12);
		
		*/

		Marato m1 = new Marato(1, LocalDate.now(), LocalTime.now());

		MarxaPopular mp1 = new MarxaPopular(1, "Vilobi", LocalDate.now(), LocalTime.now());

		Prova1000 p1000 = new Prova1000(1, "c1", "Vilobi", LocalDate.now(), LocalTime.now());
		
		Participant pp1= new Participant("nomp11", "cognomp11", "cognomp21", LocalDate.of(2020,12,01), 'H', c1, LocalTime.now());

		Participant pp4= new Participant("nomp12", "cognomp12", "cognomp22", LocalDate.of(2020,12,01), 'D', c2, LocalTime.now());

		Participant pp2= new Participant("nomp13", "cognomp13", "cognomp23", LocalDate.of(2020,12,01), 'H', c3, LocalTime.now());

		Participant pp3= new Participant("nomp14", "cognomp14", "cognomp24", LocalDate.of(2020,12,01), 'A', c1, LocalTime.now());

		Participant pp5= new Participant("nomp15", "cognomp15", "cognomp25", LocalDate.of(2020,12,01), 'H', c2, LocalTime.now());

		Participant pp11= new Participant("nomp111", "cognomp111", "cognomp211", LocalDate.of(2020,12,01), 'D', c3, LocalTime.now());

		Participant pp12= new Participant("nomp112", "cognomp112", "cognomp212", LocalDate.of(2020,12,01), 'D', c1, LocalTime.now());

		Participant pp13= new Participant("nomp113", "cognomp113", "cognomp213", LocalDate.of(2020,12,01), 'H', c2, LocalTime.now());

		Participant pp14= new Participant("nomp114", "cognomp114", "cognomp214", LocalDate.of(2020,12,01), 'D', c3, LocalTime.now());

		Participant pp15= new Participant("nomp115", "cognomp115", "cognomp215", LocalDate.of(2020,12,01), 'H', c1, LocalTime.now());

		Participant pp21= new Participant("nomp121", "cognomp121", "cognomp221", LocalDate.of(2020,12,01), 'H', c2, LocalTime.now());

		Participant pp22= new Participant("nomp122", "cognomp122", "cognomp222", LocalDate.of(2020,12,01), 's', c3, LocalTime.now());

		Participant pp23= new Participant("nomp123", "cognomp123", "cognomp223", LocalDate.of(2020,12,01), 'H', c1, LocalTime.now());

		Participant pp24= new Participant("nomp124", "cognomp124", "cognomp224", LocalDate.of(2020,12,01), 'D', c2, LocalTime.now());

		Participant pp25= new Participant("nomp125", "cognomp125", "cognomp225", LocalDate.of(2020,12,01), 'H', c3, LocalTime.now());

		Participant pp26= new Participant("nomp126", "cognomp126", "cognomp226", LocalDate.of(2020,12,01), 'D', c1, LocalTime.now());

		/*
		
		Marato.add(m1);

		MarxaPopular.add(mp1);

		Prova1000.add(p1000);

		*/

		m1.afegirParticipantMarato(pp1);

		m1.afegirParticipantMarato(pp2);

		m1.afegirParticipantMarato(pp3);

		m1.afegirParticipantMarato(pp4);

		m1.afegirParticipantMarato(pp5);

		mp1.afegirParticipantMarxaPopular(pp11);

		mp1.afegirParticipantMarxaPopular(pp12);

		mp1.afegirParticipantMarxaPopular(pp13);

		mp1.afegirParticipantMarxaPopular(pp14);

		mp1.afegirParticipantMarxaPopular(pp15);

		mp1.afegirParticipantMarxaPopular(pp21);

		p1000.afegirParticipantProva1000(pp22);

		p1000.afegirParticipantProva1000(pp23);

		p1000.afegirParticipantProva1000(pp24);

		p1000.afegirParticipantProva1000(pp25);

		p1000.afegirParticipantProva1000(pp26);

		

	}

}
