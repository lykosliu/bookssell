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
@TableName("user_base_info")
public class UserBaseInfo extends Model<UserBaseInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键，自增长
     */
		@JsonFormat(shape = JsonFormat.Shape.STRING)
		private Long id;
    /**
     * 会员名字
     */
	@TableField("user_name")
		private String userName;
    /**
     * 会员手机号
     */
	@TableField("user_phone")
		private String userPhone;
    /**
     * 会员邮箱
     */
	@TableField("user_email")
		private String userEmail;
    /**
     * 状态 0：启用 1：禁用
     */
		private Integer state;
    /**
     * 会员生日，存储格式为yyyyMMdd
     */
	@TableField("user_birth")
		private String userBirth;
    /**
     * 会员积分
     */
	@TableField("user_total_score")
		private Integer userTotalScore;
    /**
     * 会员等级code
     */
	@TableField("user_level_code")
		private String userLevelCode;
    /**
     * 会员卡号
     */
	@TableField("user_card_code")
		private String userCardCode;
    /**
     * 创建时间
     */
	@TableField("create_time")
		private Date createTime;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}

	public Integer getUserTotalScore() {
		return userTotalScore;
	}

	public void setUserTotalScore(Integer userTotalScore) {
		this.userTotalScore = userTotalScore;
	}

	public String getUserLevelCode() {
		return userLevelCode;
	}

	public void setUserLevelCode(String userLevelCode) {
		this.userLevelCode = userLevelCode;
	}

	public String getUserCardCode() {
		return userCardCode;
	}

	public void setUserCardCode(String userCardCode) {
		this.userCardCode = userCardCode;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
