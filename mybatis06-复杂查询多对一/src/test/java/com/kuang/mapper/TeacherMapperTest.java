package com.kuang.mapper;

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
    public void TestTeacherStudent(){
        SqlSession sqlSession = MybatisUtils.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudent();
        students.forEach(System.out::println);


        sqlSession.close();
    }
    @Test
    public void TestTeacherStudent2(){
        SqlSession sqlSession = MybatisUtils.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudent2();
        students.forEach(System.out::println);


        sqlSession.close();
    }




    @Test
    public void TestTeacher(){
        SqlSession sqlSession = MybatisUtils.getSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.getAllTeachers();
        teachers.forEach(System.out::println);


        sqlSession.close();
    }
}
