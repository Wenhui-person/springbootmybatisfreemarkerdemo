package cn.edu.sdut.springbootmybatisfreemarkerdemo.mapper;

import cn.edu.sdut.springbootmybatisfreemarkerdemo.entity.Tbuser;

import java.util.List;

public interface UserMapper {
    //常规的CRUD操作
    List<Tbuser> queryUsers(Tbuser tbuser);
    Tbuser queryUserById(int userid);
    Tbuser login(Tbuser tbuser);
    Tbuser queryUserByUsername(String username);
    int addUser(Tbuser tbuser);
    int updateUser(Tbuser tbuser);
    int deleteUser(int userid);
}
