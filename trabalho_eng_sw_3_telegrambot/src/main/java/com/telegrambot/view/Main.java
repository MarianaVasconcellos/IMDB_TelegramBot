package com.telegrambot.view;

import java.io.IOException;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import com.telegrambot.model.Favorite;
import com.telegrambot.model.Model;

public class Main {
	
	private static Model model;

	public static void main(String[] args) throws IOException {
		
		ApiContextInitializer.init();
		model = Model.getInstance();
		
		TelegramBotsApi bot = new TelegramBotsApi();
		
		try {
			bot.registerBot(new View());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
		
		initializeModel(model);
	}
	
	public static void initializeModel(Model model){
		model.addFavorite(new Favorite("Blade Runner", "Cyberpunk", "1982"));;
	}
}
