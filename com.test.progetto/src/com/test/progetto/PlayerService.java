package com.test.progetto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PlayerService {
	private Map<Long,Giocatore> giocatori=DBClass.getGiocatori();
	
	public PlayerService(){
		Giocatore g1=new Giocatore("Marco", 9090);
		g1.setId(this.giocatori.size()+1);
		this.giocatori.put(g1.getID(), g1);
		
		
	}

	public List<Giocatore> getGiocatori() {
		return new ArrayList<Giocatore>(giocatori.values());
	}
	
}
