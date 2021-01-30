package com.kuang.mapper;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：fzj
 * @date ：2021/1/11
 */
public class UserMapperTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        User user2 = mapper.queryUserById(1);
        System.out.println(user2 == user);
        System.out.println(user+"++++++++++++++++++++++++++++++++");


        System.out.println("=========================================");

        Map map = new HashMap();
        map.put("id",1);
        map.put("name","张三丰");
        map.put("pwd","888888");
        mapper.updateUserById(map);
        sqlSession.commit();

        System.out.println("=========================================");

        User user1 = mapper.queryUserById(1);
        System.out.println(user1+"#####################################");



        System.out.println("=========================================");

        System.out.println(user1 == user);


        sqlSession.close();
    }
}
