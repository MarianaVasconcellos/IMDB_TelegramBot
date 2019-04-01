package com.telegrambot.controller;

import org.telegram.telegrambots.meta.api.objects.Update;

import com.telegrambot.model.Model;
import com.telegrambot.view.View;

public class Controller {
	
	private Model model;
	private View view;
	
	public Controller(Model model, View view){
		this.model = model;
		this.view = view;
	}
	
	
}
