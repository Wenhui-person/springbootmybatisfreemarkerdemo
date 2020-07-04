package cn.edu.sdut.springbootmybatisfreemarkerdemo.user;

import cn.edu.sdut.springbootmybatisfreemarkerdemo.SpringbootmybatisfreemarkerdemoApplicationTests;
import cn.edu.sdut.springbootmybatisfreemarkerdemo.entity.Tbuser;
import cn.edu.sdut.springbootmybatisfreemarkerdemo.service.UserService;
import org.junit.Test;

import javax.annotation.Resource;

public class TestUser extends SpringbootmybatisfreemarkerdemoApplicationTests {

    @Resource
    private UserService userService;

    @Test
    public void testQueryUserById(){
        int userid=2;
        Tbuser tbuser=this.userService.queryUserById(userid);
        System.out.println("tbuser = " + tbuser);
    }
    @Test
    public void testLogin(){
        Tbuser tbuser=new Tbuser("admin","1234");
        Tbuser login=this.userService.login(tbuser);
        System.out.println("login = " + login);
    }
}
