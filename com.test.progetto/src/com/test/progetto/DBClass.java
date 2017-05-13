package com.test.progetto;
import java.util.HashMap;
import java.util.Map;
public class DBClass {
	public static Map<Long, Partita> partite = new HashMap<Long, Partita>();
	public static Map<Long, Giocatore> giocatori = new HashMap<Long, Giocatore>();
	
	public static Map<Long, Giocatore> getGiocatori(){
		return giocatori;
	}
	
	public static Map<Long, Partita> getPartite(){
		return partite;
	}
}
