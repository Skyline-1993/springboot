package com.skyline.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

/**
 * @author  zhangkepeng
 * @date 2020-04-06 
 */
@Data
@TableName("t_user")
public class User {

	private Long id;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 真实姓名
	 */
	private String realName;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 昵称
	 */
	private String nickName;
	/**
	 * 性别
	 */
	private String gender;
	/**
	 * 手机号码
	 */
	private String mobile;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 出生日期
	 */
	private Date birthday;
	/**
	 * 账户状态(1正常，0停用)
	 */
	private String status;
	/**
	 * 账户注册时间
	 */
	private Date registrationTime;
	/**
	 * 备注
	 */
	private String remarks;

}
