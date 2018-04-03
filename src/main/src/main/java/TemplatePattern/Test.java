package TemplatePattern;

/**
 * Author:Cream
 * Date:2018/4/3
 * Description:
 */
public class Test {

    public static void main(String[] args) {
        MySQLWant mySQLWant = new MySQLWant();
        mySQLWant.didSQL();

        System.out.println();

        OracleWant oracleWant = new OracleWant();
        oracleWant.didSQL();


    }

}
