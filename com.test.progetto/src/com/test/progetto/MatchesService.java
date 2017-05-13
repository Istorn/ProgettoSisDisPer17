package com.test.progetto;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Application;

import java.util.*;

public class MatchesService {
	
	private Map<Long,Partita> partite=DBClass.getPartite();
	
	public MatchesService(){
		
	}
	
	public List<Partita> getAllPartite(){
		return new ArrayList<Partita>(partite.values());
	}

	public Partita getPartita(String nome){
		return partite.get(nome);
		
	}
	
	public Partita addPartita(Partita partita){
		partita.setId(partite.size()+1);
		partite.put(partita.getId(), partita);
		return partita;
		
		
	}
	
	public Partita updatePartita(Partita partita){
		if (partita.getId()<=0){
			return null;
		}
		partite.put(partita.getId(), partita);
		return partita;
	}
	
	public Partita removePartita(long id){
		return partite.remove(id);
	}
}
