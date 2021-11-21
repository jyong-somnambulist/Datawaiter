package com.datawaiter.java.redis;

import com.somnambulist.java.utils.ServerConfig;
import redis.clients.jedis.Jedis;

public class RedisDemo {

    private   static  Jedis jedis = new Jedis(ServerConfig.CLUSTER_NODE, ServerConfig.REDIS_PORT);

    public static void main(String[] args) {
//        putData("name","20200918");
        System.out.println(getStrKey("name"));
    }








    //String API
    private static String getStrKey(String key){

        return  jedis.get(key);
    }

    public static String putData(String key,String value){
        return  jedis.set(key,value);
    }



}

