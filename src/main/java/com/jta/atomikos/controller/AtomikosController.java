/*
 * @(#) AtomikosController.java 2021/3/8
 *
 * Copyright (c) 2016, XUWC Technology. All Rights Reserved. XUWC Technology. CONFIDENTIAL
 */
package com.jta.atomikos.controller;

import com.jta.atomikos.service.AtomikosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuwc
 * @version 1.0
 * @since 2021/3/8
 */
@RestController
@RequestMapping("/atomikos")
public class AtomikosController {

    @Autowired
    private AtomikosService atomikosService;

    @GetMapping("/test")
    public String test(@RequestParam("name")String name){
        return  atomikosService.testAtomikos(name);
    }

}
