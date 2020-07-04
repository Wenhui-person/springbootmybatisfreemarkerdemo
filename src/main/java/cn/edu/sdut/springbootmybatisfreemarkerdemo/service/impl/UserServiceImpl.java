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
        return this.userMapper.queryUsers(tbuser);
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
        return this.userMapper.queryUserByUsername(username);
    }

    @Override
    public int addUser(Tbuser tbuser) {
        return this.userMapper.addUser(tbuser);
    }

    @Override
    public int updateUser(Tbuser tbuser) {
        return this.userMapper.updateUser(tbuser);
    }

    @Override
    public int deleteUser(int userid) {
        return this.userMapper.deleteUser(userid);
    }
}
