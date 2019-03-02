package cn.appsys.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class jedisTest {
//@Resource
private JedisPool jedisPool;
@Test
public void test1(){	
	/*Jedis resource = jedisPool.getResource();
	resource.set("name", "Ω≠≥–» ");
	System.out.println(resource.get("name"));*/
	ApplicationContext ctx = new ClassPathXmlApplicationContext("app*.xml");
	jedisPool = ctx.getBean(JedisPool.class);
	Jedis resource = jedisPool.getResource();
	resource.set("name", "Ω≠≥–» ");
	System.out.println(resource.get("name"));
	jedisPool.returnResource(resource);
}
@Test
public void test2(){
	JedisPool jedisPool = new JedisPool("localhost",6379);
	Jedis jedis = jedisPool.getResource();
	jedis.set("name", "Ω≠≥–» ");
	System.out.println(jedis.get("name"));
}
}
