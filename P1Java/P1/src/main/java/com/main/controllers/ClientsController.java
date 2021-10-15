package com.main.controllers;

import java.util.List;

import com.google.gson.Gson;
import com.main.models.Clients;
import com.main.services.ClientsService;

import io.javalin.http.Handler;

public class ClientsController {
	ClientsService cs = new ClientsService();
	public Handler getAllClientsHandler = (ctx) -> {
		List<Clients> allClients = cs.getAllClients();
		
		Gson gson = new Gson();
		String JsonClients = gson.toJson(allClients);
		
		ctx.result(JsonClients);
		
		ctx.status(200);
	};
	
	
	public Handler addClientHandler = (ctx) -> {
		
		Gson gson = new Gson();
		String something = ctx.body();
		Clients client = gson.fromJson(something, Clients.class);
		cs.addClients(client);
	};
	
	
	
	
	
	
	
	
}
