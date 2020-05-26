package it.polito.tdp.Emergency.model;

import java.time.LocalTime;

public class Event implements Comparable<Event>{
	public enum EventType {
		ARRIVAL, //arriva un nuovo paziente
		TRIAGE, //è stato assegnato un codice colore e vado in sala d'attesa
		FREE_STUDIO, //si libera uno studio e chiamo il paziente
		TREATED, //paziente trattato e dimesso
		TIMEOUT, //attesa eccessiva in sala d'aspetto	
		TICK, //evento periodico per verificare se ci sono studi vuoti
	}
	
	private LocalTime time;
	private EventType type;
	private Paziente paziente; //qual è il paziente a cui si fa riferimento
	
	
	public Event(LocalTime time, EventType type, Paziente paziente) {
		super();
		this.time = time;
		this.type = type;
		this.paziente=paziente;
	}
	


	public LocalTime getTime() {
		return time;
	}



	public EventType getType() {
		return type;
	}



	public Paziente getPaziente() {
		return paziente;
	}



	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}



	@Override
	public int compareTo(Event other) {
		return this.time.compareTo(other.time);
	}



	@Override
	public String toString() {
		return "Event [time=" + time + ", type=" + type + ", paziente=" + paziente + "]";
	}
	
}
