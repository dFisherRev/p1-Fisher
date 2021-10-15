package com.main.controllers;

import com.google.gson.Gson;
import com.main.models.LoginDTO;
import com.main.services.LoginService;
import com.main.utils.JwtUtil;

import io.javalin.http.Handler;

public class LoginController {

	
	LoginService ls = new LoginService();
	public Handler loginHandler = (ctx) -> {
		String body = ctx.body(); 
		Gson gson = new Gson();
		LoginDTO LDTO = gson.fromJson(body, LoginDTO.class);
		System.out.println(LDTO.getUsername());
		if (ls.login(LDTO.getUsername(), LDTO.getPassword())) {
			String jwt = JwtUtil.generate(LDTO.getUsername(), LDTO.getPassword());
			
			ctx.req.getSession();
			ctx.status(200);
			ctx.result("Login Successful");
		}else {
			ctx.status(401);
			ctx.result("Login no good :(");
		}
		
		
		
		
		
	};
	
}
