package com.kuang.mapper;

import com.kuang.mapper.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ：fzj
 * @date ：2021/1/8
 */
public class UserDaoTest {


    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        User user = userDao.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }

}
