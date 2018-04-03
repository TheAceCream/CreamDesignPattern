//package other.redisTest;
//
//import redis.clients.jedis.Jedis;
//
//import java.util.List;
//
///**
// * Created by AceCream on 2017/3/29.
// */
//public class RedisJava {
//    public static void main(String[] args) {
//
//        //连接本地Redis服务
//        Jedis jedis = new Jedis("localhost");
//        System.out.println("Connection sucessfully");
//
//        System.out.println("server is running "+ jedis.ping());
//
//        /**
//         * 测试字符串 String
//         */
////        jedis.set("name","jack");
////        System.out.println(jedis.get("name"));
////        System.out.println(jedis.del("name"));
//
//        /**
//         * 测试List
//         */
//        jedis.lpush("myList","lol");
//        jedis.lpush("myList","dota");
//        jedis.lpush("myList","梦三");
//        List<String> list = jedis.lrange("myList",0,10);
//        for (String s :
//                list) {
//            System.out.println(s);
//        }
////        System.out.println(jedis.del("myList"));
////        System.out.println();
//
//
//
//
//    }
//}
