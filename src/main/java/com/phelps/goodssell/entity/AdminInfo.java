package com.phelps.goodssell.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * <p>
 * 
 * </p>
 *
 * @author nickel
 * @since 2018-04-25
 */
@TableName("admin_info")
public class AdminInfo extends Model<AdminInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键，自增
     */
		@JsonFormat(shape = JsonFormat.Shape.STRING)
		private Long id;
    /**
     * 登录名，员工姓名全拼，如果有重复后面加数字
     */
	@TableField("login_name")
		private String loginName;
    /**
     * 登录密码，
     */
	@TableField("login_pwd")
		private String loginPwd;
    /**
     * 账号创建时间
     */
	@TableField("create_time")
		private Date createTime;
    /**
     * 账号状态 0，可用 1.禁用。默认为0
     */
		private Integer flag;
    /**
     * 上次登录时间
     */
	@TableField("last_login_time")
		private Date lastLoginTime;
    /**
     * 账号类型 0.超级管理员 1.店长 2.员工账号
     */
		private Integer type;
    /**
     * 所属门店编码
     */
	@TableField("shop_code")
		private String shopCode;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getShopCode() {
		return shopCode;
	}

	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
