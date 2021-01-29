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
public class UserDaoTest {


    @Test
    public void getUserList() {
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();
        userList.forEach(System.out::println);

        sqlSession.close();
    }

    @Test
    public void getUserLike() {
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserLike("李");
        System.out.println(userList);
        userList.forEach(System.out::println);

        sqlSession.close();
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        User user = userDao.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void addUser() {
        User user = new User(4, "王五", "999999");
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        Integer integer = userDao.addUser(user);
        sqlSession.commit();
        System.out.println(integer);

        sqlSession.close();
    }

    @Test
    public void updateUser() {
        User user = new User(4, "赵四", "888888");
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        Integer integer = userDao.updateUser(user);
        sqlSession.commit();
        System.out.println(integer);

        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        Integer integer = userDao.deleteUser(4);
        sqlSession.commit();
        System.out.println(integer);

        sqlSession.close();
    }
}
