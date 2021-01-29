package com.kuang.mapper;


import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ：fzj
 * @date ：2021/1/8
 */
public class UserMapperTest {


    @Test
    public void getAllUsers(){
        SqlSession sqlSession = MybatisUtils.getSession();
        //底层主要运用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getAllUsers();
        userList.forEach(System.out::println);


        sqlSession.close();
    }

}
