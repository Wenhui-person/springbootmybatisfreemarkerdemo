package cn.edu.sdut.springbootmybatisfreemarkerdemo.service.impl;

import ch.qos.logback.classic.turbo.TurboFilter;
import cn.edu.sdut.springbootmybatisfreemarkerdemo.entity.Tbuser;
import cn.edu.sdut.springbootmybatisfreemarkerdemo.mapper.UserMapper;
import cn.edu.sdut.springbootmybatisfreemarkerdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<Tbuser> queryUsers(Tbuser tbuser) {
        return null;
    }

    @Override
    public Tbuser queryUserById(int userid) {
        return this.userMapper.queryUserById(userid);
    }

    @Override
    public Tbuser login(Tbuser tbuser) {
        return this.userMapper.login(tbuser);
    }

    @Override
    public Tbuser queryUserByUsername(String username) {
        return null;
    }

    @Override
    public int addUser(Tbuser tbuser) {
        return 0;
    }

    @Override
    public int updateUser(Tbuser tbuser) {
        return 0;
    }

    @Override
    public int deleteUser(int userid) {
        return 0;
    }
}
