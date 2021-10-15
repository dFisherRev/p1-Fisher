package com.main;
import java.util.logging.Logger;

import org.eclipse.jetty.util.log.Log;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.main.controllers.ClientsController;
import com.main.controllers.LoginController;
import com.main.daos.ClientsDao;
import com.main.models.Clients;
import com.main.utils.ConnectionUtil;

import io.javalin.Javalin;
public class Launcher {

	public static void main(String[] args) {
	
		ClientsController cc = new ClientsController();
		LoginController lc = new LoginController();
		ClientsDao cDao = new ClientsDao();
		try (Connection conn = ConnectionUtil.getConnection()){
			System.out.println("Connection established");
			List<Clients> clients = cDao.getAllClients();
			System.out.println(clients);
		}catch (SQLException e) {
			System.out.println("Connection Failed");
			e.printStackTrace();
		}
		
		Javalin app = Javalin.create(
				config -> {config.enableCorsForAllOrigins();}
				
					).start(8080);
				
		
		app.get("p1/clients", cc.getAllClientsHandler);
		
		app.post("p1/login", lc.loginHandler);
		
		app.post("p1/clients", cc.addClientHandler);
		
	}

}
