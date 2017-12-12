package com.lcf.demo.control;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lcf.demo.serverInterface.JedisServer;

@Component
@Path("/login")
@Produces(MediaType.APPLICATION_JSON)
public class Login {
	@Autowired
	private JedisServer jedisServer;
	
	@GET
	public Map<String, Object> login() {
		jedisServer.seckill();
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("hello", "world");
		return m;
	}

}
