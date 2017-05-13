package com.test.progetto;
import java.io.*;
import java.net.*;
import java.util.Enumeration;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Giocatore {
	private long id;
	private String nome;
	private String indirizzoIP;
	private long porta;
	public synchronized void setId(long id){
		this.id=id;
	}
	public synchronized long getID(){
		return this.id;
	}
	public Giocatore(String nomeUtente,long portaDaSettare){
		this.nome=nomeUtente;
		this.porta=portaDaSettare;
	}
	public synchronized String getNome() {
		return nome;
	}
	public synchronized void setNome(String nome) {
		this.nome = nome;
	}
	public synchronized String getIndirizzoIP() {
		return this.indirizzoIP;
	}
	public synchronized void setIndirizzoIP() {
		try {
	        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
	        while (interfaces.hasMoreElements()) {
	            NetworkInterface iface = interfaces.nextElement();
	            // Eliminiamo l'indirizzo di loopback e il localhost
	            if (iface.isLoopback() || !iface.isUp())
	                continue;

	            Enumeration<InetAddress> addresses = iface.getInetAddresses();
	            while(addresses.hasMoreElements()) {
	                InetAddress addr = addresses.nextElement();
	                this.indirizzoIP = addr.getHostAddress();
	                System.out.println(iface.getDisplayName() + " " + this.indirizzoIP);
	            }
	        }
	    } catch (SocketException e) {
	        throw new RuntimeException(e);
	    }
	}
	public synchronized long getPorta() {
		return porta;
	}
	public synchronized void setPorta(long porta) {
		this.porta = porta;
	}
}
