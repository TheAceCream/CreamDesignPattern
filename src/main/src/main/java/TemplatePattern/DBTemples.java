package TemplatePattern;

/**
 * Author:Cream
 * Date:2018/4/3
 * Description:
 * 举一个不太恰当的例子，中间省略很多
 * 数据库操作顺序：
 * 1.需要先建立连接
 * 2.执行增、删、改、查
 * 3.关闭连接
 */
public abstract class DBTemples {

    protected void didSQL(){
        this.conn();
        this.doSQL();
        this.closeConn();
    }

    /**
     * 连接
     */
    abstract void conn();

    /**
     * 执行
     */
    abstract void doSQL();

    /**
     * 关闭
     */
    abstract void closeConn();

}
