package com.main.services;

import java.util.List;

import com.main.daos.ClientsDao;
import com.main.models.Clients;

public class ClientsService {
	ClientsDao cDao = new ClientsDao();
	public List<Clients> getAllClients(){
		return cDao.getAllClients();
	}
	public void addClients(Clients client) {
		cDao.addClients(client);
	}
	
}
