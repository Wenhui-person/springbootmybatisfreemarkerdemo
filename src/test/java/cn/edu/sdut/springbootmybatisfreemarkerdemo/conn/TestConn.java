package cn.edu.sdut.springbootmybatisfreemarkerdemo.conn;

import cn.edu.sdut.springbootmybatisfreemarkerdemo.SpringbootmybatisfreemarkerdemoApplicationTests;
import org.junit.Test;


import javax.sql.DataSource;
import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.SQLException;

public class TestConn extends SpringbootmybatisfreemarkerdemoApplicationTests {
    @Resource
    private DataSource dataSource;

    @Test
    public void testConn() throws SQLException{
        Connection connection=this.dataSource.getConnection();
        System.out.println("connection = " + connection);
    }
}
