package com.xxxx.crm.service;

import com.xxxx.crm.exception.MyException;
import com.xxxx.crm.exception.ParamsException;
import com.xxxx.crm.po.User;
import com.xxxx.crm.vo.UserVo;

import java.util.List;
import java.util.Map;

public interface Userservice {

    User selectUserByUserNameAndPwd(String userName, String userPwd) throws ParamsException, MyException;

    void updatePwd(String id, String oldPwd, String newPwd, String repeatPwd) throws ParamsException, MyException;

    Map<String, Object> selectList(UserVo vo);

    void insertUser(User user);

    void updateUser(User user);

    User selectUserInfoById(String id);

    void deleteUser(List<String> ids);
}
