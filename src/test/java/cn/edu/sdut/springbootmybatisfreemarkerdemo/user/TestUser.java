package cn.edu.sdut.springbootmybatisfreemarkerdemo.user;

import cn.edu.sdut.springbootmybatisfreemarkerdemo.SpringbootmybatisfreemarkerdemoApplicationTests;
import cn.edu.sdut.springbootmybatisfreemarkerdemo.entity.Tbuser;
import cn.edu.sdut.springbootmybatisfreemarkerdemo.service.UserService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

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
    private void print(int row){
        if(row>0){
            System.out.println("操作成功");
        }else{
            System.out.println("操作失败");
        }
    }
    @Test
    public void testAddUser(){
        Tbuser tbuser=new Tbuser(0,"hekemin","1234","01","敬神",null);
        this.print(this.userService.addUser(tbuser));
    }
    @Test
    public void testUpdateUser(){
        Tbuser tbuser=new Tbuser(20,"hekemin","12345","01","jingshen",null);
        this.print(this.userService.updateUser(tbuser));
    }
    @Test
    public void testDeleteUser(){
        int userid=20;
        this.print(this.userService.deleteUser(userid));
    }
    @Test
    public void testQueryUserByUsername(){
        String username="耿梦迪";
        Tbuser tbuser=this.userService.queryUserByUsername(username);
        System.out.println("tbuser = " + tbuser);
    }
    @Test
    public void testQueryUsers(){
        Tbuser tbuser=new Tbuser();
        tbuser.setUsername("y");
        tbuser.setUserroles("02");
        List<Tbuser> tbusers=this.userService.queryUsers(tbuser);
        tbusers.forEach(u-> System.out.println("u = " + u));
    }
}
