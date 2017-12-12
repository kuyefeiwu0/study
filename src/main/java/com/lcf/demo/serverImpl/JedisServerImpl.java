package com.lcf.demo.serverImpl;

import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;

import com.lcf.demo.serverInterface.JedisServer;
import com.lcf.demo.utils.JedisUtil;

@Service
public class JedisServerImpl implements JedisServer {

	public boolean seckill() {
		Jedis jedis = JedisUtil.getWithJedisPool("192.168.204.128", 6379, "redis");
		Long seckNumber = jedis.incr("seckill1");
		if (seckNumber <= 10) {
			System.out.println(Thread.currentThread().getName() + "----" + seckNumber);
		}
		jedis.close();
		return false;
	}

}
