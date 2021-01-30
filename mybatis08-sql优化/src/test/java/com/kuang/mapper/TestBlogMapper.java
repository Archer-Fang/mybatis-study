package com.kuang.mapper;

import com.kuang.pojo.Blog;
import com.kuang.utils.IdUtils;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @author ：fzj
 * @date ：2021/1/11
 */
public class TestBlogMapper {



    @Test
    public void addBlog(){
        SqlSession sqlSession = MybatisUtils.getSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IdUtils.getId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews (9999);
        mapper.addBlog(blog);


        blog.setId(IdUtils.getId());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);

        sqlSession.commit();

        sqlSession.close();

    }


    /**
     * if语句，在where中自动进行拼接
     *
     */
    @Test
    public void queryBlogIf(){
        SqlSession sqlSession = MybatisUtils.getSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        map.put("title","Mybatis如此简单");
        map.put("author","狂神说");
        List<Blog> blogs = mapper.queryBlogIf(map);
        blogs.forEach(System.out::println);


        sqlSession.close();
    }

    /**
     * choose语句，选择第一个匹配的，后面不继续进行匹配
     */
    @Test
    public void queryBlogChoose(){
        SqlSession sqlSession = MybatisUtils.getSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        map.put("title","Mybatis如此简单");
        map.put("author","狂神说");
        map.put("views",9999);
        List<Blog> blogs = mapper.queryBlogChoose(map);
        blogs.forEach(System.out::println);


        sqlSession.close();
    }


    /**
     * set语句，去掉多余逗号
     */
    @Test
    public void updateBlog(){
        SqlSession sqlSession = MybatisUtils.getSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        map.put("title","Mybatis如此简单1111");
        map.put("author","狂神说11111");
        map.put("id","3ed8b5aecb2249db9e6f42806443c855");
        mapper.updateBlog(map);
        sqlSession.commit();

        sqlSession.close();
    }


    /**
     * sql片段
     *
     */
    @Test
    public void queryBlogSql(){
        SqlSession sqlSession = MybatisUtils.getSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        map.put("title","Mybatis如此简单");
        map.put("author","狂神说");
        List<Blog> blogs = mapper.queryBlogSql(map);
        blogs.forEach(System.out::println);


        sqlSession.close();
    }

    /**
     * sql片段
     *
     */
    @Test
    public void queryBlogForEach(){
        SqlSession sqlSession = MybatisUtils.getSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        List ids = new ArrayList();
        ids.add("1");
        ids.add("2");
        ids.add("3");

        map.put("ids",ids);
        List<Blog> blogs = mapper.queryBlogForEach(map);
        blogs.forEach(System.out::println);


        sqlSession.close();
    }

}
