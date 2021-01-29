package com.kuang.mapper;

import com.kuang.mapper.StudentMapper;
import com.kuang.mapper.TeacherMapper;
import com.kuang.pojo.Student;
import com.kuang.pojo.Teacher;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ：fzj
 * @date ：2021/1/9
 */
public class TeacherMapperTest {

    @Test
    public void TestTeacher(){
        SqlSession sqlSession = MybatisUtils.getSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.getAllTeachers();
        teachers.forEach(System.out::println);


        sqlSession.close();
    }

    @Test
    public void getTeacher1(){
        SqlSession sqlSession = MybatisUtils.getSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher1(1);
        System.out.println(teacher);


        sqlSession.close();
    }

    @Test
    public void getTeacher2(){
        SqlSession sqlSession = MybatisUtils.getSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher2(1);
        System.out.println(teacher);


        sqlSession.close();
    }
}
