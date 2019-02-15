package com.how2java.springboot.hutool;

import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @author huwei@huniutech.com
 * @date 2019/02/15 10:15
 */
public class TestHutool {

    public static void main(String[] args) {
        String dateStr = "2012-12-12 12:12:12";
        Date date = DateUtil.parse(dateStr);
        System.out.println(date);
    }

}
