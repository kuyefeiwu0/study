package com.lcf.demo.control;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lcf.demo.entity.Users;
import com.lcf.demo.serverInterface.UsersServer;

@Path("/users")
@Component
@Produces(MediaType.APPLICATION_JSON)
public class UsersControl {
	@Autowired
	private UsersServer usersServer;

	@GET
	public List<Users> findAll() {
		return usersServer.findAll();
	}

}
