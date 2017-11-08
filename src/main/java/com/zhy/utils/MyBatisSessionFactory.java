package com.zhy.utils;

import org.apache.ibatis.builder.SqlSourceBuilder;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.InputStream;

public class MyBatisSessionFactory {

    // 取得MyBatis的核心配置文件，此处定义了文件的路径
    private static final String CONFIG_FILE = "mybatis.cfg.xml";

    // 描述的是保存当前线程操作的SqlSession接口对象
    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();

    // 定义的是数据库连接池对象，通过连接池可以为不同的线程打开SqlSession
    private static SqlSessionFactory factory = null;

    // 对于核心配置文件的读取需要通过InputStream类完成
    private static InputStream input = null;

    // 编写一个静态代码块，主要目的是通过改代码块可以去的SqlSessionFactory对象,代码块先执行
    static {
        // 建立新的SqlSessionFactory连接
        rebuildSqlSessionFactory();
    }

    /**
     * 重新建立一个新的sqlSessionFactory接口对象
     */
    public static void rebuildSqlSessionFactory() {
        try {
            // 读取资源文件的内容
            input = Resources.getResourceAsStream(CONFIG_FILE);
            //  创建连接工厂
            factory = new SqlSessionFactoryBuilder().build(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 打开或者市区的一个已经存在的SqlSession接口对象
     * @return SqlSession实例
     */
    public static SqlSession getSession() {
        // 通过ThreadLocal取得保存过的SqlSession
        SqlSession sqlSession = threadLocal.get();
       // 此时还未保存SqlSession对象
        if (sqlSession == null) {
            // 此时还未创建SqlSessionFactory接口对象
            if (factory == null) {
                // 重新创建SqlSessionFactory接口对象
                rebuildSqlSessionFactory();
            }
            // 取得SqlSession对象
            sqlSession = factory.openSession();
            // 保存SqlSession供下次继续使用
            threadLocal.set(sqlSession);
        }
        return sqlSession;
    }

    /**
     * 取得已经创建好的SqlSessionFactory对象
     * @return 返回SqlSessionFactory对象
     */
    public static SqlSessionFactory getFactory() {
        return factory;
    }

    /**
     * 执行SqlSession的关闭处理，同时还需要清空ThreadLocal对象的保存内容
     */
    public static void close() {
        // 通过ThreadLocal取得保存过的SqlSession
        SqlSession sqlSession = threadLocal.get();
        if (sqlSession != null) {
            sqlSession.close();
            try {
                input.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            threadLocal.remove();
        }
    }

}
