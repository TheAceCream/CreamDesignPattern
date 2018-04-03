package TemplatePattern;

/**
 * Author:Cream
 * Date:2018/4/3
 * Description:
 */
public class MySQLWant extends DBTemples{

    @Override
    void conn() {
        System.out.println("这里写MySQL的连接");
    }

    @Override
    void doSQL() {
        System.out.println("这里写MySQL语句的实现");
    }

    @Override
    void closeConn() {
        System.out.println("这里关MySQL连接");
    }

}
