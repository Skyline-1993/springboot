package com.skyline.springboot.util;

import java.util.HashMap;

/**
 * 全局返回前端对象
 *
 * @author zhangkepeng
 */
public class R extends HashMap<String, Object> {

    public R() {
        this.put("code", "000000");
        this.put("msg", "success");
    }

    /**
     * 成功默认返回的对象
     *
     * @return
     */
    public static R ok() {
        return new R();
    }

    /**
     * 成功时自定义返回码，返回消息
     *
     * @param code
     * @param msg
     * @return
     */
    public static R ok(String code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    /**
     * 失败默认返回的对象
     *
     * @return
     */
    public static R error() {
        R r = new R();
        r.put("code", "500000");
        r.put("msg", "failed");
        return r;
    }

    /**
     * 失败时自定义返回码，返回消息
     *
     * @param code 返回码
     * @param msg  返回消息
     * @return 返回对象
     */
    public static R error(String code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    @Override
    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }


}
