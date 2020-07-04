package cn.edu.sdut.springbootmybatisfreemarkerdemo.controller;

import cn.edu.sdut.springbootmybatisfreemarkerdemo.entity.Tbuser;
import cn.edu.sdut.springbootmybatisfreemarkerdemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Resource
    private UserService userService;

    @RequestMapping("/")
    public String toLogin(){
        return "index";
    }
    @RequestMapping("doLogin")
    public String login(Tbuser tbuser, HttpSession session, ModelMap modelMap){
        Tbuser login=this.userService.login(tbuser);
        if(login!=null){
            session.setAttribute("user",login);
            return "main/main";
        }else{
            String msg="对不起，用户名或密码错误";
            modelMap.put("msg",msg);
            return "index";
        }
    }
}
