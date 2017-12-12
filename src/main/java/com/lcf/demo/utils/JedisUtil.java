package com.lcf.demo.utils;

import org.springframework.util.StringUtils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisUtil {

	private static JedisPool jedisPool;

	public static Jedis singleJedis(String host, int port, String passWord) {
		Jedis jedis = new Jedis(host, port);
		if (!StringUtils.isEmpty(passWord))
			jedis.auth(passWord);
		jedis.close();
		return jedis;
	}

	public static Jedis getWithJedisPool(String host, int port, String passWord) {
		if (jedisPool == null) {
			initJedisPool(host, port, passWord);
		}
		return jedisPool.getResource();
	}

	public synchronized static void initJedisPool(String host, int port, String passWord) {
		if (jedisPool == null) {
			JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
			jedisPoolConfig.setMaxTotal(100);
			jedisPoolConfig.setMaxIdle(10);
			jedisPoolConfig.setMaxWaitMillis(1000);

			jedisPool = new JedisPool(jedisPoolConfig, host, port,1000,passWord);

		}

	}
}
