/*
 * @(#) AtomikosServiceImpl.java 2021/3/8
 *
 * Copyright (c) 2016, XUWC Technology. All Rights Reserved. XUWC Technology. CONFIDENTIAL
 */
package com.jta.atomikos.service.impl;

import com.jta.atomikos.domain.Test2Dao;
import com.jta.atomikos.dao.TestDao;
import com.jta.atomikos.entity.Test2Entity;
import com.jta.atomikos.entity.TestEntity;
import com.jta.atomikos.service.AtomikosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xuwc
 * @version 1.0
 * @since 2021/3/8
 */
@Service
public class AtomikosServiceImpl implements AtomikosService {

    @Autowired
    private TestDao testDao;

    @Autowired
    private Test2Dao test2Dao;

    @Override
    @Transactional
    public String testAtomikos(String name) {

        TestEntity testEntity = new TestEntity();
        testEntity.setName(name);
        int result = testDao.insertSelective(testEntity);
        if(result > 0){
            Test2Entity test2Entity = new Test2Entity();
            test2Entity.setId(1L);
            test2Entity.setName(name);
            result = test2Dao.insertSelective(test2Entity);
        }
        return "result:"+result;
    }
}
