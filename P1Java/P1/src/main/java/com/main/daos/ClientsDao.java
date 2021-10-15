package com.main.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.main.models.Clients;
import com.main.utils.ConnectionUtil;

public class ClientsDao implements ClientInterface {

	
	//HomeDao hDao = new HomeDao();
	@Override
	public List<Clients> getAllClients() {
		//System.out.println("here babyyyyyyyyyyyyyyyyyyyy");
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM clients";
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery(sql);
			List<Clients> clientList = new ArrayList<>();
			while(rs.next()) {
				Clients a = new Clients(
						rs.getInt("policy_id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getInt("deductable"),
						rs.getString("home_location"));
		//		if (rs.getString("home_location") != null) {
			//		a.setHome_location(hDao.getHomeByAddress(rs.getString("home_location")));
				
				clientList.add(a);
			}
			return clientList;
			
			
		}catch (SQLException e) {
			System.out.println("GET ALL action failed");
			e.printStackTrace();
		}
		return null;
	
}

	@Override
	public Clients getClientById(int id) {
		
		return null;
	}

	@Override
	public void addClients(Clients client) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "insert into clients (first_name, last_name, deductable, home_location) values (?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, client.getFirst_name());
			ps.setString(2, client.getLast_name());////here $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
			ps.setInt(3, client.getDeductable());
			ps.setString(4,client.getHome_location());
			ps.executeUpdate();
			
			System.out.println("added");
			
		}catch(SQLException e){
			System.out.println("Database Error");
			e.printStackTrace();		
		}
		
	}

	@Override
	public boolean deleteClients(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
// get examples from p0 demo