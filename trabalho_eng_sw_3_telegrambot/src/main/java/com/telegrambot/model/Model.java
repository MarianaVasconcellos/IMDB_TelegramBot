package com.telegrambot.model;

import java.util.LinkedList;
import java.util.List;

import org.telegram.telegrambots.meta.api.objects.Update;

import com.telegrambot.view.Beholder;

public class Model implements Notify{
	
	private List<Beholder> observers = new LinkedList<Beholder>();
	private List<Favorite> favorities = new LinkedList<Favorite>();

	
	private static Model uniqueInstance;
	
	public static Model getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new Model();
		}
		return uniqueInstance;
	}

	public void registerObserver(Beholder observer){
		observers.add(observer);
	}
	
	public void notifyObservers(long chatId, String favoriteData){
		for(Beholder observer:observers){
			observer.update(chatId, favoriteData);
		}
	}
	
	public void addFavorite(Favorite favorite) {
		this.favorities.add(favorite);
	}
	
	public void searchFavorite(Update update){
		String favoriteData = null;
		for(Favorite favorite: favorities){
			if(favorite.getNomeFilm().equals(update.getMessage().getText())) {
				favoriteData = favorite.getGeneroFilm();
			}
		}
		
		if(favoriteData != null){
			this.notifyObservers(update.getMessage().getChatId(), favoriteData);
		} else {
			this.notifyObservers(update.getMessage().getChatId(), "Nada encontrado :(");
		}
	}
}
