package com.main;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.main.daos.ClientsDao;
import com.main.models.Clients;
import com.main.utils.ConnectionUtil;

public class JUnitTest {
	public static ClientsDao c;
	public String username;
	List<Clients> result = new ArrayList<>();
	
	
	@BeforeAll	
	public static void createStart() {
			c = new ClientsDao();
			System.out.println("got the test");
		}
	
	
	@Test
	public void testGetAllClients() {
		result = c.getAllClients();
		assertTrue(result != null);
	}
	
	//add more tests for add/delete clients
	@Test
	public void testAddClients() {
		
		};
	@Test
	public void testGetUsername() {
		
	};
	@Test
	public void testGetPassword() {
		
	};
		
	}

