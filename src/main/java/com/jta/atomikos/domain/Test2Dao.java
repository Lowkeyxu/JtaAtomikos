/*
 * @(#) TestDao.java 2021/3/8
 *
 * Copyright (c) 2016, XUWC Technology. All Rights Reserved. XUWC Technology. CONFIDENTIAL
 */
package com.jta.atomikos.domain;

import com.jta.atomikos.entity.Test2Entity;
import org.springframework.stereotype.Repository;

/**
 * @author xuwc
 * @version 1.0
 * @since 2021/3/8
 */
@Repository
public interface Test2Dao {

    int deleteByPrimaryKey(Long id);

    int insert(Test2Entity record);

    int insertSelective(Test2Entity record);

    Test2Entity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Test2Entity record);

    int updateByPrimaryKey(Test2Entity record);
}
