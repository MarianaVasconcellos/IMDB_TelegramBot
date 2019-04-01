package com.telegrambot.view;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import com.telegrambot.constantes.Constatntes;
import com.vdurmont.emoji.EmojiParser;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

public class View extends TelegramLongPollingBot implements Constatntes {
		
	@Override
	public void onUpdateReceived(Update update) {
		
		final String smile_emoji = EmojiParser.parseToUnicode(":smiley:");
		
		String cmd = update.getMessage().getText();
		
		if(cmd.toLowerCase().equals("/imdb")) {
		
			if (update.hasMessage() && update.getMessage().hasText()) {
			
				SendMessage msg = new SendMessage()
						.setChatId(update.getMessage().getChatId())
						.setText("https://www.imdb.com/movies-in-theaters/");
				
				try {
					execute(msg);
				} catch (TelegramApiException e) {
					e.printStackTrace();
				}
			}
		} else if (cmd.toLowerCase().equals("/start")) {
			SendMessage msg = new SendMessage()
					.setChatId(update.getMessage().getChatId())
					.setText("Olá sou um bot não oficial do IMDB, vamos começar?\n"
							+ "Envie /imdb e saiba da últimas novidades no cinema. " + smile_emoji);
			
			try {
				execute(msg);
			} catch (TelegramApiException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public String getBotUsername() {
		return "Imdb Bot";
	}

	@Override
	public String getBotToken() {
		return tokenTelegram;
	}
	
	private void searchDirector(Update update, String cmd, String search) {
		String cmd = update.getMessage().getText().toLowerCase();
		if (cmd.equals("/diretores")) {
			
		}
	}
}
