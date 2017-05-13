package com.test.progetto;
import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Application;

@ApplicationPath("/*")
@Path("/classedue")
public class Classe2 {
	
	MatchesService matchService=new MatchesService();
	PlayerService playerService=new PlayerService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Giocatore> getPartite(){
		return playerService.getGiocatori();
	}
	 
}
