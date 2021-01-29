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
     * @param
     * @return
     */
    List<User> getUserByLimit(Map map);

}
