package com.telegrambot.model;

import com.telegrambot.view.Beholder;

public interface Notify {

	public void registerObserver(Beholder observer);
	public void notifyObservers(long chatId, String favoritiesData);

}
