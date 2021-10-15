package com.main.daos;

import java.util.List;

import com.main.models.Clients;

public interface ClientInterface {
	public List<Clients> getAllClients();
	public Clients getClientById(int id);
	public void addClients(Clients client);
	public boolean deleteClients(int id);
}
