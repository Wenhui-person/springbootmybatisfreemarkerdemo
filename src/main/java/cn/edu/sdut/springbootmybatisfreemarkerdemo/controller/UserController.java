package cn.edu.sdut.springbootmybatisfreemarkerdemo.controller;

import cn.edu.sdut.springbootmybatisfreemarkerdemo.entity.Tbuser;
import cn.edu.sdut.springbootmybatisfreemarkerdemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    public static final String SUCCESS="redirect:queryUsers";

    @RequestMapping("queryUsers")
    public String queryUsers(Tbuser tbuser, ModelMap modelMap){
        List<Tbuser> tbusers=this.userService.queryUsers(tbuser);
        modelMap.put("users",tbusers);
        return "user/listUser";
    }

    @RequestMapping("toAddUser")
    public String toAddUser(){
        return "user/addUser";
    }
    @RequestMapping("doAddUser")
    public String doAddUser(Tbuser tbuser){
        this.userService.addUser(tbuser);
        return SUCCESS;
    }
    //ajax方法，向页面传递内容，但是页面没有跳转
    //需要两个注释配合使用，springboot可以帮我们自动转换JSON数据
    @RequestMapping("ajajQueryUserByUsername")
    @ResponseBody
    public boolean ajajQueryUserByUsername(String username){
        Tbuser tbuser=this.userService.queryUserByUsername(username);
        if(tbuser!=null){
            return true;
        }else{
            return false;
        }
    }
    @RequestMapping("detailUser")
    public String detailUser(int userid,ModelMap modelMap){
        Tbuser tbuser=this.userService.queryUserById(userid);
        modelMap.put("tbuser",tbuser);
        return "user/detailUser";
    }
    @RequestMapping("toUpdateUser")
    public String toUpdateUser(int userid,ModelMap modelMap){
        Tbuser tbuser=this.userService.queryUserById(userid);
        modelMap.put("tbuser",tbuser);
        return "user/updateUser";
    }
    @RequestMapping("doUpdateUser")
    public String doUpdateUser(Tbuser tbuser){
        this.userService.updateUser(tbuser);
        return SUCCESS;
    }
    @RequestMapping("doDeleteUser")
    public String doDeleteUser(int userid){
        this.userService.deleteUser(userid);
        return SUCCESS;
    }
}
