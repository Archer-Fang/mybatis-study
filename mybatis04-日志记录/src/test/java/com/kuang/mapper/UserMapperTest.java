package com.kuang.mapper;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：fzj
 * @date ：2021/1/8
 */
public class UserMapperTest {


    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void testLog4j() {
        logger.info("info:进入了log4j");
        logger.debug("debug:进入了log4j");
        logger.error("error:进入了log4j");
    }

    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


        Map<String, Integer> map = new HashMap<>();
        map.put("startIndex",0);
        map.put("pageSize",2);

        List<User> user = mapper.getUserByLimit(map);
        user.forEach(System.out::println);

        sqlSession.close();
    }

}
