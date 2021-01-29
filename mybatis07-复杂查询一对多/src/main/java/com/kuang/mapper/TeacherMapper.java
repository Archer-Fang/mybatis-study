package com.kuang.mapper;

import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ：fzj
 * @date ：2021/1/9
 */
public interface TeacherMapper {


    //获取老师
    List<Teacher> getAllTeachers();

    //获取指定老师下所有学生及老师的信息
    Teacher getTeacher1(@Param("tid") Integer id);


    Teacher getTeacher2(@Param("tid") Integer id);
}
