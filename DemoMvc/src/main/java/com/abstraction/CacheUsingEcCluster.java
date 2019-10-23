package com.abstraction;

import org.springframework.beans.factory.annotation.Autowired;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

public class CacheUsingEcCluster implements CacheSoln {

	@Autowired
	Jedis pool;
	
	

	@Override
	public String get(String id) {
		// TODO Auto-generated method stub
		return pool.get(id);
	}

	@Override
	public void set(String id, String name) {
		// TODO Auto-generated method stub
		pool.set(id, name);
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return pool.exists(id);
	}

	

}
