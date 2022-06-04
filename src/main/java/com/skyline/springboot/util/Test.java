package com.skyline.springboot.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @author zhangkepeng
 */
public class Test {

    public static void main(String[] args) {
        String str = "  ";
        // isBlank 判断字符串是否为 空字符串、null、空格、tab制表符
        boolean blank = StringUtils.isBlank(str);

        // isEmpty 判断字符串是否是空或者null(空格、tab制表符等不是空字符串，所以会返回false)
        boolean empty = StringUtils.isEmpty(str);

        System.out.println(blank);
        System.out.println(empty);
    }

}
