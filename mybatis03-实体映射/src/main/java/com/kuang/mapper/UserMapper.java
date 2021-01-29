package com.kuang.mapper;

import com.kuang.pojo.User;

import java.util.List;

/**
 * @author ：fzj
 * @date ：2021/1/8
 */
public interface UserMapper {

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User getUserById(Integer id);

}
