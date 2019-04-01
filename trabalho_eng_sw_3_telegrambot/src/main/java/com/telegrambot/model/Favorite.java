package com.telegrambot.model;

public class Favorite {
	
	private String nomeFilm;
	private String generoFilm;
	private String anoFilm;
	
	public Favorite() {}
	
	public Favorite(String nomeFilm, String generoFilm, String anoFilm) {
		this.nomeFilm = nomeFilm;
		this.generoFilm = generoFilm;
		this.anoFilm = anoFilm;
	}

	public String getNomeFilm() {
		return nomeFilm;
	}
	
	public void setNomeFilm(String nomeFilm) {
		this.nomeFilm = nomeFilm;
	}
	
	public String getGeneroFilm() {
		return generoFilm;
	}
	
	public void setGeneroFilm(String generoFilm) {
		this.generoFilm = generoFilm;
	}
	
	public String getAnoFilm() {
		return anoFilm;
	}
	
	public void setAnoFilm(String anoFilm) {
		this.anoFilm = anoFilm;
	}
	
	public boolean addFavorite() {
		return true;
	}

}
