package com.kuang.mapper;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author ：fzj
 * @date ：2021/1/8
 */
public interface UserMapper {


    @Select("select * from user")
    List<User> getAllUsers();

}
