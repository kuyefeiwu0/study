package com.lcf.demo.serverImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcf.demo.entity.Users;
import com.lcf.demo.mapper.UserMapper;
import com.lcf.demo.serverInterface.UsersServer;
@Service
public class UsersServerImpl implements UsersServer{
	@Autowired
	private UserMapper usersMapper;

	@Override
	public List<Users> findAll() {
		 
		return usersMapper.findAll();
	}

}
