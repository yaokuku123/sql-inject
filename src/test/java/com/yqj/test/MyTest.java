package com.yqj.test;

/**
 * Copyright(C),2019-2020,XXX公司
 * FileName: MyTest
 * Author: yaoqijun
 * Date: 2020/10/19 11:37
 */
import com.yqj.dao.EduTeacherMapper;
import com.yqj.pojo.EduTeacher;
import com.yqj.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {

    @Test
    public void testSelectEduTeacher(){
        SqlSession session = MybatisUtils.getSession();
        EduTeacherMapper mapper = session.getMapper(EduTeacherMapper.class);
        List<EduTeacher> teachers = mapper.selectEduTeacher();
        for (EduTeacher teacher : teachers) {
            System.out.println(teacher);
        }
        session.close();
    }

    @Test
    public void testSelectByName(){
        SqlSession session = MybatisUtils.getSession();
        EduTeacherMapper mapper = session.getMapper(EduTeacherMapper.class);
        List<EduTeacher> teachers = mapper.selectByName("%yorick%");
        for (EduTeacher teacher : teachers) {
            System.out.println(teacher);
        }
        session.close();
    }

    @Test
    public void testSelectByNameErr(){
        SqlSession session = MybatisUtils.getSession();
        EduTeacherMapper mapper = session.getMapper(EduTeacherMapper.class);
        List<EduTeacher> teachers = mapper.selectByNameErr("yorick");
        //List<EduTeacher> teachers = mapper.selectByNameErr("' or '1'='1");
        for (EduTeacher teacher : teachers) {
            System.out.println(teacher);
        }
        session.close();
    }
}
