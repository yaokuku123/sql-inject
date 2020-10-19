package com.yqj.pojo;

/**
 * Copyright(C),2019-2020,XXX公司
 * FileName: User
 * Author: yaoqijun
 * Date: 2020/10/19 11:35
 */
import java.util.Date;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 讲师
 * </p>
 *
 * @author yqj
 * @since 2020-08-26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EduTeacher implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String intro;

    private String career;

    private Integer level;

    private String avatar;

    private Integer sort;

    private Boolean isDeleted;

    private Date gmtCreate;

    private Date gmtModified;
}