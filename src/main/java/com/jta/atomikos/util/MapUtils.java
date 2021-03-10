/*
 * @(#) MapUtils.java 2021/3/5
 *
 * Copyright (c) 2016, XUWC Technology. All Rights Reserved. XUWC Technology. CONFIDENTIAL
 */
package com.jta.atomikos.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.*;

/**
 * @author xuwc
 * @version 1.0
 * @since 2021/3/5
 */
public class MapUtils {

    private static Logger logger = LoggerFactory.getLogger(MapUtils.class);

    public MapUtils() {
    }

    public static LinkedHashMap<String, Object> object2Map(Object obj) {
        LinkedHashMap<String, Object> map = new LinkedHashMap();
        if (obj == null) {
            return map;
        } else {
            Class clazz = obj.getClass();

            ArrayList fieldList;
            for(fieldList = new ArrayList(); clazz != null; clazz = clazz.getSuperclass()) {
                fieldList.addAll(Arrays.asList(clazz.getDeclaredFields()));
            }

            try {
                Iterator var4 = fieldList.iterator();

                while(var4.hasNext()) {
                    Field field = (Field)var4.next();
                    field.setAccessible(true);
                    map.put(field.getName(), field.get(obj));
                }
            } catch (Exception var6) {
                logger.error("实体对象转成Map{}", var6);
            }

            return map;
        }
    }

    public static TreeMap<String, String> objectTreeMap(Object obj) {
        TreeMap<String, String> map = new TreeMap();
        if (obj == null) {
            return map;
        } else {
            Class clazz = obj.getClass();

            ArrayList fieldList;
            for(fieldList = new ArrayList(); clazz != null; clazz = clazz.getSuperclass()) {
                fieldList.addAll(Arrays.asList(clazz.getDeclaredFields()));
            }

            try {
                Iterator var4 = fieldList.iterator();

                while(var4.hasNext()) {
                    Field field = (Field)var4.next();
                    field.setAccessible(true);
                    if (field.get(obj) != null) {
                        map.put(field.getName(), field.get(obj).toString());
                    }
                }
            } catch (Exception var6) {
                var6.printStackTrace();
            }

            return map;
        }
    }
}
