/*
 * @(#) TestDao.java 2021/3/8
 *
 * Copyright (c) 2016, XUWC Technology. All Rights Reserved. XUWC Technology. CONFIDENTIAL
 */
package com.jta.atomikos.dao;

import com.jta.atomikos.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author xuwc
 * @version 1.0
 * @since 2021/3/8
 */
@Repository
public interface TestDao {

    int deleteByPrimaryKey(Long id);

    int insert(TestEntity record);

    int insertSelective(TestEntity record);

    TestEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TestEntity record);

    int updateByPrimaryKey(TestEntity record);
}
