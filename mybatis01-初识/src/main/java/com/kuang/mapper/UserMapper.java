package com.kuang.mapper;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author ：fzj
 * @date ：2021/1/8
 */
public interface UserMapper {

    /**
     * 查询所有用户
     * @return
     */
    List<User> getUserList();

    /**
     * 模糊查询用户
     */
    List<User> getUserLike(String name);


    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 插入一个用户
     */
    Integer addUser(User user);

    /**
     * 插入一个用户2
     */
    Integer addUser2(Map<String,Object> map);

    /**
     * 修改用户
     */
    Integer updateUser(User user);

    /**
     * 删除用户
     */
    Integer deleteUser(Integer id);
}
