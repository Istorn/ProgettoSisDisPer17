package com.test.progetto;
import java.util.*;
import java.io.*;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Partita {
	private long id;
	private String nome;
	private int lato;
	private List<Giocatore> giocatori;
	public synchronized void setId(long id){
		this.id=id;
	}
	public synchronized long getId(){
		return this.id;
	}
	public Partita(String nomePartita,Giocatore creatore,int lato){
		this.nome=nomePartita;
		this.giocatori=new ArrayList<Giocatore>();
		this.giocatori.add(creatore);
		this.lato=lato;
	}
	public synchronized String getNome(){
		return this.nome;
	}
	public synchronized List<Giocatore> getGiocatori(){
		return this.giocatori;
	}
	
	//Metodi per aggiungere/rimuovere giocatori da una partita
	public synchronized boolean aggiungiGiocatore(Giocatore giocatoreDaAggiungere){
		for (int i=0;i<this.giocatori.size();i++){
			if (this.giocatori.get(i).getNome()==giocatoreDaAggiungere.getNome()){
				return false;
			}
		}
		this.giocatori.add(giocatoreDaAggiungere);
		return true;
	}
	public synchronized boolean rimuoviGiocatore(Giocatore giocatoreDaRimuovere){
		for (int i=0;i<this.giocatori.size();i++){
			if (this.giocatori.get(i).getNome()==giocatoreDaRimuovere.getNome()){
				this.giocatori.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
}
