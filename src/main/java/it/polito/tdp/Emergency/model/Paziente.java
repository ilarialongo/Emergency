package it.polito.tdp.Emergency.model;

import java.time.LocalTime;

/**
 * Rappresenta le infomazioni su ciascun paziente nel sistema
 * @author ilarialongo
 *
 */
public class Paziente implements Comparable<Paziente>{
	public enum CodiceColore {
		UNKNOWN, //non lo so ancroa perchè il paziente ha finito il triage
		WHITE, 
		YELLOW, 
		RED,
		BLACK,
		OUT,
	}
private LocalTime oraArrivo;
private CodiceColore colore;
public Paziente(LocalTime oraArrivo, CodiceColore colore) {
	super();
	this.oraArrivo = oraArrivo;
	this.colore = colore;
}
public CodiceColore getColore() {
	return colore;
}
public void setColore(CodiceColore colore) {
	this.colore = colore;
}
public LocalTime getOraArrivo() {
	return oraArrivo;
}
@Override
public int compareTo(Paziente other) {
	if (this.colore==other.colore) {
		return this.oraArrivo.compareTo(other.oraArrivo);
	}
	else if (this.colore==CodiceColore.RED){
		return -1; //passa davanti lui
		//il primo è minore del secondo 
	}
	else if (other.colore==CodiceColore.RED) {
		return +1; //passa savanti lui
	}
	else if (this.colore==CodiceColore.YELLOW) {
		return -1;
	}
	else if (other.colore==CodiceColore.YELLOW) {
		return +1;
	}
	/*else if (this.colore==CodiceColore.OUT) {
		
	}*/
	throw new RuntimeException("Comparator<Persona> failed") ;
}
@Override
public String toString() {
	return "Paziente [oraArrivo=" + oraArrivo + ", colore=" + colore + "]";
}



}
