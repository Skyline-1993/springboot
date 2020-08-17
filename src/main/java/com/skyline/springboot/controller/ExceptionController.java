package com.skyline.springboot.controller;

import com.skyline.springboot.util.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangkepeng
 */
@RestController
public class ExceptionController {

    @RequestMapping("/exception")
    public R exception() {
        int i = 10 / 0;
        return R.ok();
    }

    @RequestMapping("/nullException")
    public R nullException() {
        String str = null;
        str.split("@");
        return R.ok();
    }

    @RequestMapping("/indexOutOfException")
    public R indexOutOfException() {
        int[] arr = {2, 5};
        System.out.println(arr[2]);
        return R.ok();
    }

    @PostMapping("/testing")
    public R test() {
        System.out.println("lalala");
        return R.ok();
    }

    public void test2() {
        System.out.println("222222");
        System.out.println("3333333333333");
    }

    public void test3() {
        System.out.println("丢掉后再提交");
    }
}
