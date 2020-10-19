package com.yqj.dao;

/**
 * Copyright(C),2019-2020,XXX公司
 * FileName: UserMapper
 * Author: yaoqijun
 * Date: 2020/10/19 11:36
 */
import com.yqj.pojo.EduTeacher;

import java.util.List;

public interface EduTeacherMapper {
    List<EduTeacher> selectEduTeacher();

    List<EduTeacher> selectByName(String name);

    List<EduTeacher> selectByNameErr(String name);
}
